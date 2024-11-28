package designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Employee {

    private String name;

    private int salary;

    private Deque<EmployeeMemento> mementos = new ArrayDeque<>();

    public void changeName(String newName) {
        // Értékmásolás?
        // MapStruct
        mementos.push(new EmployeeMemento(name, salary));
        this.name = newName;
    }

    public void undo() {
        var memento = mementos.pop();
        name = memento.name();
        salary = memento.salary();
    }

    public static void main(String[] args) {
        var employee = new Employee();
        employee.changeName("John Doe");
        employee.changeName("Jack Doe");
        System.out.println(employee.name);

        employee.undo();
        System.out.println(employee.name);
    }
}
