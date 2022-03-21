package cdg.releve.persistence.jpa.entity;


import cdg.releve.domain.domain.LigneReleve;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.persistence.jpa.entity.request.TimeDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.CreatedDate;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "RELEVEBANCAIRE")
@Entity
@ToString
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
    private List<LigneReleveEntity> lignereleve = new ArrayList<>();



    public void setterOfList(){
        if (this.lignereleve != null){
            this.lignereleve.stream().forEach( l -> {
                l.setReleveBancaire(this);
            });
        }
    }


}
