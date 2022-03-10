package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.BanqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRepository extends JpaRepository<BanqueEntity, Integer> {
}
