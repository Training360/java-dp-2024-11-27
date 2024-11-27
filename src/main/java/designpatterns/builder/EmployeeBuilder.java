package designpatterns.builder;

public class EmployeeBuilder {

    private String name = "Anonymous";

    private EmployeeType employeeType;

    private int yearOfBirth;

    public EmployeeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder withType(EmployeeType employeeType) {
        this.employeeType = employeeType;
        return this;
    }

    public EmployeeBuilder withYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    public Employee build() {
        if (employeeType == null) {
            throw new IllegalStateException("Employee type not set");
        }
        if (employeeType == EmployeeType.INTERNAL && yearOfBirth == 0) {
            throw new IllegalStateException("Employee year of birth not set when employee type is INTERNAL");
        }
        return new Employee(null, name, employeeType, yearOfBirth);
    }
}
