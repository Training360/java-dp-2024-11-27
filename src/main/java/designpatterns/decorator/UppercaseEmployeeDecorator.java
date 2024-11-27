package designpatterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UppercaseEmployeeDecorator implements Employee {

    private Employee target;

    @Override
    public Long id() {
        return target.id();
    }

    @Override
    public String name() {
        return target.name() == null ? null : target.name().toUpperCase();
    }
}
