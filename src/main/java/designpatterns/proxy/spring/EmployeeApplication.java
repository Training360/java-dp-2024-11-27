package designpatterns.proxy.spring;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
@EnableCaching
public class EmployeeApplication implements CommandLineRunner {

    private final EmployeeController employeeController;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            var result = employeeController.findAllNames();
            log.info("Result: {}", result);
        }
    }
}
