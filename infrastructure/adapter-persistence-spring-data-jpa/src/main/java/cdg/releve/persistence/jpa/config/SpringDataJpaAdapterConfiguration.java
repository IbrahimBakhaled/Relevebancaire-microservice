package cdg.releve.persistence.jpa.config;


import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.adapter.ReleveBancaireSpringJpaAdapter;
import cdg.releve.persistence.jpa.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = {"cdg.releve", "cdg.releve.domain", "cdg.releve.persistence"})
public class SpringDataJpaAdapterConfiguration {
    @Bean
    public ReleveBancairePersistencePort getReleveBancairePersistencePort(
            OperationCreditRepository operationCreditRepository,
            LigneReleveRepository ligneReleveRepository,
            ReleveBancaireRepository releveBancaireRepository,
            OperationEspecesRepository operationEspecesRepository,
            OperationChequeRepository operationChequeRepository,
            ActeurRepository acteurRepository,
            BanqueRepository banqueRepository,
            CompteBancaireRepository compteBancaireRepository,
            OperationVirementRepository operationVirementRepository,
            ProduitRepository produitRepository){
        return new ReleveBancaireSpringJpaAdapter(releveBancaireRepository, ligneReleveRepository, operationCreditRepository, operationEspecesRepository, operationChequeRepository, acteurRepository, banqueRepository, compteBancaireRepository, operationVirementRepository, produitRepository);
    }

//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//        return sessionFactory;
//    }

}
