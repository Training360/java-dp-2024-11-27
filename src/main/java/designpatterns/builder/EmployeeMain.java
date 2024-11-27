package designpatterns.builder;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee =
                Employee.builder()
                        .id(1L)
                        .name("John Doe")
                        .yearOfBirth(1980)
                        .build();
        System.out.println(employee.toString());
//        Employee employee = new Employee(1L, "John Doe", 1980);

        String line = "1, John Doe, 1980";
        String[] parts = line.split(", ");
        long id = Long.parseLong(parts[0]);
        String name = parts[1];
        int yearOfBirth = Integer.parseInt(parts[2]);

        Employee parsed = new Employee(id, name, EmployeeType.INTERNAL, yearOfBirth);
    }
}
