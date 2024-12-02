package designpatterns.adapter;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class EmployeesTableModelAdapter implements TableModel {

    private List<Employee> employees;

    @Override
    public List<String> getColumns() {
        return List.of("ID", "NAME", "SALARY");
    }

    @Override
    public int getRowCount() {
        return employees.size();
    }

    @Override
    public String getValueAt(int row, int column) {
        Employee employee = employees.get(row);
        return switch (column) {
            case 0 -> Long.toString(employee.id());
            case 1 -> employee.name();
            case 2 -> Integer.toString(employee.salary());
            default -> throw new IllegalStateException("Unexpected value: " + column);
        };
    }
}
