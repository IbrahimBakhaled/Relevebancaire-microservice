package cdg.releve.persistence.jpa.entity.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpeartionCreditCreationRequest implements Serializable {

    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;


}
