package cdg.releve.persistence.jpa.entity;


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
@Table(name = "BANQUE")
@Entity
public class BanqueEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int banqueId;
    private String nomBanque;


}
