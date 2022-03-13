package cdg.releve.persistence.jpa.adapter;

import cdg.releve.domain.domain.*;
import cdg.releve.domain.domain.request.*;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.entity.*;
import cdg.releve.persistence.jpa.repository.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.EntityNotFoundException;
import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReleveBancaireSpringJpaAdapter implements ReleveBancairePersistencePort {

    private ReleveBancaireRepository releveBancaireRepository;
    private LigneReleveRepository ligneReleveRepository;
    private OperationCreditRepository operationCreditRepository;
    private OperationEspecesRepository operationEspecesRepository;
    private OperationChequeRepository operationChequeRepository;
    private ActeurRepository acteurRepository;
    private BanqueRepository banqueRepository;
    private CompteBancaireRepository compteBancaireRepository;
    private OperationVirementRepository operationVirementRepository;
    private ProduitRepository produitRepository;


    public ReleveBancaireSpringJpaAdapter(ReleveBancaireRepository releveBancaireRepository, LigneReleveRepository ligneReleveRepository, OperationCreditRepository operationCreditRepository, OperationEspecesRepository operationEspecesRepository, OperationChequeRepository operationChequeRepository, ActeurRepository acteurRepository, BanqueRepository banqueRepository, CompteBancaireRepository compteBancaireRepository, OperationVirementRepository operationVirementRepository, ProduitRepository produitRepository) {
        this.releveBancaireRepository = releveBancaireRepository;
        this.ligneReleveRepository = ligneReleveRepository;
        this.operationCreditRepository = operationCreditRepository;
        this.operationEspecesRepository = operationEspecesRepository;
        this.operationChequeRepository = operationChequeRepository;
        this.acteurRepository = acteurRepository;
        this.banqueRepository = banqueRepository;
        this.compteBancaireRepository = compteBancaireRepository;
        this.operationVirementRepository = operationVirementRepository;
        this.produitRepository = produitRepository;
    }


    @Override
    public void addReleveBancaire(ReleveBancaire releveBancaire) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        BeanUtils.copyProperties(releveBancaire, releveBancaireEntity);
//        List<LigneReleveEntity> listCollection =
//        releveBancaireEntity.getLignereleve().stream().map(l -> {
//            LigneReleveEntity ligneReleveEntity = new LigneReleveEntity();
//            BeanUtils.copyProperties(l,ligneReleveEntity);
//            return ligneReleveEntity;
//        }).collect(Collectors.toList());
//        releveBancaireEntity.setLignereleve(listCollection);
//        releveBancaireEntity.setterOfList();
        releveBancaireRepository.save(releveBancaireEntity);
    }

    @Override
    public void removeReleveBancaire(ReleveBancaire releveBancaire) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        BeanUtils.copyProperties(releveBancaire, releveBancaireEntity);
        releveBancaireRepository.delete(releveBancaireEntity);
    }

    @Override
    public List<ReleveBancaire> getReleveBancaires() {


        List<ReleveBancaire> releveBancaireList = new ArrayList<ReleveBancaire>();
        List<ReleveBancaireEntity> releveBancaireEntityList = releveBancaireRepository.findAll();
        List<LigneReleveEntity> ligneReleveList = ligneReleveRepository.findAll();
        List<OperationCreditEntity> operationCreditList = operationCreditRepository.findAll();
        for (ReleveBancaireEntity releveBancaireEntity : releveBancaireEntityList){
            ReleveBancaire releveBancaire = new ReleveBancaire();
            BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);
            BeanUtils.copyProperties(ligneReleveList, releveBancaire);
            BeanUtils.copyProperties(operationCreditList, releveBancaire);
            releveBancaireList.add(releveBancaire);
        }
        return releveBancaireList;
    }

    @Override
    public ReleveBancaire getReleveBancaireById(Long releveBancaireId) {

        ReleveBancaireEntity releveBancaireEntity = releveBancaireRepository.findByReleveBancaireId(releveBancaireId);
        if (releveBancaireEntity == null){
            throw new EntityNotFoundException("releve bancaire pas trouvé");
        }
        ReleveBancaire releveBancaire = new ReleveBancaire();
        BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);
        return releveBancaire;
    }

    @Override
    public void deleteReleveBancaireById(Long releveBancaireId) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        ReleveBancaire releveBancaire = new ReleveBancaire();
        releveBancaireRepository.deleteById(releveBancaireId);
        if (releveBancaireEntity == null){
            throw new EntityNotFoundException("releve bancaire pas trouvé");
        }

        BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);

    }




// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================
// ===================================================================================================








    @Override
    public void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve) {
        Optional<ReleveBancaireEntity> releveBancaireEntity = releveBancaireRepository.findById(ligneReleve.getReleveBancaireId());
        if (!releveBancaireEntity.isPresent()){
            throw new EntityNotFoundException("Releve Bancaire not found or ReleveBancaire is not presented in database");
        }

        LigneReleveEntity ligneReleveToCreate = new LigneReleveEntity();
        BeanUtils.copyProperties(ligneReleve, ligneReleveToCreate);
        ligneReleveToCreate.setReleveBancaire(releveBancaireEntity.get());
        LigneReleve ligneReleveFromDomain = new LigneReleve();
        BeanUtils.copyProperties(ligneReleveToCreate, ligneReleveFromDomain);

        // Creat OperationCredit
        OperationCreditEntity operationCreditEntity1 = new OperationCreditEntity();
        operationCreditEntity1.setOperationCreditId(ligneReleve.getOperationCreditId());

        operationCreditRepository.save(operationCreditEntity1);
        ligneReleveToCreate.setOperationCredit(operationCreditEntity1);
        BeanUtils.copyProperties(ligneReleveToCreate, operationCreditEntity1);
        ligneReleveRepository.save(ligneReleveToCreate);
    }

    @Override
    public void createReleveBancaire(ReleveBancaireCreationRequestDomain request) {

        ReleveBancaireEntity releveBancaire = new ReleveBancaireEntity();
        BeanUtils.copyProperties(request, releveBancaire);
        releveBancaireRepository.save(releveBancaire);
    }

    @Override
    public void createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain) {
        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(operationEspeceCreationRequestDomain.getLigneReleveId());

        if (!ligneReleveEntity.isPresent()){
            throw  new EntityNotFoundException("ligneReleveId is not presented in database fill ReleveBancaire Table first and then come here to post operationEspece");
        }

        OperationEspecesEntity operationEspecesEntity = new OperationEspecesEntity();
        BeanUtils.copyProperties(operationEspeceCreationRequestDomain, operationEspecesEntity);
        operationEspecesEntity.setLigneReleveEntity(ligneReleveEntity.get());
        LigneReleve ligneReleve = new LigneReleve();
        BeanUtils.copyProperties(operationEspecesEntity, ligneReleve);
        operationEspecesRepository.save(operationEspecesEntity);
    }

    @Override
    public void createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain) {

        Optional<ActeurEntity> acteurEntity = acteurRepository.findById(operationChequeCreationRequestDomain.getActeurId());
        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(operationChequeCreationRequestDomain.getLigneReleveId());
        if (!acteurEntity.isPresent() && !ligneReleveEntity.isPresent()){
            throw new EntityNotFoundException("You have to make sure that the acteurId and ligneReleveId are presented in database fill the two database and then come to post operationCheque");
        }

        OperationChequeEntity operationChequeEntity = new OperationChequeEntity();
        BeanUtils.copyProperties(operationChequeCreationRequestDomain, operationChequeEntity);
        operationChequeEntity.setLigneReleveEntity(ligneReleveEntity.get());
        operationChequeEntity.setActeur(acteurEntity.get());
        LigneReleve ligneReleve = new LigneReleve();
        Acteur acteur = new Acteur();
        BeanUtils.copyProperties(operationChequeEntity, ligneReleve);
        BeanUtils.copyProperties(operationChequeEntity, acteur);
        operationChequeRepository.save(operationChequeEntity);

    }

    @Override
    public void createacteur(ActeurCreationRequestDomain acteurCreationRequestDomain) {

        ActeurEntity acteurEntity = new ActeurEntity();
        BeanUtils.copyProperties(acteurCreationRequestDomain, acteurEntity);
        acteurRepository.save(acteurEntity);



    }

    @Override
    public void createbanque(BanqueCreationRequestDomain banqueCreationRequestDomain) {
        BanqueEntity banqueEntity = new BanqueEntity();
        BeanUtils.copyProperties(banqueCreationRequestDomain, banqueEntity);
        banqueRepository.save(banqueEntity);


    }

    @Override
    public void createcomptebancaire(CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain) {
        Optional<ActeurEntity> acteurEntity = acteurRepository.findById(compteBancaireCreationRequestDomain.getActeurId());
        Optional<BanqueEntity> banqueEntity = banqueRepository.findById(compteBancaireCreationRequestDomain.getBanqueId());

        if (!acteurEntity.isPresent() && !banqueEntity.isPresent()){
            throw new EntityNotFoundException("You have to make sure that the acteurId and banqueId are presented in database fill the two database and then come to post creationcomptebancaire");
        }

        CompteBancaireEntity compteBancaireEntity = new CompteBancaireEntity();
        BeanUtils.copyProperties(compteBancaireCreationRequestDomain, compteBancaireEntity);
        compteBancaireEntity.setBanqueEntity(banqueEntity.get());
        compteBancaireEntity.setActeurEntity(acteurEntity.get());
        Acteur acteur = new Acteur();
        Banque banque = new Banque();
        BeanUtils.copyProperties(compteBancaireEntity, acteur);
        BeanUtils.copyProperties(compteBancaireEntity, banque);

        compteBancaireRepository.save(compteBancaireEntity);
    }

    @Override
    public void createoperationvirement(OperationVirementCreationRequestDomain operationVirementCreationRequestDomain) {

        Optional<CompteBancaireEntity> compteBancaireEntity = compteBancaireRepository.findById(operationVirementCreationRequestDomain.getCompteBancaireId());
        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(operationVirementCreationRequestDomain.getLigneReleveId());

        if (!compteBancaireEntity.isPresent() && !ligneReleveEntity.isPresent()){
            throw new EntityNotFoundException("CompteBancaireId or ligneReleveId are not presented in database go create compteBancaire and ligneReleve with their Ids and come back and create OperationVirement");
        }

        OperationVirementEntity operationVirementEntity = new OperationVirementEntity();
        BeanUtils.copyProperties(operationVirementCreationRequestDomain, operationVirementEntity);
        operationVirementEntity.setCompteBancaire(compteBancaireEntity.get());
        operationVirementEntity.setLigneReleveEntity(ligneReleveEntity.get());
        CompteBancaire compteBancaire = new CompteBancaire();
        LigneReleve ligneReleve = new LigneReleve();
        BeanUtils.copyProperties(operationVirementEntity, ligneReleve);
        BeanUtils.copyProperties(operationVirementEntity, compteBancaire);

        operationVirementRepository.save(operationVirementEntity);

    }
    @Override
    public void createproduit(ProduitCreationRequestDomain produitCreationRequestDomain) {

        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(produitCreationRequestDomain.getLigneReleveId());

        if (!ligneReleveEntity.isPresent()){
            throw new EntityNotFoundException("ligneReleve is not presented in database create lignereleve first and then come back to create produit");
        }

        ProduitEntity produitEntity = new ProduitEntity();
        BeanUtils.copyProperties(produitCreationRequestDomain, produitEntity);
        produitRepository.save(produitEntity);

    }


}
