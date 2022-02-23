package cdg.releve.domain.domain;

import java.util.Date;

public class OperationCredit {

    private Date operationDate;
    private OperationCheque operationCheque;
    private OperationEspeces operationEspeces;
    private OperationVirement operationVirement;
    private Produit produit;


    public OperationCredit(Date operationDate, OperationCheque operationCheque, OperationEspeces operationEspeces, OperationVirement operationVirement, Produit produit) {
        this.operationDate = operationDate;
        this.operationCheque = operationCheque;
        this.operationEspeces = operationEspeces;
        this.operationVirement = operationVirement;
        this.produit = produit;
    }

    public OperationCredit(){
        super();
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public OperationCheque getOperationCheque() {
        return operationCheque;
    }

    public void setOperationCheque(OperationCheque operationCheque) {
        this.operationCheque = operationCheque;
    }

    public OperationEspeces getOperationEspeces() {
        return operationEspeces;
    }

    public void setOperationEspeces(OperationEspeces operationEspeces) {
        this.operationEspeces = operationEspeces;
    }

    public OperationVirement getOperationVirement() {
        return operationVirement;
    }

    public void setOperationVirement(OperationVirement operationVirement) {
        this.operationVirement = operationVirement;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
