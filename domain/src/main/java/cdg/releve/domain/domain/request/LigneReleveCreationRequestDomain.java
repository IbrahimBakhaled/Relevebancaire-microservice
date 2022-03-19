package cdg.releve.domain.domain.request;

import cdg.releve.domain.domain.OperationCheque;
import cdg.releve.domain.domain.OperationEspeces;
import cdg.releve.domain.domain.OperationVirement;
import cdg.releve.domain.domain.ReleveBancaire;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LigneReleveCreationRequestDomain {

    private String operationNature;
    private BigDecimal creditDebit;
    private LocalDate dateOperation;
    private int numCheck;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private ReleveBancaire releveBancaire;

    public LigneReleveCreationRequestDomain(String operationNature, BigDecimal creditDebit, LocalDate dateOperation, int numCheck, BigDecimal montant, int refCdg, int refPaiment, String modePaiment, ReleveBancaire releveBancaire) {
        this.operationNature = operationNature;
        this.creditDebit = creditDebit;
        this.dateOperation = dateOperation;
        this.numCheck = numCheck;
        this.montant = montant;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.releveBancaire = releveBancaire;
    }

    public LigneReleveCreationRequestDomain() {
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
    }

    public BigDecimal getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(BigDecimal creditDebit) {
        this.creditDebit = creditDebit;
    }

    public LocalDate getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(LocalDate dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getNumCheck() {
        return numCheck;
    }

    public void setNumCheck(int numCheck) {
        this.numCheck = numCheck;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
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