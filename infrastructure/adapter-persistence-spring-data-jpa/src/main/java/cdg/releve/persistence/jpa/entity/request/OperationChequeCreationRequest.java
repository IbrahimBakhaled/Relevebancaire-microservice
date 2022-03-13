package cdg.releve.persistence.jpa.entity.request;


import cdg.releve.domain.domain.Acteur;
import lombok.Data;

@Data
public class OperationChequeCreationRequest {


    private int numeroCheque;
    private int acteurId;
}
