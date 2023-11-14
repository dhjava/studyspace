package SwingStudy;

import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class TestFrame extends JFrame{

	public TestFrame() {
		setTitle("500x300 프레임 만들기"); // 프레임 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 시 프로세스까지 종료
		setSize(500,300); // 프레임 크기 설정
		
		Container contentPane = getContentPane(); // 프레임에서 컨텐트팬 받아오기
		contentPane.setLayout(null); // 컴포넌트 좌표 정해서 붙일 수 있음.
		
		JLabel lblNewLabel = new JLabel("레이블 테스트 입니다");
		lblNewLabel.setBounds(182,133,124,15); // 레이블 위치 설정
		contentPane.add(lblNewLabel); // 콘텐트팬에 레이블 붙이기
		
		JButton btnNewButton = new JButton("버튼 테스트");
		btnNewButton.setBounds(182,59,110,23);
		contentPane.add(btnNewButton);
		
		JTextField textField = new JTextField();
		textField.setBounds(190,203,96,21);
		contentPane.add(textField);
		textField.setColumns(10);
		setVisible(true); // 화면에 프레임 출력
	}
	public static void main(String[] args) {
		TestFrame mf = new TestFrame();
	}

}
