package baekjoon2;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = b - 45;

		if(c<0){
			int d = a - 1;

			if(d<0){
				System.out.println((24 + d) + " " + (60 + c));
			}else{
			System.out.println(d + " " + (60 + c));
			}
		}else{
			System.out.print(a + " " + c);
		}
		
		sc.close();
	}

}
