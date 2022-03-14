package cdg.releve.domain.domain.request;

public class ProduitCreationRequestDomain {

    private Long produitId;
    private String produitCode;
    private String produitLabel;


    public ProduitCreationRequestDomain(Long produitId, String produitCode, String produitLabel) {
        this.produitId = produitId;
        this.produitCode = produitCode;
        this.produitLabel = produitLabel;
    }

    public ProduitCreationRequestDomain() {
    }


    public Long getProduitId() {
        return produitId;
    }

    public void setProduitId(Long produitId) {
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
