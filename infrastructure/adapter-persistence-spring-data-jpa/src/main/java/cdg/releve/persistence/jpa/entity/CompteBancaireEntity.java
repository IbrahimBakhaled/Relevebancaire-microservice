package cdg.releve.persistence.jpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COMPTEBANCAIRE")
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompteBancaireEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int compteBancaireId;
    private String rib;
    private String codeSwift;

    @OneToOne
    @JoinColumn(name = "FK_Acteur")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ActeurEntity acteurEntity;

    @OneToOne
    @JoinColumn(name = "Fk_Banque")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private BanqueEntity banqueEntity;




}
