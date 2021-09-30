package classTest;

/*
 * 리턴타입 메소드명 (....)
 * 
 * 		리턴타입이 void 인 것을 제외한다면 
 * 		무조건 return 키워드가 들어와야한다. 
 */
public class MethodTest2 {
	
	
	// 두 개의 숫자를 받아서 더한 결과를 보내주기
	// 정수형의 두 개의 숫자 (입력값
	int sum(int num1, int num2)	{
		// return num1+num2;
		int result = num1+num2;
		return result; // 출력값(반환값)
	}
	
	// 구구단 2-9단 출력하기
	// void
	// 입력값 : 없음 반환값 : 없음
	void print99dan()	{
		for(int i = 2; i<10;i++) {
			for(int j = 1; j<10;j++	) {
			System.out.printf("%d x %d = %d \n",i,j,i*j);	
				
			}
			System.out.println("=========================");
		}
		
	}
	
	
	// 두 개의 정수를 받아서(입력값) 곱하기한 결과를 리턴하기
	int multiply(int num1, int num2) {

	int result = num1*num2;
	return result;	
	
	}
	
}
