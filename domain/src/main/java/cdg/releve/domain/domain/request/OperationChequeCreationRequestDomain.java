package cdg.releve.domain.domain.request;

import cdg.releve.domain.domain.Acteur;


public class OperationChequeCreationRequestDomain {

    private int numeroCheque;
    private int acteurId;
    private Long ligneReleveId;


    public OperationChequeCreationRequestDomain(int numeroCheque, int acteurId, Long ligneReleveId) {
        this.numeroCheque = numeroCheque;
        this.acteurId = acteurId;
        this.ligneReleveId = ligneReleveId;
    }

    public OperationChequeCreationRequestDomain() {
    }


    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public int getActeurId() {
        return acteurId;
    }

    public void setActeurId(int acteurId) {
        this.acteurId = acteurId;
    }

    public Long getLigneReleveId() {
        return ligneReleveId;
    }

    public void setLigneReleveId(Long ligneReleveId) {
        this.ligneReleveId = ligneReleveId;
    }
}
