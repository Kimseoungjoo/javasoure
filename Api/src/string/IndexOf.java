package string;

public class IndexOf {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// 매개값으로 주어진 문자열이 시작되는 위치를 리턴 
		int index = str1.indexOf("프로그래밍");
		System.out.println(index);
		
		System.out.println("못 찾는 경우"+str1.indexOf("파이썬"));
		System.out.println();
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65/*'A'문자 찾기*/));
		System.out.println(str2.indexOf('f')); // f라는 문자 찾기 
		System.out.println(str2.indexOf("el",2)); // el을 2번째 문자부터 찾는다
		
		System.out.println("l 찾기 "+ str2.lastIndexOf('l'));
		
		// 그가 들어있는지 확인 하는 방법 
		System.out.println( str1.indexOf('그')>-1 ? "포함하고있다":"포함하고 있지않다.");
		
		
	}
	
}
