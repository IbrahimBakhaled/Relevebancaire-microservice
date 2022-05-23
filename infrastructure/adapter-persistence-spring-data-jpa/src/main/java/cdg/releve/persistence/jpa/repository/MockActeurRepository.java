package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.ActeurEntity;
import cdg.releve.persistence.jpa.mock.MockActeur;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * cdg.releve.persistence.jpa.repository 17/05/2022 relevebancaire-microservice
 **/
public interface MockActeurRepository extends JpaRepository<MockActeur, Integer> {

  @Query("SELECT a FROM MockActeur a WHERE " +
      "a.nomActeur LIKE CONCAT('%',:query, '%')" +
      "Or a.prenomActeur LIKE CONCAT('%', :query, '%')")
  List<MockActeur> searchMockActeurs(@Param("query") String query);

}
