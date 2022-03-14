package cdg.releve.persistence.jpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
@DiscriminatorValue("Operation_Especes")
public class OperationEspecesEntity extends OperationCreditEntity {


    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    private LigneReleveEntity ligneReleveEntity;
//
//    @OneToOne
//    private ReleveBancaireEntity releveBancaireEntity;





}

