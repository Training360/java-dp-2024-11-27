package designpatterns.simplefactory;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SimpleFactoryApplication implements CommandLineRunner {

    private final Payment payment;

    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        payment.pay();
    }


}
