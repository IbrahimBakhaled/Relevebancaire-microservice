package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.ChequeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChequeRepository extends JpaRepository<ChequeEntity, Integer> {
}
