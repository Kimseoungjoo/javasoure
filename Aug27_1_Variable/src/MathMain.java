import java.util.Scanner;

// = ���Կ�����
// ��������� (+, -, *, /) String + ? > �ٿ��� �����ش�
// int / int >> int �θ� ���´� 
// �� �� �ϳ��� �Ǽ����̿��� > ���� �� �Ǽ��� 
/* ������ ������(���������+���Կ�����)
 * +=, =+
 * -=, =-
 * *=, =*
 * /=, =/
 * %=, =%
 * ���������� (++, --)
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

		System.out.println("���ϱ� : " + a);
		System.out.println("���� " + b);
		String bb = "���ϱ� : " + c;
		System.out.println(bb);
		System.out.println("���� " + c);// ���� ����� ���� ������ ������ �� ���� ���α׷�
		System.out.println("������ : " + d);
		System.out.println("������ : " + dd);
		System.out.println("������ : " + ddd);
		System.out.println("������ : " + e);
		System.out.println("------------------------");

		x += 3; // x = x + 3; �̶� ���� �ǹ̴�
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
// java : ��ǻ���߽� 
// pyton : �ΰ��߽� 
