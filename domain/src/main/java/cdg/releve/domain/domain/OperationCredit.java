package cdg.releve.domain.domain;

import java.util.Date;

public class OperationCredit {

    private Long operationCreditId;
    private Date operationDate;
    private String dtype;
    private LigneReleve ligneReleve;

    public OperationCredit(Long operationCreditId, Date operationDate, String dtype, LigneReleve ligneReleve) {
        this.operationCreditId = operationCreditId;
        this.operationDate = operationDate;
        this.dtype = dtype;
        this.ligneReleve = ligneReleve;
    }

    public OperationCredit() {
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

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public LigneReleve getLigneReleve() {
        return ligneReleve;
    }

    public void setLigneReleve(LigneReleve ligneReleve) {
        this.ligneReleve = ligneReleve;
    }
}
