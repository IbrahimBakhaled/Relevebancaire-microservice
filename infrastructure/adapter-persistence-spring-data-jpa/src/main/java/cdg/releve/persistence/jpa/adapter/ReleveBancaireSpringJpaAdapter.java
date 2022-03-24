package cdg.releve.persistence.jpa.adapter;

import cdg.releve.domain.domain.*;
import cdg.releve.domain.domain.request.*;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.entity.*;
import cdg.releve.persistence.jpa.repository.*;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.*;


@Primary
@Component
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


//    public Employee addEmployee(Employee employee) {
//        Department dept = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
//        if (null == dept) {
//            dept = new Department();
//        }
//        dept.setDeptName(employee.getDepartment().getDeptName());
//        employee.setDepartment(dept);
//        return employeeRepository.save(employee);
//    }
//


    @Override
    public void addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire) {
        ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
        releveBancaireEntity.fromReleveBancaireTo(releveBancaire);
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
        List<ReleveBancaire> releveBancaireList = new ArrayList<>();
        List<ReleveBancaireEntity> releveBancaireEntityList = releveBancaireRepository.findAll();
        releveBancaireEntityList.forEach(r -> {
            ReleveBancaire releveBancaire = new ReleveBancaire();
            BeanUtils.copyProperties(r, releveBancaire);
            releveBancaireList.add(releveBancaire);});
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








//    @Override
//    public void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve) {
//        Optional<ReleveBancaireEntity> releveBancaireEntity = releveBancaireRepository.findById(ligneReleve.getReleveBancaireId());
//        Optional<ActeurEntity> acteurEntity = acteurRepository.findById(ligneReleve.getActeurId());
//        Optional<BanqueEntity> banqueEntity = banqueRepository.findById(ligneReleve.getBanqueId());
//        Optional<CompteBancaireEntity> compteBancaireEntity = compteBancaireRepository.findById(ligneReleve.getCompteBancaireId());
//        Optional<ProduitEntity> produitEntity = produitRepository.findById(ligneReleve.getProduitId());
//        if (!releveBancaireEntity.isPresent()
////                &&
////                !acteurEntity.isPresent() &&
////                !banqueEntity.isPresent() &&
////                !compteBancaireEntity.isPresent() &&
////                !produitEntity.isPresent()
//        ){
//            throw new EntityNotFoundException("ReleveBancaire || Acteur || Banque || CompteBancaire || Produit = are not presented in database");
//        }
//
//        LigneReleveEntity ligneReleveToCreate = new LigneReleveEntity();
//        BeanUtils.copyProperties(ligneReleve, ligneReleveToCreate);
////        ligneReleveToCreate.setReleveBancaire(releveBancaireEntity.get());
////        ligneReleveToCreate.setActeurEntity(acteurEntity.get());
////        ligneReleveToCreate.setBanqueEntity(banqueEntity.get());
////        ligneReleveToCreate.setCompteBancaireEntity(compteBancaireEntity.get());
////        ligneReleveToCreate.setProduitEntity(produitEntity.get());
//        LigneReleve ligneReleveFromDomain = new LigneReleve();
//        BeanUtils.copyProperties(ligneReleveToCreate, ligneReleveFromDomain);
//        ligneReleveRepository.save(ligneReleveToCreate);
//    }






    @Override
    public void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve) {
//        ReleveBancaireEntity releveBancaireEntity = releveBancaireRepository.findById(ligneReleve.getReleveBancaire().getReleveBancaireId()).orElse(null);
//        if (null == releveBancaireEntity){
//            releveBancaireEntity = new ReleveBancaireEntity();
//        }
//        releveBancaireEntity.setLabel(ligneReleve.getReleveBancaire().getLabel());
//        releveBancaireEntity.setNbrLignes(ligneReleve.getReleveBancaire().getNbrLignes());
//        releveBancaireEntity.setSoldeInitial(ligneReleve.getReleveBancaire().getSoldeInitial());
//        releveBancaireEntity.setSoleFinal(ligneReleve.getReleveBancaire().getSoleFinal());
//        releveBancaireEntity.setNbrOperationCredit(ligneReleve.getReleveBancaire().getNbrOperationCredit());
//        LigneReleve ligneReleveFromDomain = new LigneReleve();
//        ReleveBancaire releveBancaire = new ReleveBancaire();
//        BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);
//
//        ligneReleveFromDomain.setReleveBancaire(releveBancaire);
//        LigneReleveEntity ligneReleveEntity = new LigneReleveEntity();
//        BeanUtils.copyProperties(releveBancaire, ligneReleveEntity);
//
//        ligneReleveRepository.save(ligneReleveEntity);


    }



    @Override
    public void createReleveBancaire(ReleveBancaireCreationRequestDomain request) {

        ReleveBancaireEntity releveBancaire = new ReleveBancaireEntity();
        BeanUtils.copyProperties(request, releveBancaire);
        releveBancaireRepository.save(releveBancaire);
    }

    @Override
    public void createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain) {

    }

