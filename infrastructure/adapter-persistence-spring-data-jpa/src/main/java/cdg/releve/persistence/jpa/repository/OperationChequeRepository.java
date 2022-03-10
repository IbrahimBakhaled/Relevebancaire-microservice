package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.OperationChequeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationChequeRepository extends JpaRepository<OperationChequeEntity, Integer> {

}
