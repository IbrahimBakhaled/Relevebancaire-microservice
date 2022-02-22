package cdg.releve.domain.domain;

public class OperationCheque {
    private int numeroCheque;


    public OperationCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
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
}
