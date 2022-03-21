package cdg.releve.domain.domain.request;


import cdg.releve.domain.domain.ReleveBancaire;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LigneReleveCreationRequestDomain {

    private String operationNature;
    private BigDecimal creditDebit;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private ReleveBancaireCreationRequestDomain releveBancaire;

    public LigneReleveCreationRequestDomain(String operationNature, BigDecimal creditDebit, BigDecimal montant, int refCdg, int refPaiment, String modePaiment, ReleveBancaireCreationRequestDomain releveBancaire) {
        this.operationNature = operationNature;
        this.creditDebit = creditDebit;
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

    public ReleveBancaireCreationRequestDomain getReleveBancaire() {
        return releveBancaire;
    }

    public void setReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire) {
        this.releveBancaire = releveBancaire;
    }
}