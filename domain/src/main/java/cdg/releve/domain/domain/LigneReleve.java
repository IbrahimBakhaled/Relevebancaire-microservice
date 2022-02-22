package cdg.releve.domain.domain;

import java.math.BigDecimal;
import java.util.Date;

public class LigneReleve {

    private Long ligneReleveId;
    private Date dateOperation;
    private String operationNature;
    private String rib;
    private int numCheck;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;


    public LigneReleve(){
        super();
    }

    public LigneReleve(Long ligneReleveId, Date dateOperation, String operationNature, String rib, int numCheck, BigDecimal montant, BigDecimal creditDebit, int refCdg, int refPaiment, String modePaiment) {
        this.ligneReleveId = ligneReleveId;
        this.dateOperation = dateOperation;
        this.operationNature = operationNature;
        this.rib = rib;
        this.numCheck = numCheck;
        this.montant = montant;
        this.creditDebit = creditDebit;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
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

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
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
}
