package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
//        List<String> foods = new ArrayList<>();
//        foods.add("Bread");
//        foods.add("Cake");
        Employee john = new Employee(1L, "John Doe",
                new ArrayList<>(List.of("Bread", "Cake")));

        Employee johnCopy = new Employee(john);
        john.getFavouriteFoods().add("Milk");
        System.out.println(johnCopy.getFavouriteFoods());
    }
}
