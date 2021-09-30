package exam;

public class PrintTest {
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System.out.print(true);// 공백허용X
		// + : 문자열과 같이 사용을 하게되면 연결의 의미로 사용됨
		System.out.println("여기다가는 마음대로" + a/* 변수넣는 방법 */);// 공백허용 >> 엔터 한번의 의미
		// System.out.printf();//공백허용X
		System.out.println(a + b);
		String str = "abc" + 3; // 이떄 + 의 의미는 연결이 때 3은 문자로 된다
		System.out.println(str);
	}
}
