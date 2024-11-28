package designpatterns.observer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class HelloService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void sayHello() {
        log.info("Hello World");
        applicationEventPublisher.publishEvent(new HelloEvent("Hello Event"));
    }
}
