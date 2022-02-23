package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "OPERATIONCHEQUE")
public class OperationChequeEntity {


    private int numeroCheque;
    private ChequeEntity cheque;


    public OperationChequeEntity(int numeroCheque, ChequeEntity cheque) {
        this.numeroCheque = numeroCheque;
        this.cheque = cheque;
    }


    public OperationChequeEntity(){
        super();
    }


}
