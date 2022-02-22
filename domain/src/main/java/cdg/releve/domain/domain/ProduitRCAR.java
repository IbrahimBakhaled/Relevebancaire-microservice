package cdg.releve.domain.domain;

import java.math.BigDecimal;

public class ProduitRCAR {
    private String nomClient;
    private BigDecimal montant;

    public ProduitRCAR(String nomClient, BigDecimal montant) {

        this.nomClient = nomClient;
        this.montant = montant;
    }


    public ProduitRCAR(){
        super();
    }


    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
