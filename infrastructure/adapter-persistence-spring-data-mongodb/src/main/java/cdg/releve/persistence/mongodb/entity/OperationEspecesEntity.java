package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "OPERATIONESPECE")
public class OperationEspecesEntity {


    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;


    public OperationEspecesEntity(String cin, String nomEmetteur, String prenomEmetteur) {
        this.cin = cin;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
    }

    public OperationEspecesEntity(){
        super();
    }



}

