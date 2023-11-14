package SwingStudy;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {

	public static void main(String[] args) {
		// 프레임 생성
		JFrame frame = new JFrame("JPanel Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 프로세스 동시 종료
		frame.setSize(300, 200); // 프레임 크기
		
		// JPanel 생성
		// JPanel은 주로 다른 컴퍼넌트들을 그룹화하거나 레이아웃을 구성하는 데 사용함.
		// JPanel만으로 화면에 보이지 않으므로 JFrame 안에 추가해야함.
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout()); // 레이아웃을 FlowLayout(좌측에서 우측 배열)으로 설정

		// JLabel과 JButton 추가
		JLabel label = new JLabel("안녕하세요!");
		JButton button = new JButton("클릭해주세요!");

		// JPanel에 컴포넌트를 추가
		panel.add(label);
		panel.add(button);

		// 프레임에 JPanel 추가
		frame.add(panel);
		
		// JFrame을 보이도록 설정
		frame.setVisible(true);
	}

}
