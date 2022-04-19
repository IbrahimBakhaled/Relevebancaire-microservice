package cdg.releve.application.rest.service;

import cdg.releve.persistence.jpa.entity.*;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;



class QualificationReleveDeCompteTest {

    static ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity(1L, new Date(), "Releve Label", 14, 147, 15, BigDecimal.valueOf(147.47), BigDecimal.valueOf(162.24), getLignes());

    private static List<LigneReleveEntity> getLignes() {
        return List.of(
                new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Virment", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Espece", BigDecimal.valueOf(1879564.12), "D", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Cheque", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Espece", BigDecimal.valueOf(1879564.12), "D", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Cheque", BigDecimal.valueOf(1879564.12), "Something", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Virment", BigDecimal.valueOf(1879564.12), "D", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Espece", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Cheque", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Virment", BigDecimal.valueOf(1879564.12), "D", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Espece", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Cheque", BigDecimal.valueOf(1879564.12), "Something", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Virement", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null),
            new LigneReleveEntity(14L, new Date(),new Date(),"147852369547","14569772", "Espece", BigDecimal.valueOf(1879564.12), "C", 147895L, "166698", "mode_Paiment_Test", null)

        );
    }

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

        List<OperationCreditEntity> operationCreditEntityList = ligneReleveEntities1.stream().map(l -> {
//            System.out.println(l);
            String operationNature = l.getOperationNature();
//            System.out.println("Shwoing operation nature ===> " + operationNature);
            OperationCreditEntity returnedOperationCredit = new OperationCreditEntity();
            if (Objects.equals(operationNature, "Virement")){
                returnedOperationCredit = new OperationVirementEntity();
            } else if (Objects.equals(operationNature, "Espece")){
                returnedOperationCredit = new OperationEspecesEntity();
            } else if (Objects.equals(operationNature, "Cheque")){
                returnedOperationCredit = new OperationChequeEntity();
            }
            returnedOperationCredit.setLigneReleve(l);
            System.out.println( "Showing returned operation credit "+ "[" + operationNature +"] " +returnedOperationCredit);
            return returnedOperationCredit;

        }).collect(Collectors.toList());
        operationCreditEntityList.forEach(System.out::println);
    }
    }

