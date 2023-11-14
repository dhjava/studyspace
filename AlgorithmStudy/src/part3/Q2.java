package part3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int[] arr = new int[N];
		for(int i = 0; i<M; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int first = arr[N-1];
		int second = arr[N-2];

		int cnt = (M / (K+1)) * K;
		cnt += M % (K + 1);

		int result = 0;
		result += cnt * first;
		result += (M - cnt) * second;

		System.out.println(result);


	}

}
