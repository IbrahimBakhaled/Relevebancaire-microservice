package cdg.releve.persistence.jpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "COMPTEBANCAIRE")
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompteBancaireEntity {


    @Id
    private int compteBancaireId;
    private String rib;
    private String codeSwift;

    @OneToOne
    private ActeurEntity acteurEntity;

    @OneToOne
    private BanqueEntity banque;




}
