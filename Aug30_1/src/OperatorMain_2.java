import java.util.Scanner;

//	기타연산자*****
//		<<, >> ,<<<(shift 연산자)
//	ex) 24시간운영 = 1 << 0 :1
//		주차 	=	 1 << 1 : 2
//		흡연실	=	 1 << 2 : 4
//		와이파이 = 	 1 << 3 : 8
//	EX)
//	A특성 = 1 > 24시간
//	B	  = 2 > 주차
//	C	  = 8 > 와이파이
//	D	  = 3 > 24시간 + 주차
//	E	  = 6 > 4+2 주차 + 흡연실
//	F	  = 10 > 8 +2 주차 + 와이파이  
//	G	  = 11 > 8 + 2 + 1 24시간,주차,와이파이
//	대부분 2항 연산
//		a < 2
//		1 + 2
//	1항(단항) 연산
//		!d
//	3항연산
//	연산자는 stack영역이 대상이다 
public class OperatorMain_2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("나이는 ? :");
		int age = k.nextInt();
		k.close();

		// 이름이 홍길동이면 어 .. 야, 아니면 어서오세요
		System.out.println((name.equals("홍길동")) ? "야!!!" : "어서오세요");
		//String say = (name == "홍길동"(X)틀림) ? "야" : "나가"; >> heap에 저장되기때문에 stack영역이 대상인 연산자는 불러올수 없다 그래서 에러
		//System.out.println(say);
		// 20살 이상이면 안녕하세요, 아니면 나가
		// 3항연상 조건식 '?' o일 떄 값(true) : x때 값(false)
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		// 나이가 짝수면 짝, 홀수면 홀
		System.out.println((age % 2 == 0) ? "짝" : "홀");

	}
}
