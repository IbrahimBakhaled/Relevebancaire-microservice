package cdg.releve.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class LigneReleveEntity implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long ligneReleveId;
    @CreatedDate
    private Date dateOperation;
    private String operationNature;
    private String rib;
    private int numCheck;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "operation_credit_joinedcolumn")
//    private CEntity operationCredit;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = ReleveBancaireEntity.class)
    @JoinColumn(name = "releveBancaireId")
    private ReleveBancaireEntity releveBancaire;


}
