package cdg.releve.persistence.jpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ACTEUR")
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int acteurId;
    private String nomActeur;
    private String prenomActeur;
    private Long ligneReleveId;

}
