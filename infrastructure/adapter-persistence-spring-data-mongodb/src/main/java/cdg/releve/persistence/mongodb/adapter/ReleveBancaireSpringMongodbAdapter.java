package cdg.releve.persistence.mongodb.adapter;

import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.mongodb.entity.ReleveBancaireEntity;
import cdg.releve.persistence.mongodb.repository.ReleveBancaireRepository;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReleveBancaireSpringMongodbAdapter implements ReleveBancairePersistencePort {

    private ReleveBancaireRepository releveBancaireRepository;

    public ReleveBancaireSpringMongodbAdapter(ReleveBancaireRepository releveBancaireRepository) {
        this.releveBancaireRepository = releveBancaireRepository;
    }

    @Override
    public void addReleveBancaire(ReleveBancaire releveBancaire) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        BeanUtils.copyProperties(releveBancaire, releveBancaireEntity);
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


}
