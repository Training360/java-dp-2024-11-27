package designpatterns.proxy.simple;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HelloController {

    private final HelloService helloService;

    public void sayHello() {
        helloService.sayHello();
    }

    public static void main(String[] args) {
//        var helloController = new HelloController(new HelloService());
        var helloController = new HelloController(new TracingHelloServiceProxy(new HelloService()));
        helloController.sayHello();
    }
}
