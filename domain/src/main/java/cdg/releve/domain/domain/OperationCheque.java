package cdg.releve.domain.domain;

public class OperationCheque {
    private String numeroCheque;

    public OperationCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public OperationCheque() {
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }
}
