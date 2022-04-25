package cdg.releve.application.rest.configuration;
import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;


@Configuration
// this configuration class used to disable/do not expose certain apis like the workflow service
public class MyDataRestConfiguration implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

    // Array of unsupported HTTP Endpoints
    // I commented this out because I tried spring cloud api gateway to send a post to the banckend and it fails
    //it gaves me 405 not allowed
//    HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST};
    HttpMethod[] theUnsupportedActions = {HttpMethod.PUT};

    // desactiver les methods PUT, POST  pour service workflow
    // here we are making the endpoint of workflows service Read-Only
    // it will return 405 Not Allowed in Postman

    config.getExposureConfiguration()
        .forDomainType(LigneReleveEntity.class)
        .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
        .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
  }
}
