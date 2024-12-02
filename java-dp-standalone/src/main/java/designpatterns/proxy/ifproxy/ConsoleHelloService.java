package designpatterns.proxy.ifproxy;

public class ConsoleHelloService implements HelloService {

    @Override
    public String sayHello() {
        System.out.println("hello");
        return "Hello";
    }
}
