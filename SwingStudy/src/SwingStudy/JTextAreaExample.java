package SwingStudy;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExample {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(10, 30); // 10행 30열 크기의 JTextArea 생성
        JScrollPane scrollPane = new JScrollPane(textArea); // 스크롤 가능하도록 JScrollPane에 JTextArea를 포함

        JButton button = new JButton("확인");

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        // 프레임을 표시
        frame.setVisible(true);
    }
}
