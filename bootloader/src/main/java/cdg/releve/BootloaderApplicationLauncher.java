package cdg.releve;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

//(exclude = {MongoAutoConfiguration.class,MongoDataAutoConfiguration.class})
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Releve Bancaire API", version = "2.0", description = "Releve Bancaire Information"))
public class BootloaderApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(BootloaderApplicationLauncher.class, args);
    }
}
