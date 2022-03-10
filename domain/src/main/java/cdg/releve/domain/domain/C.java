package cdg.releve.domain.domain;

import java.util.Date;

public class C {

    private Long operationCreditId;
    private Date operationDate;
    private OperationCheque operationCheque;
    private OperationEspeces operationEspeces;
    private OperationVirement operationVirement;
    private Produit produit;


    public C(Long operationCreditId, Date operationDate, OperationCheque operationCheque, OperationEspeces operationEspeces, OperationVirement operationVirement, Produit produit) {
        this.operationCreditId = operationCreditId;
        this.operationDate = operationDate;
        this.operationCheque = operationCheque;
        this.operationEspeces = operationEspeces;
        this.operationVirement = operationVirement;
        this.produit = produit;
    }

    public C(){
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
