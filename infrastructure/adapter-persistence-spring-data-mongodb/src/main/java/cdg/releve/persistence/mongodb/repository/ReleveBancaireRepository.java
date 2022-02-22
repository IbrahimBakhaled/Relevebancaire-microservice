package cdg.releve.persistence.mongodb.repository;

import cdg.releve.persistence.mongodb.entity.ReleveBancaireEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReleveBancaireRepository extends MongoRepository<ReleveBancaireEntity, Long> {

    ReleveBancaireEntity findByReleveBancaireId(Long releveBancaireId);
}
