package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


//@ExtendWith(SpringExtension.class)
@DataJpaTest
//@ActiveProfiles(value = "dev")
@SpringBootTest
class ReleveBancaireRepositoryTest {

    @Autowired
    ReleveBancaireRepository releveBancaireRepository;


    @Test
    public void createrelevebancaire(){
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity(
                1L,
                null,
                "Label-Test",
                14,
                12,
                13,
                BigDecimal.valueOf(478.14),
                BigDecimal.valueOf(478.14),
                "status_Test",
                null);


        ReleveBancaireEntity savedReleveBancaire = releveBancaireRepository.save(releveBancaireEntity);

        Assertions.assertEquals(releveBancaireEntity.getLabel(),savedReleveBancaire.getLabel(),"createrelevebancaire");
        Assertions.assertEquals(releveBancaireEntity.getNbrLignes(), savedReleveBancaire.getNbrLignes(), "createrelevebancaire");
    }

    @Test
    public void findByReleveBancaireId(){

        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity(
                1L,
                null,
                "Label-Test",
                14,
                12,
                13,
                BigDecimal.valueOf(478.14),
                BigDecimal.valueOf(478.14),
                "statsu_Test",
                null);
        ReleveBancaireEntity savedReleveBancaire = releveBancaireRepository.save(releveBancaireEntity);
        Optional<ReleveBancaireEntity> releveBancaire = releveBancaireRepository.findById(releveBancaireEntity.getReleveBancaireId());
        releveBancaire.ifPresent(value -> Assertions.assertEquals(savedReleveBancaire.getReleveBancaireId(),value.getReleveBancaireId()));


    }

}
