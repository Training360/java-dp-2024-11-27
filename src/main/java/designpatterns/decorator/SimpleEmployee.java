package designpatterns.decorator;

import lombok.Value;

public record SimpleEmployee(Long id, String name) implements Employee {

}
