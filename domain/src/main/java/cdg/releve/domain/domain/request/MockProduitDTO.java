package cdg.releve.domain.domain.request;

/**
 * cdg.releve.domain.domain.request 17/05/2022 relevebancaire-microservice
 **/
public class MockProduitDTO {
  
  private int produitId;
  private String produitCode;
  private String produitLabel;

  public MockProduitDTO(int produitId, String produitCode, String produitLabel) {
    this.produitId = produitId;
    this.produitCode = produitCode;
    this.produitLabel = produitLabel;
  }

  public MockProduitDTO() {
  }

  public int getProduitId() {
    return produitId;
  }

  public void setProduitId(int produitId) {
    this.produitId = produitId;
  }

  public String getProduitCode() {
    return produitCode;
  }

  public void setProduitCode(String produitCode) {
    this.produitCode = produitCode;
  }

  public String getProduitLabel() {
    return produitLabel;
  }

  public void setProduitLabel(String produitLabel) {
    this.produitLabel = produitLabel;
  }
}
