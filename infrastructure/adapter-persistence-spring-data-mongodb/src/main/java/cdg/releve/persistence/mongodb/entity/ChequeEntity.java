package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "CHEQUE")
public class ChequeEntity {


    private int numerCheque;
    private ActeurEntity acteur;


    public ChequeEntity(int numerCheque, ActeurEntity acteur) {
        this.numerCheque = numerCheque;
        this.acteur = acteur;
    }

    public ChequeEntity(){
        super();
    }


}
