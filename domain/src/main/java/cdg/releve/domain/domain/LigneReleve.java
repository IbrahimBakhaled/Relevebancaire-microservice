package cdg.releve.domain.domain;


import java.math.BigDecimal;


public class LigneReleve {

  private Long ligneReleveId;
  private String dateOperation;
  private String dateValue;
  private String operationNature;
  private BigDecimal montant;
  private String creditDebit;
  private Long refCdg;
  private String refPaiment;
  private String modePaiment;
  private String rib;
  private String numCheck;
  private ReleveBancaire releveBancaire;

  public LigneReleve(Long ligneReleveId, String dateOperation, String dateValue,
      String operationNature, BigDecimal montant, String creditDebit, Long refCdg,
      String refPaiment, String modePaiment, String rib, String numCheck,
      ReleveBancaire releveBancaire) {
    this.ligneReleveId = ligneReleveId;
    this.dateOperation = dateOperation;
    this.dateValue = dateValue;
    this.operationNature = operationNature;
    this.montant = montant;
    this.creditDebit = creditDebit;
    this.refCdg = refCdg;
    this.refPaiment = refPaiment;
    this.modePaiment = modePaiment;
    this.rib = rib;
    this.numCheck = numCheck;
    this.releveBancaire = releveBancaire;
  }

  public LigneReleve() {
  }

  public Long getLigneReleveId() {
    return ligneReleveId;
  }

  public void setLigneReleveId(Long ligneReleveId) {
    this.ligneReleveId = ligneReleveId;
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

  public String getCreditDebit() {
    return creditDebit;
  }

  public void setCreditDebit(String creditDebit) {
    this.creditDebit = creditDebit;
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

  public ReleveBancaire getReleveBancaire() {
    return releveBancaire;
  }

  public void setReleveBancaire(ReleveBancaire releveBancaire) {
    this.releveBancaire = releveBancaire;
  }
}


