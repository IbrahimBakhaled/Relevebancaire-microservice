package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.OperationCreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationCreditRepository extends JpaRepository<OperationCreditEntity, Long> {
}
