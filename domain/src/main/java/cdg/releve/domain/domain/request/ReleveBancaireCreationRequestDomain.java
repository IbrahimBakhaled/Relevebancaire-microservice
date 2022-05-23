package cdg.releve.domain.domain.request;

import cdg.releve.domain.domain.LigneReleve;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleveBancaireCreationRequestDomain {

    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;
    private String status;
    private List<LigneReleveCreationRequestDomain> lignereleve = new ArrayList<>();


    public ReleveBancaireCreationRequestDomain() {
    }

    public ReleveBancaireCreationRequestDomain(String label, int nbrLignes, int nbrOperationCredit,
        BigDecimal soldeInitial, BigDecimal soleFinal, String status,
        List<LigneReleveCreationRequestDomain> lignereleve) {
        this.label = label;
        this.nbrLignes = nbrLignes;
        this.nbrOperationCredit = nbrOperationCredit;
        this.soldeInitial = soldeInitial;
        this.soleFinal = soleFinal;
        this.status = status;
        this.lignereleve = lignereleve;
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

    public List<LigneReleveCreationRequestDomain> getLignereleve() {
        return lignereleve;
    }

    public void setLignereleve(List<LigneReleveCreationRequestDomain> lignereleve) {
        this.lignereleve = lignereleve;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
