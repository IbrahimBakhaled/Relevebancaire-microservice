package cdg.releve.domain.domain;

public class OperationCheque {
    private int numeroCheque;
    private Cheque cheque;


    public OperationCheque(int numeroCheque, Cheque cheque) {
        this.numeroCheque = numeroCheque;
        this.cheque = cheque;
    }


    public OperationCheque(){
        super();
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }
}
