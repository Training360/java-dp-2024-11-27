package designpatterns.adapter;

import java.util.List;

public interface TableModel {

    List<String> getColumns();

    int getRowCount();

    String getValueAt(int row, int column);
}