//    @Override
//    public void createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain) {
//        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(operationEspeceCreationRequestDomain.getLigneReleveId());
//
//        if (!ligneReleveEntity.isPresent()){
//            throw  new EntityNotFoundException("ligneReleveId is not presented in database fill ReleveBancaire Table first and then come here to post operationEspece");
//        }
//
//        OperationEspecesEntity operationEspecesEntity = new OperationEspecesEntity();
//        BeanUtils.copyProperties(operationEspeceCreationRequestDomain, operationEspecesEntity);
//        operationEspecesEntity.setLigneReleveEntity(ligneReleveEntity.get());
//        LigneReleve ligneReleve = new LigneReleve();
//        BeanUtils.copyProperties(operationEspecesEntity, ligneReleve);
//        operationEspecesRepository.save(operationEspecesEntity);
//    }

    @Override
    public void createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain) {

    }

//    @Override
//    public void createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain) {
//
//        Optional<ActeurEntity> acteurEntity = acteurRepository.findById(operationChequeCreationRequestDomain.getActeurId());
//        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(operationChequeCreationRequestDomain.getLigneReleveId());
//        if (!acteurEntity.isPresent() && !ligneReleveEntity.isPresent()){
//            throw new EntityNotFoundException("You have to make sure that the acteurId and ligneReleveId are presented in database fill the two database and then come to post operationCheque");
//        }
//
//        OperationChequeEntity operationChequeEntity = new OperationChequeEntity();
//        BeanUtils.copyProperties(operationChequeCreationRequestDomain, operationChequeEntity);
//        operationChequeEntity.setLigneReleveEntity(ligneReleveEntity.get());
//        operationChequeEntity.setActeur(acteurEntity.get());
//        LigneReleve ligneReleve = new LigneReleve();
//        Acteur acteur = new Acteur();
//        BeanUtils.copyProperties(operationChequeEntity, ligneReleve);
//        BeanUtils.copyProperties(operationChequeEntity, acteur);
//        operationChequeRepository.save(operationChequeEntity);
//
//    }

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

    }

    //    @Override
//    public void createoperationvirement(OperationVirementCreationRequestDomain operationVirementCreationRequestDomain) {
//
//        Optional<CompteBancaireEntity> compteBancaireEntity = compteBancaireRepository.findById(operationVirementCreationRequestDomain.getCompteBancaireId());
//        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(operationVirementCreationRequestDomain.getLigneReleveId());
//
//        if (!compteBancaireEntity.isPresent() && !ligneReleveEntity.isPresent()){
//            throw new EntityNotFoundException("CompteBancaireId or ligneReleveId are not presented in database go create compteBancaire and ligneReleve with their Ids and come back and create OperationVirement");
//        }
//
//        OperationVirementEntity operationVirementEntity = new OperationVirementEntity();
//        BeanUtils.copyProperties(operationVirementCreationRequestDomain, operationVirementEntity);
//        operationVirementEntity.setCompteBancaire(compteBancaireEntity.get());
//        operationVirementEntity.setLigneReleveEntity(ligneReleveEntity.get());
//        CompteBancaire compteBancaire = new CompteBancaire();
//        LigneReleve ligneReleve = new LigneReleve();
//        BeanUtils.copyProperties(operationVirementEntity, ligneReleve);
//        BeanUtils.copyProperties(operationVirementEntity, compteBancaire);
//
//        operationVirementRepository.save(operationVirementEntity);
//
//    }
    @Override
    public void createproduit(ProduitCreationRequestDomain produitCreationRequestDomain) {

//        Optional<LigneReleveEntity> ligneReleveEntity = ligneReleveRepository.findById(produitCreationRequestDomain.getLigneReleveId());
//
//        if (!ligneReleveEntity.isPresent()){
//            throw new EntityNotFoundException("ligneReleve is not presented in database create lignereleve first and then come back to create produit");
//        }

        ProduitEntity produitEntity = new ProduitEntity();
        BeanUtils.copyProperties(produitCreationRequestDomain, produitEntity);
        produitRepository.save(produitEntity);

    }


}
