package cdg.releve.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;




@Table(name = "LIGNERELEVE")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
//@JsonIgnoreProperties(ignoreUnknown = true)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class LigneReleveEntity implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long ligneReleveId;
    @CreatedDate
    @CreationTimestamp
    private Date dateOperation;
    private String operationNature;
    private int numCheck;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String rib;
    private String modePaiment;
    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;
//    @OneToOne(cascade = CascadeType.MERGE, optional = false)
//    @JoinColumn(name = "FK_operationCredit")
//    private OperationCreditEntity operationCredit;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ReleveBancaireEntity.class)
    @JoinColumn(name = "FK_releveBancaire")
    private ReleveBancaireEntity releveBancaire;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = CompteBancaireEntity.class)
    @JoinColumn(name = "FK_compteBancaire")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CompteBancaireEntity compteBancaireEntity;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ActeurEntity.class)
    @JoinColumn(name = "Fk_Acteur")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ActeurEntity acteurEntity;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = BanqueEntity.class)
    @JoinColumn(name = "FK_Banque")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private BanqueEntity banqueEntity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ProduitEntity.class)
    @JoinColumn(name = "FK_Produit")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ProduitEntity produitEntity;


//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ligneReleveEntity")
//    private OperationEspecesEntity operationEspecesEntity;
//
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ligneReleveEntity")
//    private OperationVirementEntity operationVirementEntity;
//
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ligneReleveEntity")
//    private OperationChequeEntity operationChequeEntity;

}
