package arsw.CoronavirusApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"arsw"})
public class CoronavirusApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoronavirusApiApplication.class, args);
    }
}
