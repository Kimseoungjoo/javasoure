import java.util.Scanner;

// = 대입연산자
// 산술연산자 (+, -, *, /) String + ? > 붙여서 보여준다
// int / int >> int 로만 나온다 
// 둘 중 하나는 실수형이여야 > 나눌 때 실수형 
/* 결합형 연산자(산술연산자+대입연산자)
 * +=, =+
 * -=, =-
 * *=, =*
 * /=, =/
 * %=, =%
 * 증감연산자 (++, --)
 */
public class MathMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		k.close();
		System.out.println("-------------");
		System.out.printf("x : %d, y: %d \n", x, y);

		String laugh = "z";
		String aa = x + laugh;
		System.out.println(aa);
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;

		double dd = x / y;
		double ddd = x / (double) y;

		int e = x % y;

		System.out.println("더하기 : " + a);
		System.out.println("뺴기 " + b);
		String bb = "곱하기 : " + c;
		System.out.println(bb);
		System.out.println("곱은 " + c);// 위에 내용과 같다 변수를 덜쓰면 더 좋은 프로그램
		System.out.println("나누기 : " + d);
		System.out.println("나누기 : " + dd);
		System.out.println("나누기 : " + ddd);
		System.out.println("나머지 : " + e);
		System.out.println("------------------------");

		x += 3; // x = x + 3; 이랑 같은 의미다
		System.out.println(x);
		y -= 3; // y = y -3;
		System.out.println(y);
		x *= 5; // x = x * 5;
		System.out.println(x);
		y /= 3; // y = y / 3;
		System.out.println(y);
		x %= 4; // x = x % 4;
		System.out.println(x);
		x++; // x = x + 1; / x += 1;
		System.out.println(x);

	}
}
// java : 컴퓨터중심 
// pyton : 인간중심 
