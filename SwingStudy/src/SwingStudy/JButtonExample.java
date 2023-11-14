package SwingStudy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample {

	public static void main(String[] args) {
		// 프레임 생성
		JFrame frame = new JFrame("JButton Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 프로세스 동시 종료
		frame.setSize(300, 200); // 프레임 크기
		
		// JButton 생성
		JButton button = new JButton("Click Me"); // 화면 버튼 생성

		// 버튼에 ActionListener 등록
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Button clicked!");  // 콘솔창에 출력
			}
		});

		// 버튼을 프레임에 추가
		frame.add(button);

		// 프레임을 표시
		frame.setVisible(true);
	}

}
