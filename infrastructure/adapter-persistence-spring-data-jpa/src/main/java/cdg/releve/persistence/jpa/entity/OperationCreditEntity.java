package cdg.releve.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Table(name = "OPERATIONCREDIT")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OperationCreditEntity {


    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long operationCreditId;

    @Column(name = "DTYPE", insertable = false, updatable = false)
    private String dtype;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date operationDate;

    @OneToOne
    @JoinColumn(name = "FK_LigneReleve")
    private LigneReleveEntity ligneReleve;

}
