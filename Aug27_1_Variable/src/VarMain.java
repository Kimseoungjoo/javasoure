//	변수(Variable)
//	프로그램 진행 중에 만들어진 데이터 
// CPU - 연산장치 > 좋으면 빠름 
// RAM - 저장장치 > 좋으면 많이 저장
//              공간 
//				stack  - 프로그램 종료시 자동반납 > 종료가 안된다면 ?? >> 계속 유지 > 수동으로 반납이 불가능 
//				static - 
//				heap   - 자동반납이 되지 않는다. > 개발자가 수동으로 반납처리를 해야한다. 
//  					 java에는 GarbageCollection 기능이 heap영역 자동정리 시스템이 있다. - 
// SSD/HDD - 저장장치 
// GPU - 그래픽 표현하는데 필요한(연산+저장(RAM+HDD)
// 1bit = 0/1
// 1byte 
//자료형 
//	   기본형
//		  정수 - byte(1byte : -100~100), short(2byte - 6만~6만) , int(4byte -21억~21억)***, long
//		  실수 - float(4), double(8)**** 
//		  글자 - char(2)
//		  논리 - boolean(1)
//		  없다 - void, null
//	   참조형
//		  문자열 - string  << 컴퓨터 32bit/64bit 사이즈 정해준다 
//					참조형은 heap에 저장한다. 다른 변수들은 stack에 쌓인다 
//	변수명 
//		숫자로 시작 불가, 
//		특수문자 불가($는 괜찮음)
//		자바문법 불가 
public class VarMain {

	public static void main(String[] args) {
		int kor;
		double tem = 24.38;
		kor = 80;
		System.out.println("korscore");
		System.out.println(kor);
		System.out.print("현재기온은 : ");
		System.out.print(tem);
		System.out.println("도 입니다");
		
		float temp= (float) 24.38; // 형변환(casting);
		System.out.println(temp);
		
		char laugh = 'z';
		System.out.println(laugh);
		
		String laugh2 = "이제 가을이야...";
		System.out.println(laugh2);
		
		boolean isHungry = true;
		System.out.println(isHungry);
		
		/* Java에서 지역변수를 만들고 값을 안넣으면 사용이 불가능
		 * int age; 
		 * System.out.println(age);
		 */
		int age=27;
		System.out.println(age);
	}
}