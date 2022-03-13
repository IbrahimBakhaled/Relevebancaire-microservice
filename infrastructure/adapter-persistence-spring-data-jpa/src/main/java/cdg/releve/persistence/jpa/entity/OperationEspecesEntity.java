package cdg.releve.persistence.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("OperationEspecesEntity")
public class OperationEspecesEntity extends OperationCreditEntity {


    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;

    @OneToOne(mappedBy = "operationCredit")
    private LigneReleveEntity ligneReleveEntity;





}

