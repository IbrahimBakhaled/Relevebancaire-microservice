package cdg.releve.persistence.jpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "ACTEUR")
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurEntity {

    @Id
    private int acteurId;
    private String nomActeur;
    private String prenomActeur;

    public ActeurEntity(){
    }

}
