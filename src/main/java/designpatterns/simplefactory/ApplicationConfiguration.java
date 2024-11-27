package designpatterns.simplefactory;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @ConditionalOnProperty(name = "simplefactory.payment", havingValue = "hourly")
    public Payment hourly() {
        return new HourlyPayment();
    }

    @Bean
    @ConditionalOnProperty(name = "simplefactory.payment", havingValue = "monthly")
    public Payment monthly() {
        return new MonthlyPayment();
    }
}
