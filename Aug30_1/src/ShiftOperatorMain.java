import java.util.Scanner;

//	ex) 24�ð�� = 1 << 0 :1
//		���� 	=	 1 << 1 : 2
//		����	=	 1 << 2 : 4
//		�������� = 	 1 << 3 : 8
//		���    =  1 << 4 : 16
//	EX)
//	AƯ�� = 1 > 24�ð�
//	B	  = 2 > ����
//	C	  = 8 > ��������
//	D	  = 3 > 24�ð� + ����
//	E	  = 6 > 4+2 ���� + ����
//	F	  = 10 > 8 +2 ���� + ��������  
//	G	  = 11 > 8 + 2 + 1 24�ð�,����,��������
//	H 	  = 13 > 8 + 4 + 1 �������� + �� + 24�� 
//	��κ� 2�� ����
//		a < 2
//		1 + 2
//	1��(����) ����
//		!d
//	3�׿���
//	�����ڴ� stack������ ����̴� 
public class ShiftOperatorMain {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է�(1~31) : ");

		int value = k.nextInt();
		k.close();
		// �迭, �÷���
		if (value >= 16) {
			System.out.print("��� ");
			value -= 16;
		}
		if (value >=8) {
			System.out.print("�������� ");
			value -= 8;
		}
		if (value >= 4) {
			System.out.print("���� ");
			value -= 4;
		}
		if (value >= 2) {
			System.out.print("���� ");
			value -= 2;
			System.out.println((value == 1) ? "24�ð��" : "\n");
		}

	}
}
