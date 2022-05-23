package cdg.releve.persistence.jpa.mock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
* cdg.releve.persistence.jpa.mock
* 17/05/2022
* relevebancaire-microservice
**/




@Entity
@Table(name = "Mock_Acteur_tbl")
@Data
public class MockActeur {



  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int acteurId;
  private String nomActeur;
  private String prenomActeur;
}
