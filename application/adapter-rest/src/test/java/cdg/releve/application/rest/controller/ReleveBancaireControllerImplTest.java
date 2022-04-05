package cdg.releve.application.rest.controller;

import cdg.releve.application.rest.BootloaderApplicationLauncher;
import cdg.releve.application.rest.mapper.ReleveBancaireDtoMapper;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.persistence.jpa.entity.request.LigneReleveCreationRequest;
import cdg.releve.persistence.jpa.entity.request.ReleveBancaireCreationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;



//@ExtendWith(SpringExtension.class)
////@WebMvcTest(controllers = ReleveBancaireControllerImpl.class)
//@SpringBootTest(classes = BootloaderApplicationLauncher.class,
//        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = ReleveBancaireControllerImpl.class)
@SpringBootTest(classes = BootloaderApplicationLauncher.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ReleveBancaireControllerImplTest {

    @Autowired
    private MockMvc mockMvc;
    private WebApplicationContext webApplicationContext;
    @MockBean
    ReleveBancaireDtoMapper mapper;


    private static final String LABEL = "Releve Bancaire Label File";
    private static final int NBRLIGNES = 14;
    private static final BigDecimal SOLDEINITIAL = BigDecimal.valueOf(1478.25);
    private static final BigDecimal SOLDEFINAL = BigDecimal.valueOf(1896.65);
    private static final int NBROPERATIONCREDIT = 18;
    private static final int NBROPERATIONDEBIT = 64;


    @Before
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    void saveReleveBancaireTest() throws Exception{
        Mockito.when(mapper.toModel(Mockito.any())).thenReturn(createMockModel());
        Mockito.when(mapper.toDto(Mockito.any())).thenReturn(createResponse());

        ObjectMapper json = new ObjectMapper();


        mockMvc.perform(
                MockMvcRequestBuilders.post("/relevebancaire")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json.writeValueAsString(createMockRequest()))
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(MockMvcResultMatchers.status().isOk());
    }


    private ReleveBancaireCreationRequest createMockRequest(){
        ReleveBancaireCreationRequest request = new ReleveBancaireCreationRequest();


        List<LigneReleveCreationRequest> ligne = new ArrayList<>();
        ligne.forEach(l -> {
            l.setReleveBancaireCreationRequest(request);
            l.setCreditDebit("C");
            l.setMontant(BigDecimal.valueOf(1487.69));
            l.setRefCdg(147);
            l.setOperationNature("OP_Nature_Mockito");
            l.setModePaiment("Ref_Paiment_Mockito");
            l.setRefPaiment(156);
            ligne.add(l);
        });



        request.setLabel(LABEL);
        request.setNbrLignes(NBRLIGNES);
        request.setSoldeInitial(SOLDEINITIAL);
        request.setSoleFinal(SOLDEFINAL);
        request.setNbrOperationCredit(NBROPERATIONCREDIT);
        request.setLignereleve(ligne);
        return request;
    }

    private ReleveBancaire createMockModel(){
        return ReleveBancaire.builder().label(LABEL)
                .nbrLignes(NBRLIGNES)
                .nbrOperationCredit(NBROPERATIONCREDIT)
                .soldeInitial(SOLDEINITIAL)
                .soleFinal(SOLDEFINAL)
                .nbrOperationCredit(NBROPERATIONCREDIT)
                .build();
    }


    private ReleveBancaireCreationRequest createResponse(){
        ReleveBancaireCreationRequest response = new ReleveBancaireCreationRequest();

        List<LigneReleveCreationRequest> ligne = new ArrayList<>();
        ligne.forEach(l -> {
            l.setReleveBancaireCreationRequest(response);
            l.setCreditDebit("C");
            l.setMontant(BigDecimal.valueOf(1487.69));
            l.setRefCdg(147);
            l.setOperationNature("OP_Nature_Mockito");
            l.setModePaiment("Ref_Paiment_Mockito");
            l.setRefPaiment(156);
            ligne.add(l);
        });

        response.setLabel(LABEL);
        response.setNbrLignes(NBRLIGNES);
        response.setSoldeInitial(SOLDEINITIAL);
        response.setSoleFinal(SOLDEFINAL);
        response.setNbrOperationCredit(NBROPERATIONCREDIT);
        response.setLignereleve(ligne);
        return response;
    }

    }


