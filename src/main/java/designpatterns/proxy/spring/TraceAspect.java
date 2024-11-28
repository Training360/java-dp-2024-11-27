package designpatterns.proxy.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class TraceAspect {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(TraceAspect.class);

    @Around(value = "execution(* designpatterns.proxy.spring.EmployeeService.findAllNames(..))")
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        if (result instanceof List) {
            result = ((List<String>) result).stream().map(String::toUpperCase).toList();
        }

        log.info("Duration: {} ms", endTime - startTime);
        return result;
    }
}
