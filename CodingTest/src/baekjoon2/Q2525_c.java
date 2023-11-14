package baekjoon2;

import java.util.Scanner;

public class Q2525_c {

	public static void main(String[] args) {
		// a는 현재 시간 b는 현재 분 c는 추가되는 분(1000분=약 16시간 까지)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// c를 60분으로 나누면 시간이 나오니 그만큼 a 더해주기
		a += c / 60;
		// c를 60분으로 나눈 나머지는 추가되는 분이므로 b 더해주기
		b += c % 60;

		// b가 60분을 초과할 경우
		if(b >= 60){
			// a는 1 추가
			a += 1;
			// b는 60 마이너스
			b -= 60;
		}

		// a가 24를 초과할 경우
		if(a >= 24){
			// a에 24 빼주기
			a -= 24;
		}
		
		System.out.println(a + " " + b);
		sc.close();
	}

}
