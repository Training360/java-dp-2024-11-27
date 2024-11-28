package designpatterns.command.spring;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.Duration;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
@EnableScheduling
public class Scheduler implements CommandLineRunner {

    private TaskScheduler taskScheduler;

    public static void main(String[] args) {
        SpringApplication.run(Scheduler.class, args);
    }

    @Override
    public void run(String... args) {
        taskScheduler.scheduleAtFixedRate(() -> log.info("hello"), Duration.ofSeconds(1));
    }
}
