package designpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long id;

    private String name;

    private List<String> favouriteFoods = new ArrayList<>();

    public Employee(Employee another) {
        id = another.id;
        name = another.name;
        favouriteFoods = new ArrayList<>(another.favouriteFoods);
    }
}
