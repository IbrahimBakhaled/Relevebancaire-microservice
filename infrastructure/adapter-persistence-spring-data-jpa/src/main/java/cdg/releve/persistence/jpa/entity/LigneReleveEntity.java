package cdg.releve.persistence.jpa.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


@Table(name = "LIGNERELEVE")
@Entity
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LigneReleveEntity {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long ligneReleveId;
//  @CreationTimestamp
//  @Temporal(TemporalType.DATE)
  private String dateOperation;
//  @CreationTimestamp
//  @Temporal(TemporalType.DATE)
  private String dateValue;
  private String rib;
  private String numCheck;
  private String operationNature;
  private BigDecimal montant;
  private String creditDebit;
  private Long refCdg;
  private String refPaiment;
  private String modePaiment;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "FK_releveBancaire", referencedColumnName = "releveBancaireId")
  @JsonIgnoreProperties("lignereleve")
  @JsonBackReference
  private ReleveBancaireEntity releveBancaire;
}
