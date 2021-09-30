package test;
//기본지식 코드는 항상 위에서 아래로 실행

public class LoopTest2 {

	public static void main(String[] args) {
		// 1~10까지 합
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.print(sum+" ");
		}
		
		System.out.println("\n1~10까지의 합 : "+sum); // 55 
		
		sum=0;//sum 안에 있는 데이터 초기화 작업
		
		for(int i=1;i<101;i++) {
			sum+=i;
			System.out.println(sum);
		}
		
		System.out.println("1~100까지의 합 : " + sum);
		
	}
}
