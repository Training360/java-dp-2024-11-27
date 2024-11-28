package designpatterns.proxy.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

//    @Cacheable("names")
    public List<String> findAllNames() {
        log.info("findAllNames");
        return List.of("Jack", "John", "Jane");
    }
}
