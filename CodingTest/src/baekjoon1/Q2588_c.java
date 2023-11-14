package baekjoon1;

import java.util.Scanner;

// https://st-lab.tistory.com/20 참고
public class Q2588_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*	a는 int, b는 String
			charAt() 사용해서 자리수 추출함.
			charAt() = 문자열 인덱스 위치에 있는 문자값 반환 */
		int a = sc.nextInt();
		String b = sc.next();
		
		sc.close();

		// [- '0'] 해주는 이유 = 아스키 코드값으로 0은 32
		// 1부터 아스키코드도 1씩 올라가므로 문자열 0을 빼주면 됨
		System.out.println(a*(b.charAt(2) - '0'));
		System.out.println(a*(b.charAt(1) - '0'));
		System.out.println(a*(b.charAt(0) - '0'));
		System.out.println(a*Integer.parseInt(b));
	}
}

