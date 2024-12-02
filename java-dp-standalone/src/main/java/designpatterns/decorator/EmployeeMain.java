package designpatterns.decorator;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new SimpleEmployee(1L, "John Doe");

        employee = new UppercaseEmployeeDecorator(employee);

        System.out.println(employee.name());

    }
}
