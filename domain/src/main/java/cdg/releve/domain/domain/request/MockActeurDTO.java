package cdg.releve.domain.domain.request;

/**
 * cdg.releve.domain.domain.request 17/05/2022 relevebancaire-microservice
 **/
public class MockActeurDTO {


  private int acteurId;
  private String nomActeur;
  private String prenomActeur;

  public MockActeurDTO(int acteurId, String nomActeur, String prenomActeur) {
    this.acteurId = acteurId;
    this.nomActeur = nomActeur;
    this.prenomActeur = prenomActeur;
  }

  public MockActeurDTO() {
  }

  public int getActeurId() {
    return acteurId;
  }

  public void setActeurId(int acteurId) {
    this.acteurId = acteurId;
  }

  public String getNomActeur() {
    return nomActeur;
  }

  public void setNomActeur(String nomActeur) {
    this.nomActeur = nomActeur;
  }

  public String getPrenomActeur() {
    return prenomActeur;
  }

  public void setPrenomActeur(String prenomActeur) {
    this.prenomActeur = prenomActeur;
  }
}
