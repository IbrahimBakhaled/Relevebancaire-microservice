package cdg.releve.persistence.jpa.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@DiscriminatorValue("OperationEspecesEntity")
public class OperationEspecesEntity extends CEntity {


    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;


    public OperationEspecesEntity(String cin, String nomEmetteur, String prenomEmetteur) {
        this.cin = cin;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
    }

    public OperationEspecesEntity(){

    }



}

