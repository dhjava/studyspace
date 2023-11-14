package part3;

public class Q1 {

	public static void main(String[] args) {
		int n = 1250; // 거스름돈 총액
		int cnt = 0; // 동전 갯수
		int[] coinTypes = {500, 100, 50, 10}; // 동전 종류
		
		// 동전 종류 갯수만큼 반복
		for(int i = 0; i<4; i++){
			int coin = coinTypes[i]; // 500원 동전부터 10원 동전까지 coin에 선언
            cnt += n / coin; // 거스름돈 총액을 coin 값으로 나누면 몫(동전 별 갯수) 나옴
            n %= coin; // 나머지 = 다른 동전 계산할 것
		}

		System.out.println(cnt); // 총 동전 갯수 출력
	}

}
