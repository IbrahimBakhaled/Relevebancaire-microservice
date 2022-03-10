package cdg.releve.persistence.jpa.entity;


import cdg.releve.domain.domain.Acteur;
import cdg.releve.domain.domain.OperationCheque;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "CHEQUE")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ChequeEntity {

    @Id
    private int numerCheque;

    @OneToOne
    private ActeurEntity acteur ;




}
