package designpatterns.simplefactory;

import java.nio.file.Path;
import java.time.LocalDateTime;

public class SimpleFactoryMain {

    public static void main(String[] args) {
        Payment payment = Payment.createPayment("h");
        System.out.println(payment instanceof HourlyPayment);

        LocalDateTime localDateTime = LocalDateTime.now();
        // NE HASZNÁLD: File
        Path path = Path.of("./pom.xml");
    }
}
