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
@DiscriminatorValue("OperationChequeEntity")
public class OperationChequeEntity extends OperationCreditEntity {


    private int numeroCheque;
    @OneToOne
    private ChequeEntity chequeEntity;


}
