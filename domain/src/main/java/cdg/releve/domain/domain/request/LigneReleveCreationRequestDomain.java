package cdg.releve.domain.domain.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LigneReleveCreationRequestDomain {

    private String operationNature;
    private String rib;
    private LocalDate dateOperation;
    private int numCheck;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private Long releveBancaireId;

    public LigneReleveCreationRequestDomain(String operationNature, String rib, LocalDate dateOperation, int numCheck, BigDecimal montant, int refCdg, int refPaiment, String modePaiment, Long releveBancaireId) {
        this.operationNature = operationNature;
        this.rib = rib;
        this.dateOperation = dateOperation;
        this.numCheck = numCheck;
        this.montant = montant;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.releveBancaireId = releveBancaireId;
    }

    public LigneReleveCreationRequestDomain() {
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
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

    public Long getReleveBancaireId() {
        return releveBancaireId;
    }

    public void setReleveBancaireId(Long releveBancaireId) {
        this.releveBancaireId = releveBancaireId;
    }
}