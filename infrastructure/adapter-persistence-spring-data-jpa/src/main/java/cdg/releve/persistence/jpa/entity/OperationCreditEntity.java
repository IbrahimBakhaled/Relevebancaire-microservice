package cdg.releve.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Table(name = "OPERATIONCREDIT")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@AllArgsConstructor
@NoArgsConstructor
public class OperationCreditEntity {


    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long operationCreditId;



    @CreatedDate
//    @CreationTimestamp
    private Date operationDate;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "FK_operation_cheque")
//    private OperationChequeEntity operationCheque;
//
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "FK_operation_especes")
//    private OperationEspecesEntity operationEspeces;
//
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "FK_operation_virement")
//    private OperationVirementEntity operationVirement;


    @OneToOne
    private LigneReleveEntity ligneReleve;


    @OneToOne
    @JoinColumn(name = "FK_produit")
    private ProduitEntity produit;




}