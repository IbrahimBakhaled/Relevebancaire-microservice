package cdg.releve.persistence.jpa.adapter;

import cdg.releve.domain.domain.Acteur;
import cdg.releve.domain.domain.Banque;
import cdg.releve.domain.domain.OperationVirement;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.ActeurCreationRequestDomain;
import cdg.releve.domain.domain.request.BanqueCreationRequestDomain;
import cdg.releve.domain.domain.request.CompteBancaireCreationRequestDomain;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.domain.domain.request.OperationChequeCreationRequestDomain;
import cdg.releve.domain.domain.request.OperationEspeceCreationRequestDomain;
import cdg.releve.domain.domain.request.OperationVirementCreationRequestDomain;
import cdg.releve.domain.domain.request.ProduitCreationRequestDomain;
import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.config.CopyUtil;
import cdg.releve.persistence.jpa.entity.ActeurEntity;
import cdg.releve.persistence.jpa.entity.BanqueEntity;
import cdg.releve.persistence.jpa.entity.CompteBancaireEntity;
import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import cdg.releve.persistence.jpa.entity.OperationChequeEntity;
import cdg.releve.persistence.jpa.entity.OperationCreditEntity;
import cdg.releve.persistence.jpa.entity.OperationEspecesEntity;
import cdg.releve.persistence.jpa.entity.OperationVirementEntity;
import cdg.releve.persistence.jpa.entity.ProduitEntity;
import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import cdg.releve.persistence.jpa.repository.ActeurRepository;
import cdg.releve.persistence.jpa.repository.BanqueRepository;
import cdg.releve.persistence.jpa.repository.CompteBancaireRepository;
import cdg.releve.persistence.jpa.repository.LigneReleveRepository;
import cdg.releve.persistence.jpa.repository.OperationChequeRepository;
import cdg.releve.persistence.jpa.repository.OperationCreditRepository;
import cdg.releve.persistence.jpa.repository.OperationEspecesRepository;
import cdg.releve.persistence.jpa.repository.OperationVirementRepository;
import cdg.releve.persistence.jpa.repository.ProduitRepository;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
@Slf4j
public class ReleveBancaireSpringJpaAdapter implements ReleveBancairePersistencePort {

  private final ReleveBancaireRepository releveBancaireRepository;
  private final LigneReleveRepository ligneReleveRepository;
  private final OperationCreditRepository operationCreditRepository;
  private final OperationEspecesRepository operationEspecesRepository;
  private final OperationChequeRepository operationChequeRepository;
  private final ActeurRepository acteurRepository;
  private final BanqueRepository banqueRepository;
  private final CompteBancaireRepository compteBancaireRepository;
  private final OperationVirementRepository operationVirementRepository;
  private final ProduitRepository produitRepository;


  public ReleveBancaireSpringJpaAdapter(ReleveBancaireRepository releveBancaireRepository,
      LigneReleveRepository ligneReleveRepository,
      OperationCreditRepository operationCreditRepository,
      OperationEspecesRepository operationEspecesRepository,
      OperationChequeRepository operationChequeRepository, ActeurRepository acteurRepository,
      BanqueRepository banqueRepository, CompteBancaireRepository compteBancaireRepository,
      OperationVirementRepository operationVirementRepository,
      ProduitRepository produitRepository) {
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
  public void addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire) {
    ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
    releveBancaireEntity.fromReleveBancaireTo(releveBancaire);

    releveBancaireRepository.save(releveBancaireEntity);
  }

