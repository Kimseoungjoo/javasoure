package exam;
/* 변수의 유효범위
 * 1. 선언된 블록 내에서만 사용가능
 * 2. 지역(local)변수는 반드시 초기화를 해야한다. 
 * 3. 변수 지정을 잘해야한다. ^^
 */
public class VariableTest1 {
	// 변수
	private int num1;// 영역은 class {} 안에 전부 사용가능 

	// 메소드
	// 메소드 안에 들어가는 변수들은 stack에 쌓이게 된다 떄문에 변수가 자동 초기화된다.
	public static void main(String[] args) {
		int num2 = 0;// main 메소드 {} 안에서 사용가능하다(local 변수) 
		
		if (num2 < 10 ) {
			System.out.println(num2);
			int num3 =3;// if 함수 안에서만 사용 가능
		}
//		System.out.println(num3); <<< error 오류가 나온다 num3 영역 밖이기 때문이다.
		for(int i = 0 ; i<5;i++) {
			System.out.println(i+"  ");
		}
//		System.out.println(i); << for함수 안에서 변수를 지정했기때문에  for함수영역에 제한된다
	}
	public void print() {
		System.out.println(num1);
//		System.out.println(num2); << num2 영역은 main 메소드에서만 사용가능
	}
}
