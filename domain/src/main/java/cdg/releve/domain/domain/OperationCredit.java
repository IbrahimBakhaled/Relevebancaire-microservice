package cdg.releve.domain.domain;

import java.util.Date;

public class OperationCredit {

    private Long operationCreditId;
    private Date operationDate;
//    private OperationCheque operationCheque;
//    private OperationEspeces operationEspeces;
//    private OperationVirement operationVirement;
    private Produit produit;
    private LigneReleve ligneReleve;


    public OperationCredit(Long operationCreditId, Date operationDate, Produit produit, LigneReleve ligneReleve) {
        this.operationCreditId = operationCreditId;
        this.operationDate = operationDate;
        this.produit = produit;
        this.ligneReleve = ligneReleve;
    }

    public OperationCredit(){
        super();
    }

    public Long getOperationCreditId() {
        return operationCreditId;
    }

    public void setOperationCreditId(Long operationCreditId) {
        this.operationCreditId = operationCreditId;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

//    public OperationCheque getOperationCheque() {
//        return operationCheque;
//    }
//
//    public void setOperationCheque(OperationCheque operationCheque) {
//        this.operationCheque = operationCheque;
//    }
//
//    public OperationEspeces getOperationEspeces() {
//        return operationEspeces;
//    }
//
//    public void setOperationEspeces(OperationEspeces operationEspeces) {
//        this.operationEspeces = operationEspeces;
//    }
//
//    public OperationVirement getOperationVirement() {
//        return operationVirement;
//    }
//
//    public void setOperationVirement(OperationVirement operationVirement) {
//        this.operationVirement = operationVirement;
//    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }


    public LigneReleve getLigneReleve() {
        return ligneReleve;
    }

    public void setLigneReleve(LigneReleve ligneReleve) {
        this.ligneReleve = ligneReleve;
    }
}
