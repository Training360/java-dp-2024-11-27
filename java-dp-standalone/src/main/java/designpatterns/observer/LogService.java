package designpatterns.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {

    @EventListener
    public void handleEvent(HelloEvent helloEvent) {
        log.info("Received HelloEvent: {}", helloEvent);
    }
}
