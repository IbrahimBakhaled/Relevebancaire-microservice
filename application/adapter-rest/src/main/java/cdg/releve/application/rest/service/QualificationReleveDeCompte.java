package cdg.releve.application.rest.service;

import cdg.releve.domain.domain.LigneReleve;
import cdg.releve.domain.domain.OperationCredit;
import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import cdg.releve.persistence.jpa.entity.OperationCreditEntity;
import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import cdg.releve.persistence.jpa.repository.LigneReleveRepository;
import cdg.releve.persistence.jpa.repository.OperationCreditRepository;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

//@Service
public class QualificationReleveDeCompte {


    private ReleveBancaireRepository releveBancaireRepository;
    private OperationCreditRepository operationCreditRepository;
    private LigneReleveRepository ligneReleveRepository;


    public QualificationReleveDeCompte(ReleveBancaireRepository releveBancaireRepository, OperationCreditRepository operationCreditRepository, LigneReleveRepository ligneReleveRepository) {
        this.releveBancaireRepository = releveBancaireRepository;
        this.operationCreditRepository = operationCreditRepository;
        this.ligneReleveRepository = ligneReleveRepository;
    }


    private void qualificationReleveDeCompte(Long releveBancaireId) {
        Optional<ReleveBancaireEntity> releveBancaireEntity = releveBancaireRepository.findById(releveBancaireId);
        if (!releveBancaireEntity.isPresent()) {
            throw new EntityNotFoundException("ReleveBancaire are not presented in database");
        }

        List<LigneReleveEntity> ligneReleveEntities = ligneReleveRepository.findAll();
        List<LigneReleveEntity> streamedLigneReleve = ligneReleveEntities.stream()
                .filter(entity -> entity.getCreditDebit().equals("C"))
                .collect(Collectors.toList());
        streamedLigneReleve.forEach(System.out::println);


    }
}





