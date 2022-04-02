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
@DiscriminatorColumn(name = "CHEQUE", discriminatorType = DiscriminatorType.STRING)
public class OperationChequeEntity extends OperationCreditEntity{



    private int numeroCheque;
//    @OneToOne
//    @JoinColumn(name = "Fk_Acteur")
//    private ActeurEntity acteur;


//    @OneToOne(mappedBy = "operationCredit")
//    @OneToOne(cascade = CascadeType.ALL)
//    private LigneReleveEntity ligneReleveEntity;


}
