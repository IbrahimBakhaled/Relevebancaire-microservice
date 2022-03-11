package cdg.releve.persistence.jpa.entity;


import cdg.releve.domain.domain.LigneReleve;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.core.serializer.Deserializer;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;


@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
@Table(name = "RELEVEBANCAIRE")
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleveBancaireEntity{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long releveBancaireId;
    @CreationTimestamp
    private Date dateReception;
    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private int nbrOperationDebit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "releveBancaire", targetEntity = LigneReleveEntity.class, fetch = FetchType.LAZY)
//    private List<LigneReleveEntity> lignereleve;
    @OneToMany(mappedBy = "releveBancaire")
//    @JacksonXmlProperty(localName = "lignereleve")
//    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonIgnore
    private Set<LigneReleveEntity> lignereleve;










    //========================================
//    public List<LigneReleveEntity> getLignereleve() {
//        return lignereleve;
//    }

//    public void setLignereleve(List<LigneReleveEntity> lignereleve) {
//
//        if (this.lignereleve == null){
//            this.lignereleve = new ArrayList<>();
//        }
//        this.lignereleve.clear();
//        if (lignereleve != null){
//            this.lignereleve.addAll(lignereleve);
//        }
//    }
//
//    public void setterOfList(){
//        if (this.lignereleve != null){
//            this.lignereleve.forEach(e -> {
//                e.setReleveBancaire(this);
//            });
//        }
//    }
}
