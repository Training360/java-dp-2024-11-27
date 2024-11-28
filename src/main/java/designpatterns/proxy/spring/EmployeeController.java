package designpatterns.proxy.spring;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    public List<String> findAllNames() {
        log.info("employeeService.class: {}", employeeService.getClass().getName());
        return employeeService.findAllNames();
    }
}
