package cdg.releve.persistence.jpa.repository;


import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(collectionResourceRel = "relevebancaire", path= "relevebancaire")
public interface ReleveBancaireRepository extends JpaRepository<ReleveBancaireEntity, Long> {
    ReleveBancaireEntity findByReleveBancaireId(Long releveBancaireId);
}