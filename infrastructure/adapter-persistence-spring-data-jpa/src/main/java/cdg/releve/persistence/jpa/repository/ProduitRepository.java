package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<ProduitEntity,Long> {
}
