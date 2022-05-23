package cdg.releve.domain.domain.request;


import cdg.releve.domain.domain.ReleveBancaire;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LigneReleveCreationRequestDomain {

    private String operationNature;
    private String dateOperation;
    private String dateValue;
    private String creditDebit;
    private BigDecimal montant;
    private Long refCdg;
    private String refPaiment;
    private String modePaiment;
    private String rib;
    private String numCheck;
    private ReleveBancaireCreationRequestDomain releveBancaire;

    public LigneReleveCreationRequestDomain(String operationNature, String dateOperation,
        String dateValue, String creditDebit, BigDecimal montant, Long refCdg,
        String refPaiment, String modePaiment, String rib, String numCheck,
        ReleveBancaireCreationRequestDomain releveBancaire) {
        this.operationNature = operationNature;
        this.dateOperation = dateOperation;
        this.dateValue = dateValue;
        this.creditDebit = creditDebit;
        this.montant = montant;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.rib = rib;
        this.numCheck = numCheck;
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

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public String getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(String creditDebit) {
        this.creditDebit = creditDebit;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Long getRefCdg() {
        return refCdg;
    }

    public void setRefCdg(Long refCdg) {
        this.refCdg = refCdg;
    }

    public String getRefPaiment() {
        return refPaiment;
    }

    public void setRefPaiment(String refPaiment) {
        this.refPaiment = refPaiment;
    }

    public String getModePaiment() {
        return modePaiment;
    }

    public void setModePaiment(String modePaiment) {
        this.modePaiment = modePaiment;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getNumCheck() {
        return numCheck;
    }

    public void setNumCheck(String numCheck) {
        this.numCheck = numCheck;
    }

    public ReleveBancaireCreationRequestDomain getReleveBancaire() {
        return releveBancaire;
    }

    public void setReleveBancaire(
        ReleveBancaireCreationRequestDomain releveBancaire) {
        this.releveBancaire = releveBancaire;
    }
}
