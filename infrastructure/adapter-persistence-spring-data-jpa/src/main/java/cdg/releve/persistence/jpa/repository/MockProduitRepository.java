package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.mock.MockProduit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * cdg.releve.persistence.jpa.repository 17/05/2022 relevebancaire-microservice
 **/
public interface MockProduitRepository extends JpaRepository<MockProduit, Integer> {

}
