package baekjoon2;

import java.util.Scanner;

public class Q2525_wrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if((b+c)<60){
			System.out.println(a + " " + (b+c));
		}else{
			int d = (a+(b+c)/60);
			int e = (60-((b+c)/((b+c)/60)));
			if(d<24){
			System.out.println(d + " " + Math.abs(e));
			}else{
				System.out.println((24-d) + " " + Math.abs(e));
			}
		}
		
		sc.close();
	}

}
