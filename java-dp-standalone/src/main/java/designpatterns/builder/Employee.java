package designpatterns.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private Long id;

    private String name;

    private EmployeeType employeeType;

    private int yearOfBirth;

    //    public Employee(Long id, String name) {
//        this.id = id;
//        this.name = name;
//        this.employeeType = EmployeeType.EXTERNAL;
//    }
//
//    public Employee(Long id, String name, int yearOfBirth) {
//        this.id = id;
//        this.name = name;
//        this.employeeType = EmployeeType.INTERNAL;
//        this.yearOfBirth = yearOfBirth;
//    }

    public static Employee externalEmployee(Long id, String name) {
        return new Employee(id, name, EmployeeType.EXTERNAL, 0);
    }

    public static Employee internalEmployee(Long id, String name, int yearOfBirth) {
        return new Employee(id, name, EmployeeType.INTERNAL, yearOfBirth);
    }

}
