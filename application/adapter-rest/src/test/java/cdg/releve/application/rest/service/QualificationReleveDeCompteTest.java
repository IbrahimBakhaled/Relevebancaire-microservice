package cdg.releve.application.rest.service;

import cdg.releve.persistence.jpa.entity.*;
import cdg.releve.persistence.jpa.repository.OperationCreditRepository;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;

import java.util.*;
import java.util.stream.Collectors;



class QualificationReleveDeCompteTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private OperationCreditRepository operationCreditRepository;

    @Autowired
    private ReleveBancaireRepository releveBancaireRepository;




    static ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity(1L, new Date(), "Releve Label", 14, 147, 15, BigDecimal.valueOf(147.47), BigDecimal.valueOf(162.24), getLignes());



    private static List<LigneReleveEntity> getLignes() {
        return List.of(
                new LigneReleveEntity(14L, new Date(), "Virment", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(15L, new Date(), "Cheque", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(16L, new Date(), "Virment", BigDecimal.valueOf(1879564.12), "D", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(17L, new Date(), "Espece", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(18L, new Date(), "Virment", BigDecimal.valueOf(1879564.12), "D", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(19L, new Date(), "Nothing", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(20L, new Date(), "Virment", BigDecimal.valueOf(1879564.12), "D", 147895, 166698, "mode_Paiment_Test", null),
                new LigneReleveEntity(21L, new Date(), "Also Nothing", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "mode_Paiment_Test", null)
        );
    }

//    @Test
//     void qualificationReleveDeCompte() {
//        List<LigneReleveEntity> ligneReleveEntities = getLignes();
//        List<LigneReleveEntity> ligneReleveEntities1 =
//        ligneReleveEntities.stream()
//                .filter(ligneReleve -> ligneReleve.getCreditDebit().equals("C"))
//                .collect(Collectors.toList());
//        ligneReleveEntities1.forEach(System.out::println);
//
//    }


    @Test
    void testingFiltrage() {

        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity(1L, new Date(), "Releve Label", 14, 147, 15, BigDecimal.valueOf(147.47), BigDecimal.valueOf(162.24), getLignes());
        if (releveBancaireEntity.getReleveBancaireId() == null) {
            throw new EntityNotFoundException("ReleveBancaire are not presented in database");
        }
        List<LigneReleveEntity> ligneReleveEntities = getLignes();
        List<LigneReleveEntity> ligneReleveEntities1=
                ligneReleveEntities.stream()
                        .filter(ligneReleve -> ligneReleve.getCreditDebit().equals("C"))
                        .filter(ligneReleve -> ligneReleve.getOperationNature().contains("Virment") || ligneReleve.getOperationNature().contains("Cheque") || ligneReleve.getOperationNature().contains("Espece"))
                        .collect(Collectors.toList());
        ligneReleveEntities1.forEach(System.out::println);
        System.out.println("===========================");

        List<OperationCreditEntity> operationCreditEntityList = ligneReleveEntities1.stream()
                .map( l -> {
            OperationCreditEntity operationCreditEntity = new OperationCreditEntity();
//            operationCreditEntity.setLigneReleve(l);
            String operationNature = l.getOperationNature();
            OperationCreditEntity returnedOperationCredit = null;

            if ("Virement".equals(operationNature)){
                returnedOperationCredit = new OperationVirementEntity();
            } else if ("Espece".equals(operationNature)){
                returnedOperationCredit = new OperationEspecesEntity();
            } else if (operationNature.equals("Cheque")) {
                returnedOperationCredit = new OperationChequeEntity();
            }
            else {
                throw  new RuntimeException(" ||||||| this operation doesnt have any of virement,cheque,especes ||||||||");
            }
            returnedOperationCredit.setLigneReleve(l);
            return operationCreditEntity;
        })
                .collect(Collectors.toList());
//        operationCreditEntityList.forEach(System.out::println);
//        OperationCreditEntity opC = new OperationCreditEntity();
//        opC.setLigneReleve(new LigneReleveEntity(21L, new Date(), "Virement", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "VISA", releveBancaireEntity));
//        LigneReleveEntity ligneReleveEntity = new LigneReleveEntity(21L, new Date(), "Virement", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "VISA", releveBancaireEntity);
//        String operationNature = ligneReleveEntity.getOperationNature();
//        OperationCreditEntity returnedOperationCredit = null;
//        if (Objects.equals(opC.getLigneReleve().getOperationNature(), "Virement")){
//            returnedOperationCredit = new OperationVirementEntity();
//        } else if (Objects.equals(opC.getLigneReleve().getOperationNature(), "Espece")){
//            returnedOperationCredit = new OperationEspecesEntity();
//        } else if (Objects.equals(opC.getLigneReleve().getOperationNature(), "Cheque")) {
//            returnedOperationCredit = new OperationChequeEntity();
//        }
//         else {
//            throw  new RuntimeException(" ||||||| this operation doesnt have any of virement,cheque,especes ||||||||");
//        }
//        returnedOperationCredit.setLigneReleve(ligneReleveEntity);
//        System.out.println(returnedOperationCredit);
    }



    @Test
    void  qualifierNatureOp() {

        OperationCreditEntity opC = new OperationCreditEntity();
        opC.setLigneReleve(new LigneReleveEntity(21L, new Date(), "Virement", BigDecimal.valueOf(1879564.12), "C", 147895, 166698, "VISA", releveBancaireEntity));
        if (Objects.equals(opC.getLigneReleve().getOperationNature(), "Virement")){
            opC.setDtype("Virement");
            System.out.println(opC);
//            operationCreditRepository.save(opC);
        }else {
            throw  new RuntimeException(" ||||||| this operation doesnt have any of virement,cheque,especes ||||||||");
        }
    }






    }

