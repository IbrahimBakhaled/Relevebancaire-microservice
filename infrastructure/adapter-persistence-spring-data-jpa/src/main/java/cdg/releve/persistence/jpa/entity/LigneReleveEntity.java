package cdg.releve.persistence.jpa.entity;

import cdg.releve.domain.domain.ReleveBancaire;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;




@Table(name = "LIGNERELEVE")
@Entity
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class LigneReleveEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ligneReleveId;
    @CreatedDate
//    @CreationTimestamp
    private Date dateOperation;
    private String operationNature;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_releveBancaire", referencedColumnName = "releveBancaireId")
    @JsonIgnoreProperties("lignereleve")
    private ReleveBancaireEntity releveBancaire;



    //    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = CompteBancaireEntity.class)
//    @JoinColumn(name = "FK_compteBancaire")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private CompteBancaireEntity compteBancaireEntity;
//
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ActeurEntity.class)
//    @JoinColumn(name = "Fk_Acteur")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private ActeurEntity acteurEntity;
//
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = BanqueEntity.class)
//    @JoinColumn(name = "FK_Banque")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private BanqueEntity banqueEntity;
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ProduitEntity.class)
//    @JoinColumn(name = "FK_Produit")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private ProduitEntity produitEntity;


//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ligneReleveEntity")
//    private OperationEspecesEntity operationEspecesEntity;
//
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ligneReleveEntity")
//    private OperationVirementEntity operationVirementEntity;
//
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ligneReleveEntity")
//    private OperationChequeEntity operationChequeEntity;

}
