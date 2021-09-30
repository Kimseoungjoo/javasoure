package test;

public class TypeTest1 {
	public static void main(String[] args) {
		// 타입 > 1) 기본타입 2) 참조타입
		// 변수의 메모리가 사용되는 방식이 달라진다.

		// 기본타입
		int age = 25;
		double price = 200.3;
		System.out.println(age);
		System.out.println(price);

		// 참조타입 = > 참조타입 / null로 초기화가 가능하다.
		// 문자열 생성 : String name = new String("java");
		String name = "java";
		String name2 = new String("java");
		String hobbby = null;// null은 heap의 주소 번지를 가르키고 있지 않다라는 의미 공백 
		

		// 값 비고 ==,!=
		// equals();
		System.out.println(name.equals(name2) ? "동일함" : "다름");
		System.out.println(name.equals(name2));
		System.out.println(hobbby);
		//System.out.println(hobbby.length());// java.lang.NullPointerException error
	}
}
