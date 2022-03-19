package cdg.releve.domain.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class LigneReleve{

    private Long ligneReleveId;
    private Date dateOperation;
    private String operationNature;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private ReleveBancaire releveBancaire;
    public LigneReleve() {}

    public LigneReleve(Long ligneReleveId, Date dateOperation, String operationNature, BigDecimal montant, BigDecimal creditDebit, int refCdg, int refPaiment, String modePaiment, ReleveBancaire releveBancaire) {
        this.ligneReleveId = ligneReleveId;
        this.dateOperation = dateOperation;
        this.operationNature = operationNature;
        this.montant = montant;
        this.creditDebit = creditDebit;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.releveBancaire = releveBancaire;
    }

    public Long getLigneReleveId() {
        return ligneReleveId;
    }

    public void setLigneReleveId(Long ligneReleveId) {
        this.ligneReleveId = ligneReleveId;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BigDecimal getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(BigDecimal creditDebit) {
        this.creditDebit = creditDebit;
    }

    public int getRefCdg() {
        return refCdg;
    }

    public void setRefCdg(int refCdg) {
        this.refCdg = refCdg;
    }

    public int getRefPaiment() {
        return refPaiment;
    }

    public void setRefPaiment(int refPaiment) {
        this.refPaiment = refPaiment;
    }

    public String getModePaiment() {
        return modePaiment;
    }

    public void setModePaiment(String modePaiment) {
        this.modePaiment = modePaiment;
    }

    public ReleveBancaire getReleveBancaire() {
        return releveBancaire;
    }

    public void setReleveBancaire(ReleveBancaire releveBancaire) {
        this.releveBancaire = releveBancaire;
    }
}


