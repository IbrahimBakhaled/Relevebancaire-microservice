package cdg.releve.domain.domain.request;

import java.math.BigDecimal;

public class ReleveBancaireCreationRequestDomain {

    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;

    public ReleveBancaireCreationRequestDomain(String label, int nbrLignes, int nbrOperationCredit, BigDecimal soldeInitial, BigDecimal soleFinal) {
        this.label = label;
        this.nbrLignes = nbrLignes;
        this.nbrOperationCredit = nbrOperationCredit;
        this.soldeInitial = soldeInitial;
        this.soleFinal = soleFinal;
    }

    public ReleveBancaireCreationRequestDomain() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNbrLignes() {
        return nbrLignes;
    }

    public void setNbrLignes(int nbrLignes) {
        this.nbrLignes = nbrLignes;
    }

    public int getNbrOperationCredit() {
        return nbrOperationCredit;
    }

    public void setNbrOperationCredit(int nbrOperationCredit) {
        this.nbrOperationCredit = nbrOperationCredit;
    }

    public BigDecimal getSoldeInitial() {
        return soldeInitial;
    }

    public void setSoldeInitial(BigDecimal soldeInitial) {
        this.soldeInitial = soldeInitial;
    }

    public BigDecimal getSoleFinal() {
        return soleFinal;
    }

    public void setSoleFinal(BigDecimal soleFinal) {
        this.soleFinal = soleFinal;
    }
}
