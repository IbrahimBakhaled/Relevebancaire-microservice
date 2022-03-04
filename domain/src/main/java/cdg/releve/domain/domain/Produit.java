package cdg.releve.domain.domain;

public class Produit {

    private Long produitId;
    private String produitCode;
    private String produitLabel;



    public Produit(){
        super();
    }

    public Produit(Long produitId, String produitCode, String produitLabel) {

        this.produitId = produitId;
        this.produitCode = produitCode;
        this.produitLabel = produitLabel;

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
