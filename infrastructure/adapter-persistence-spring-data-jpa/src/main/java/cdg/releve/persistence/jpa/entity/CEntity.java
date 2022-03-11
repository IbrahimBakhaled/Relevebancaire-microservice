package cdg.releve.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Table(name = "OPERATIONCREDIT")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CEntity {


    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long operationCreditId;



    @CreatedDate
    @CreationTimestamp
    private Date operationDate;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operationCheque_joinedcolumn")
    private OperationChequeEntity operationCheque;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operationEspeces_joinedcolumn")
    private OperationEspecesEntity operationEspeces;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operationVirement_joinedcolumn")
    private OperationVirementEntity operationVirement;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "porduit_joinedcolumn")
    private ProduitEntity produit;




}
