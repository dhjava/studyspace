package baekjoon2;

import java.util.Scanner;

public class Q9498 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a >= 90) {
			System.out.println("A");
		}else if(a >= 80){
			System.out.println("B");
		}else if(a >= 70){
			System.out.println("C");
		}else if(a >= 60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		sc.close();
	}

}
