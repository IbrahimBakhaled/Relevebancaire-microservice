package cdg.releve.domain.domain;

public class Produit {

    private Long produitId;
    private String produitCode;
    private String produitLabel;
    private ProduitRecore produitRecore;
    private ProduitRCAR produitRCAR;


    public Produit(){
        super();
    }

    public Produit(Long produitId, String produitCode, String produitLabel, ProduitRecore produitRecore, ProduitRCAR produitRCAR) {

        this.produitId = produitId;
        this.produitCode = produitCode;
        this.produitLabel = produitLabel;
        this.produitRecore = produitRecore;
        this.produitRCAR = produitRCAR;
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

    public ProduitRecore getProduitRecore() {
        return produitRecore;
    }

    public void setProduitRecore(ProduitRecore produitRecore) {
        this.produitRecore = produitRecore;
    }

    public ProduitRCAR getProduitRCAR() {
        return produitRCAR;
    }

    public void setProduitRCAR(ProduitRCAR produitRCAR) {
        this.produitRCAR = produitRCAR;
    }
}
