package test1;

public class BreakTest2 {
	public static void main(String[] args) {
		// 숫자를 0에서부터 하나씩 증가시키면서 합계를 구하기
		// 단, 합계가 100이 넘으면 반복문 종료
		int i = 0;
		int sum = 0;
	
		while (true) {
			i++;
			sum += i;
			System.out.println(sum);
			if (sum > 100) {
				break;
			}
		}
		
		System.out.printf("%d ㄲㅏ지의 총 합 : %d", i, sum);
	
	}

}