  @Override
  public void qualificationrelevebancaire(Long releveBancaireId) {
    Optional<ReleveBancaireEntity> releveBancaireEntity = releveBancaireRepository.findById(
        releveBancaireId);
    if (releveBancaireEntity.isEmpty()) {
      throw new EntityNotFoundException("ReleveBancaire are not presented in database");
    }
    List<LigneReleveEntity> ligneReleveEntities = ligneReleveRepository.findAll();

    List<LigneReleveEntity> streamedLigneReleve = ligneReleveEntities.stream()
        .filter(ligneReleve -> ligneReleve.getCreditDebit().equals("C")).filter(
            ligneReleve -> ligneReleve.getOperationNature().toLowerCase().contains("virement")
                || ligneReleve.getOperationNature().toLowerCase().contains("cheque")
                || ligneReleve.getOperationNature().toLowerCase().contains("espece"))
        .collect(Collectors.toList());

    List<OperationCreditEntity> operationCreditEntityList = streamedLigneReleve.stream().map(l -> {
      OperationCreditEntity returnedOperationCredit = new OperationCreditEntity();
      String operationNature = l.getOperationNature().toLowerCase();
      if (operationNature.contains("virement")){
        returnedOperationCredit = new OperationVirementEntity(l.getRib());
      } else if (operationNature.contains("cheque")){
        returnedOperationCredit = new OperationChequeEntity(l.getNumCheck());
      } else if(operationNature.contains("espece")){
        returnedOperationCredit = new OperationEspecesEntity();
      }
      log.info("Showing operationNature " + operationNature);
      returnedOperationCredit.setLigneReleve(l);
      operationCreditRepository.save(returnedOperationCredit);
      return returnedOperationCredit;

    }).collect(Collectors.toList());
    operationCreditEntityList.forEach(System.out::println);
  }

  @Override
  public void removeReleveBancaire(ReleveBancaire releveBancaire) {
    ReleveBancaireEntity releveBancaireEntity = new ReleveBancaireEntity();
    BeanUtils.copyProperties(releveBancaire, releveBancaireEntity);
    releveBancaireRepository.delete(releveBancaireEntity);
  }

  @Override
  public List<ReleveBancaire> getReleveBancaires() {
    List<ReleveBancaireEntity> releveBancaireEntityList = releveBancaireRepository.findAll();
    return CopyUtil.copyList(releveBancaireEntityList, ReleveBancaire.class);
  }

  @Override
  public ReleveBancaire getReleveBancaireById(Long releveBancaireId) {

    ReleveBancaireEntity releveBancaireEntity = releveBancaireRepository.findByReleveBancaireId(
        releveBancaireId);
    if (releveBancaireEntity == null) {
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
    BeanUtils.copyProperties(releveBancaireEntity, releveBancaire);

  }


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
  public void createOperationEspece(
      OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain) {

  }

  @Override
  public void createoperationcheque(
      OperationChequeCreationRequestDomain operationChequeCreationRequestDomain) {

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
  public void createcomptebancaire(
      CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain) {
    Optional<ActeurEntity> acteurEntity = acteurRepository.findById(
        compteBancaireCreationRequestDomain.getActeurId());
    Optional<BanqueEntity> banqueEntity = banqueRepository.findById(
        compteBancaireCreationRequestDomain.getBanqueId());

    if (!acteurEntity.isPresent() && !banqueEntity.isPresent()) {
      throw new EntityNotFoundException(
          "You have to make sure that the acteurId and banqueId are presented in database fill the two database and then come to post creationcomptebancaire");
    }

    CompteBancaireEntity compteBancaireEntity = new CompteBancaireEntity();
    BeanUtils.copyProperties(compteBancaireCreationRequestDomain, compteBancaireEntity);
    banqueEntity.ifPresent(compteBancaireEntity::setBanqueEntity);
    acteurEntity.ifPresent(compteBancaireEntity::setActeurEntity);
    Acteur acteur = new Acteur();
    Banque banque = new Banque();
    BeanUtils.copyProperties(compteBancaireEntity, acteur);
    BeanUtils.copyProperties(compteBancaireEntity, banque);

    compteBancaireRepository.save(compteBancaireEntity);
  }

  @Override
  public void createoperationvirement(
      OperationVirementCreationRequestDomain operationVirementCreationRequestDomain) {

  }

  @Override
  public void createproduit(ProduitCreationRequestDomain produitCreationRequestDomain) {
    ProduitEntity produitEntity = new ProduitEntity();
    BeanUtils.copyProperties(produitCreationRequestDomain, produitEntity);
    produitRepository.save(produitEntity);

  }


}
