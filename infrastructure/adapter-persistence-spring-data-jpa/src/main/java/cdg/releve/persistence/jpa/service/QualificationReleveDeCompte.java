package cdg.releve.persistence.jpa.service;


import cdg.releve.persistence.jpa.entity.*;
import cdg.releve.persistence.jpa.repository.LigneReleveRepository;
import cdg.releve.persistence.jpa.repository.OperationCreditRepository;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@NoArgsConstructor
@Component("JPAQualificationReleveDeCompte")
public class QualificationReleveDeCompte {
    private ReleveBancaireRepository releveBancaireRepository;
    private OperationCreditRepository operationCreditRepository;
    private LigneReleveRepository ligneReleveRepository;

    public QualificationReleveDeCompte(ReleveBancaireRepository releveBancaireRepository, OperationCreditRepository operationCreditRepository, LigneReleveRepository ligneReleveRepository) {
        this.releveBancaireRepository = releveBancaireRepository;
        this.operationCreditRepository = operationCreditRepository;
        this.ligneReleveRepository = ligneReleveRepository;
    }


    public void qualificationReleveDeCompte(Long releveBancaireId) {
        Optional<ReleveBancaireEntity> releveBancaireEntity = releveBancaireRepository.findById(releveBancaireId);
        if (releveBancaireEntity.isEmpty()) {
            throw new EntityNotFoundException("ReleveBancaire are not presented in database");
        }
        List<LigneReleveEntity> ligneReleveEntities = ligneReleveRepository.findAll();

        List<LigneReleveEntity> streamedLigneReleve = ligneReleveEntities.stream()
                .filter(ligneReleve -> ligneReleve.getCreditDebit().equals("C"))
                .filter(ligneReleve -> ligneReleve.getOperationNature().contains("Virment") || ligneReleve.getOperationNature().contains("Cheque") || ligneReleve.getOperationNature().contains("Espece"))
                .collect(Collectors.toList());
        log.info(String.valueOf(streamedLigneReleve));

        List<OperationCreditEntity> operationCreditEntityList = streamedLigneReleve.stream().map(l -> {
            OperationCreditEntity returnedOperationCredit = new OperationCreditEntity();
            String operationNature = l.getOperationNature();

            if (Objects.equals(operationNature, "Virement")){
                returnedOperationCredit = new OperationVirementEntity();
            } else if (Objects.equals(operationNature, "Espece")){
                returnedOperationCredit = new OperationEspecesEntity();
            } else if (Objects.equals(operationNature, "Cheque")){
                returnedOperationCredit = new OperationChequeEntity();
            }
            returnedOperationCredit.setLigneReleve(l);
            System.out.println( "Showing returned operation credit "+ "[" + operationNature +"] " +returnedOperationCredit);
            operationCreditRepository.save(returnedOperationCredit);
            return returnedOperationCredit;

        }).collect(Collectors.toList());
        operationCreditEntityList.forEach(System.out::println);


    }
}





