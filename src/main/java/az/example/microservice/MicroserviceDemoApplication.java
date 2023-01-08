package az.example.microservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Spring Boot Microservice", version = "V0.0.1",
        description = "Demo Spring Boot Project"))
@SpringBootApplication
public class MicroserviceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDemoApplication.class, args);
    }

}
