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
@DiscriminatorColumn(name = "VIREMENT", discriminatorType = DiscriminatorType.STRING)
public class OperationVirementEntity extends OperationCreditEntity {



    private String rib;

//    @OneToOne
//    @JoinColumn(name = "FK_compteBancaire")
//    private CompteBancaireEntity compteBancaire;

//    @OneToOne(mappedBy = "operationCredit")
//    @OneToOne(cascade = CascadeType.ALL)
//    private LigneReleveEntity ligneReleveEntity;





}
