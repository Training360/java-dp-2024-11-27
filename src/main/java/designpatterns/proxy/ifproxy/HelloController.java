package designpatterns.proxy.ifproxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@AllArgsConstructor
public class HelloController {

    private final HelloService helloService;

    public String sayHello() {
        return helloService.sayHello();
    }

    public static void main(String[] args) {
        // Implementálás esetén a Spring
        // Java Dynamic proxy
        var target = new ConsoleHelloService();

        HelloService proxy = (HelloService) Proxy.newProxyInstance(
                HelloController.class.getClassLoader(),
                new Class[]{HelloService.class},
                (proxy1, method, args1) -> {
                    long start = System.currentTimeMillis();
                    // args változó tartalmazza a paramétereket
                    var result = target.sayHello();
                    long end = System.currentTimeMillis();
                    System.out.println("Time: " + (end - start));
                    return result;
                }
        );

        // Leszármazás: bytekód generálás - CGLIB

        var controller = new HelloController(proxy);
        var result = controller.sayHello();
        System.out.println("Result: " + result);

    }
}
