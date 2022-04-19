package cdg.releve.persistence.jpa.entity;


import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "RELEVEBANCAIRE")
@Entity
@Builder
public class ReleveBancaireEntity{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long releveBancaireId;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date dateReception;
    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private int nbrOperationDebit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;
    @OneToMany(cascade= CascadeType.ALL,mappedBy = "releveBancaire", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("releveBancaire")
    @JsonIgnore
    @JsonBackReference
    private List<LigneReleveEntity> lignereleve = new ArrayList<>();



    public void setterOfList(){
        if (this.lignereleve != null){
            this.lignereleve.stream().forEach( l -> {
                l.setReleveBancaire(this);
            });
        }
    }

    /**
     *
     * this method is for adding a new relevebancaire with lignereleve.
     * @param releveBancaireCreationRequestDomain
     * @return ReleveBancaireEntity
     */

    public ReleveBancaireEntity fromReleveBancaireTo(ReleveBancaireCreationRequestDomain releveBancaireCreationRequestDomain){
        this.setLabel(releveBancaireCreationRequestDomain.getLabel());
        this.setSoleFinal(releveBancaireCreationRequestDomain.getSoleFinal());
        this.setSoldeInitial(releveBancaireCreationRequestDomain.getSoldeInitial());
        this.setNbrOperationCredit(releveBancaireCreationRequestDomain.getNbrOperationCredit());
        this.setNbrLignes(releveBancaireCreationRequestDomain.getNbrLignes());
        releveBancaireCreationRequestDomain.getLignereleve().forEach(l -> {
            LigneReleveEntity ligneReleveEntity = new LigneReleveEntity();
            ligneReleveEntity.setCreditDebit(l.getCreditDebit());
            ligneReleveEntity.setMontant(l.getMontant());
            ligneReleveEntity.setRefCdg(l.getRefCdg());
            ligneReleveEntity.setModePaiment(l.getModePaiment());
            ligneReleveEntity.setOperationNature(l.getOperationNature());
            ligneReleveEntity.setRefPaiment(l.getRefPaiment());
            ligneReleveEntity.setNumCheck(l.getNumCheck());
            ligneReleveEntity.setRib(l.getRib());
            ligneReleveEntity.setReleveBancaire(this);
            lignereleve.add(ligneReleveEntity);
        });
        this.setLignereleve(lignereleve);
        return this;

    }



}
