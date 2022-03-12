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
@DiscriminatorValue("OperationVirementEntity")
public class OperationVirementEntity extends OperationCreditEntity {



    private String rib;

    @OneToOne
//    @JoinColumn(name = "compteBancaire")
    private CompteBancaireEntity compteBancaire;





}
