package designpatterns.command.simple;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.Deque;

@Data
public class Employee {

    private long id;

    private String name;

    private int salary;

    private Deque<Command> commands = new ArrayDeque<>();

    public void apply(Command command) {
        command.execute(this);
        commands.push(command);
    }

    public void undo() {
        commands.pop().undo(this);
    }
}
