package designpatterns.command.simple;

public record ChangeNameCommand(String oldName, String newName) implements Command {

    @Override
    public void execute(Employee employee) {
        employee.setName(newName);
    }

    @Override
    public void undo(Employee employee) {
        employee.setName(oldName);
    }
}
