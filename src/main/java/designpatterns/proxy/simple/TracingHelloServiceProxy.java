package designpatterns.proxy.simple;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TracingHelloServiceProxy extends HelloService {

    private HelloService target;

    @Override
    public void sayHello() {
        long startTime = System.currentTimeMillis();
        target.sayHello();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
