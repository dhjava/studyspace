package SwingStudy;

import javax.swing.JFrame;

public class SimpleJFrameExample {

	public static void main(String[] args) {
		// JFrame 객체 생성
		JFrame frame = new JFrame("간단한 JFrame 예제");
		
		// 창 닫기 버튼 클릭 시 프로그램 종료 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨테이너 크기 설정(폭, 높이)
		frame.setSize(400, 300);
		
		// 컨테이너를 화면 중앙에 배치(null값 = 중앙)
		frame.setLocationRelativeTo(null);
		
		// JFrame을 보이도록 설정
		frame.setVisible(true);
	}

}
