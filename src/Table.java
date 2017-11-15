import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.LinkedList;

/**
 * Created by fk1836ql on 11/15/2017.
 */
public class Table extends JFrame {
    private JPanel containsTable;
    private JTable table1;

    protected Table(){
        setContentPane(containsTable);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        HelloDataModel model = new HelloDataModel();
        table1.setModel(model);
    }
}

class HelloDataModel extends AbstractTableModel {

    LinkedList<String> snakes;

    HelloDataModel() {
        snakes = new LinkedList<String>();
        snakes.add("Cobra");
        snakes.add("Boa Constrictor");
        snakes.add("Python");

    }
    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (col == 0) return row;
        else if (col ==1) return snakes.get(row);
        else return null;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
}
