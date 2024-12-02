package designpatterns.adapter;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Table {

    private TableModel tableModel;

    public void print() {
        for (String column: tableModel.getColumns()) {
            System.out.print(column + "|");
        }
        System.out.println();

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumns().size(); j++) {
                System.out.print(tableModel.getValueAt(i, j) + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Table(new EmployeesTableModelAdapter(
                List.of(
                        new Employee(1L, "John Doe", 100),
                        new Employee(2L, "Jack Doe", 200)
                        )
        )).print();
    }
}
