package exam;

public class PrintTest {
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System.out.print(true);// �������X
		// + : ���ڿ��� ���� ����� �ϰԵǸ� ������ �ǹ̷� ����
		System.out.println("����ٰ��� �������" + a/* �����ִ� ��� */);// ������� >> ���� �ѹ��� �ǹ�
		// System.out.printf();//�������X
		System.out.println(a + b);
		String str = "abc" + 3; // �̋� + �� �ǹ̴� ������ �� 3�� ���ڷ� �ȴ�
		System.out.println(str);
	}
}
