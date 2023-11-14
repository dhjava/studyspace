package SwingStudy;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableExample {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 열 이름
        String[] columnNames = {"Name", "Age", "Gender"};
        // 데이터 입력
        Object[][] data = {
            {"John", 25, "Male"},
            {"Alice", 30, "Female"},
            {"Bob", 28, "Male"},
            {"Eve", 22, "Female"}
        };

        // JTable은 추가, 삭제 기능 이용 못하지만 dtm 사용시 addRow(), removeRow() 사용 가능
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // JScrollPane은 자신 위에 올려진 UI들이 칸이 부족하면 위 아래로 스크롤 제공하여 보여줌.
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
