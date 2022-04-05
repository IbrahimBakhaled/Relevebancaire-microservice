package cdg.releve.persistence.jpa.repository;


import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ReleveBancaireRepository extends JpaRepository<ReleveBancaireEntity, Long> {
    ReleveBancaireEntity findByReleveBancaireId(Long releveBancaireId);
}