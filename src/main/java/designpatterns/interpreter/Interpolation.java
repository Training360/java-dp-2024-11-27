package designpatterns.interpreter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Interpolation {

    public static void main(String[] args) {
        String name = "John Doe";
//        String message = "Hello " + name + "!";

        String message = "Hello %s!".formatted(name);
        System.out.println(message);

        log.info("Hello {}!", name);
    }
}
