package designpatterns.command.simple;

public class EmployeeMain {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.apply(new ChangeNameCommand(null, "Jack Doe"));
        System.out.println(employee);

        employee.apply(new ChangeNameCommand("Jack Doe", "John Doe"));
        System.out.println(employee);

        employee.apply(new IncreaseSalaryCommand(10_000));
        System.out.println(employee);

        employee.undo();
        System.out.println(employee);

        employee.undo();
        System.out.println(employee);
    }
}
