package SwingStudy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class JTextFieldExample {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20); // 너비 20의 JTextField 생성
        JButton button = new JButton("확인");

        frame.add(textField);
        frame.add(button);

        // 프레임을 표시
        frame.setVisible(true);
    }
}
