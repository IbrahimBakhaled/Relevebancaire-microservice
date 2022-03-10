package cdg.releve.persistence.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUIT")
@Entity
public class ProduitEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long produitId;
    private String produitCode;
    private String produitLabel;




}
