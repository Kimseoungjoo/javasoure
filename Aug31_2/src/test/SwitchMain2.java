package test;

//import java.util.Scanner;
//�ϰ� �� �ϴ� ��, ��, ���, ��� ������ ��� Ǯ��� 
//ĳ���Ͱ� �޾ƺ���
public class SwitchMain2 {
	public static void main(String[] args) {

		// A or a > ���ȸ��
		// B or b > �Ϲ�ȸ��
		// �ƹ��͵� ���� > �մ�
		//Scanner k = new Scanner(System.in);
		//System.out.print("�մ� ȸ�� ���(A,B,..) :");
		//char grade = k.next().charAt(0); // scanner�� string���θ� ���� �� �ִ�. 
		//�ڿ� charAt�Լ�����ؾ���
		char grade = 'b';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;
		default:
			System.out.println("�մ�");
			break;
		}
		if ((grade == 'A') || (grade == 'a')) {
			System.out.println("���ȸ��");
		} else if ((grade == 'B') || (grade == 'b')) {
			System.out.println("�Ϲ�ȸ��");
		} else
			System.out.println("�մ�");

	}
}
