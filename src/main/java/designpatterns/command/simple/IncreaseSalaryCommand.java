package designpatterns.command.simple;

public record IncreaseSalaryCommand(int amount) implements Command {

    @Override
    public void execute(Employee employee) {
        employee.setSalary(employee.getSalary() + amount);
    }

    @Override
    public void undo(Employee employee) {
        employee.setSalary(employee.getSalary() - amount);
    }
}
