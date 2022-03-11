package cdg.releve.persistence.jpa.adapter;

import cdg.releve.domain.domain.LigneReleve;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.entity.CEntity;
import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import cdg.releve.persistence.jpa.entity.OperationEspecesEntity;
import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import cdg.releve.persistence.jpa.repository.LigneReleveRepository;
import cdg.releve.persistence.jpa.repository.OperationCreditRepository;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReleveBancaireSpringJpaAdapter implements ReleveBancairePersistencePort {

    private ReleveBancaireRepository releveBancaireRepository;
    private LigneReleveRepository ligneReleveRepository;
    private OperationCreditRepository operationCreditRepository;


    public ReleveBancaireSpringJpaAdapter(ReleveBancaireRepository releveBancaireRepository, LigneReleveRepository ligneReleveRepository, OperationCreditRepository operationCreditRepository) {
        this.releveBancaireRepository = releveBancaireRepository;
        this.ligneReleveRepository = ligneReleveRepository;
        this.operationCreditRepository = operationCreditRepository;
    }


    @Override
    public void addReleveBancaire(ReleveBancaire releveBancaire) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        BeanUtils.copyProperties(releveBancaire, releveBancaireEntity);
//        List<LigneReleveEntity> listCollection =
//        releveBancaireEntity.getLignereleve().stream().map(l -> {
//            LigneReleveEntity ligneReleveEntity = new LigneReleveEntity();
//            BeanUtils.copyProperties(l,ligneReleveEntity);
//            return ligneReleveEntity;
//        }).collect(Collectors.toList());
//        releveBancaireEntity.setLignereleve(listCollection);
//        releveBancaireEntity.setterOfList();
        releveBancaireRepository.save(releveBancaireEntity);
    }

    @Override
    public void removeReleveBancaire(ReleveBancaire releveBancaire) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        BeanUtils.copyProperties(releveBancaire, releveBancaireEntity);
        releveBancaireRepository.delete(releveBancaireEntity);
    }

    @Override
    public List<ReleveBancaire> getReleveBancaires() {

        List<ReleveBancaire> releveBancaireList = new ArrayList<ReleveBancaire>();
        List<ReleveBancaireEntity> releveBancaireEntityList = releveBancaireRepository.findAll();
        for (ReleveBancaireEntity releveBancaireEntity : releveBancaireEntityList){
            ReleveBancaire releveBancaire = new ReleveBancaire();
            BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);
            releveBancaireList.add(releveBancaire);
        }
        return releveBancaireList;
    }

    @Override
    public ReleveBancaire getReleveBancaireById(Long releveBancaireId) {

        ReleveBancaireEntity releveBancaireEntity = releveBancaireRepository.findByReleveBancaireId(releveBancaireId);
        if (releveBancaireEntity == null){
            System.out.println("ReleveBancaireEntity not found");
        }
        ReleveBancaire releveBancaire = new ReleveBancaire();
        BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);
        return releveBancaire;
    }

    @Override
    public void deleteReleveBancaireById(Long releveBancaireId) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        ReleveBancaire releveBancaire = new ReleveBancaire();
        releveBancaireRepository.deleteById(releveBancaireId);
        if (releveBancaireEntity == null){
            System.out.println("ReleveBancaireById is not found");
        }

        BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);

    }

    @Override
    public void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve) {
        Optional<ReleveBancaireEntity> releveBancaireEntity = releveBancaireRepository.findById(ligneReleve.getReleveBancaireId());
        if (!releveBancaireEntity.isPresent()){
            throw new EntityNotFoundException("Releve Bancaire not found or ReleveBancaire is not presented in database");
        }

        LigneReleveEntity ligneReleveToCreate = new LigneReleveEntity();
        BeanUtils.copyProperties(ligneReleve, ligneReleveToCreate);
        ligneReleveToCreate.setReleveBancaire(releveBancaireEntity.get());
        LigneReleve ligneReleveFromDomain = new LigneReleve();
        BeanUtils.copyProperties(ligneReleveToCreate, ligneReleveFromDomain);
        CEntity cEntity1 = new CEntity();
        cEntity1.setOperationCreditId(ligneReleve.getOperationCreditId());

        operationCreditRepository.save(cEntity1);
        ligneReleveToCreate.setOperationCredit(cEntity1);
        BeanUtils.copyProperties(ligneReleveToCreate, cEntity1);

        ligneReleveRepository.save(ligneReleveToCreate);

//        Optional<CEntity> cEntity =  operationCreditRepository.findById(ligneReleve.getOperationCreditId());
//        if (!cEntity.isPresent()){
//            throw new EntityNotFoundException("CEntity not found or CEntity is not presented in database");
//        }

//        CEntity cEntity1 = new CEntity();
//        cEntity1.setOperationCreditId(ligneReleve.getOperationCreditId());
//
//        cEntity1 = operationCreditRepository.save(cEntity1);
//
//        LigneReleveEntity CLigneReleveEntity = new LigneReleveEntity();
//        CLigneReleveEntity.setOperationCredit(cEntity1);
//
//        LigneReleve CLigneReleve = new LigneReleve();
//
//        BeanUtils.copyProperties(CLigneReleveEntity, CLigneReleve);
//        ligneReleveRepository.save(CLigneReleveEntity);



    }

    @Override
    public void createReleveBancaire(ReleveBancaireCreationRequestDomain request) {

        ReleveBancaireEntity releveBancaire = new ReleveBancaireEntity();
        BeanUtils.copyProperties(request, releveBancaire);
        releveBancaireRepository.save(releveBancaire);
    }


}
