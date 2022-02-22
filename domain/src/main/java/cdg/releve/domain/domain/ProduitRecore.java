package cdg.releve.domain.domain;

import java.math.BigDecimal;

public class ProduitRecore {
    private String nomClient;
    private BigDecimal montant;


    public ProduitRecore(String nomClient, BigDecimal montant) {
        this.nomClient = nomClient;
        this.montant = montant;
    }


    public ProduitRecore(){
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
