package SwingStudy;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
    
    //JTree = 트리 형태의 데이터를 표시하는 데 사용되는 컴포넌트
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 기본 루트 설정
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");

        // 하위 항목 설정1
        DefaultMutableTreeNode citrus = new DefaultMutableTreeNode("Citrus");
        citrus.add(new DefaultMutableTreeNode("Orange"));
        citrus.add(new DefaultMutableTreeNode("Lemon"));
        citrus.add(new DefaultMutableTreeNode("Lime"));

        // 하위 항목 설정2
        DefaultMutableTreeNode berries = new DefaultMutableTreeNode("Berries");
        berries.add(new DefaultMutableTreeNode("Strawberry"));
        berries.add(new DefaultMutableTreeNode("Blueberry"));
        berries.add(new DefaultMutableTreeNode("Raspberry"));

        // 루트에 항목 추가
        root.add(citrus);
        root.add(berries);

        JTree tree = new JTree(root);

        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
