package baekjoon2;

import java.util.Scanner;

public class Q2753 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a%4!=0){
			System.out.println("0");
		}else if(a%4==0 && a%400==0){
			System.out.println("1");
		}else if(a%4==0 && a%100==0){
			System.out.println("0");		
		}else{
			System.out.println("1");
		}

		sc.close();
	}

}
