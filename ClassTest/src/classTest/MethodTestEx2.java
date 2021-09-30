package classTest;

public class MethodTestEx2 {
	public static void main(String[] args) {

		MethodTest2 obj = new MethodTest2();
		// 메소드 호출시 리턴되는 값이 있는 경우
		// 구구단 출력 가능
		obj.print99dan();
		System.out.println(obj.multiply(123, 234));
		
		// 덧셈 기능
		// 메소드를 호출하는 쪽에서 입력값을 넣어준다.
		
		byte b1 = 3;
		byte b2 = 5;
		
		System.out.println(obj.sum(b1, b2));
		
		
		
		
	}

}
