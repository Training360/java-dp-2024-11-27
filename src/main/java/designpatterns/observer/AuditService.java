package designpatterns.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuditService {

    @EventListener
    public void audit(Object object) {
        log.info("Object: {}", object);
    }

    @EventListener
    public void handleEvent(HelloEvent event) {
        log.info("Audit: {}", event);
    }
}
