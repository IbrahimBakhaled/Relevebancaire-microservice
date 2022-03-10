package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.CompteBancaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteBancaireRepository extends JpaRepository<CompteBancaireEntity, Integer> {
}
