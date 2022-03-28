
import cdg.releve.Application;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;
import cdg.releve.persistence.jpa.adapter.ReleveBancaireSpringJpaAdapter;
import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = cdg.releve.application.rest.controller.ReleveBancaireControllerImpl.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ReleveBancaireControllerImplTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ReleveBancaireSpringJpaAdapter releveBancaireSpringJpaAdapter;

    @MockBean
    ReleveBancaireRepository releveBancaireRepository;

    @MockBean
    ReleveBancaireEntity releveBancaireEntity;


    private static final String LABEL = "Releve Bancaire Label File";
    private static final int NBRLIGNES = 14;
    private static final BigDecimal SOLDEINITIAL = BigDecimal.valueOf(1478.25);
    private static final BigDecimal SOLDEFINAL = BigDecimal.valueOf(1896.65);
    private static final int NBROPERATIONCREDIT = 18;
    private static final int NBROPERATIONDEBIT = 64;




    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void saveReleveBancaire() throws Exception{

        Mockito.when(releveBancaireEntity.fromReleveBancaireTo(Mockito.<ReleveBancaireCreationRequestDomain>any())).thenReturn(createMockModel());

        ObjectMapper json = new ObjectMapper();


        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/relevebancaire")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json.writeValueAsString(createMockRequest()))
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(MockMvcResultMatchers.status().isOk());
    }


    private ReleveBancaireCreationRequestDomain createMockRequest(){
        ReleveBancaireCreationRequestDomain request = new ReleveBancaireCreationRequestDomain();
        List<LigneReleveCreationRequestDomain> ligne = new ArrayList<>();
        ligne.forEach(l -> {
            l.setReleveBancaire(request);
            l.setCreditDebit(BigDecimal.valueOf(1478.214));
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
        System.out.println(ligne);
        return request;

    }





    private ReleveBancaireEntity createMockModel(){
        return ReleveBancaireEntity.builder().label(LABEL)
                .nbrLignes(NBRLIGNES)
                .nbrOperationCredit(NBROPERATIONCREDIT)
                .soldeInitial(SOLDEINITIAL)
                .soleFinal(SOLDEFINAL)
                .nbrOperationCredit(NBROPERATIONCREDIT)
                .build();
    }




}