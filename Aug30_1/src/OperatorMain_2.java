import java.util.Scanner;

//	��Ÿ������*****
//		<<, >> ,<<<(shift ������)
//	ex) 24�ð�� = 1 << 0 :1
//		���� 	=	 1 << 1 : 2
//		����	=	 1 << 2 : 4
//		�������� = 	 1 << 3 : 8
//	EX)
//	AƯ�� = 1 > 24�ð�
//	B	  = 2 > ����
//	C	  = 8 > ��������
//	D	  = 3 > 24�ð� + ����
//	E	  = 6 > 4+2 ���� + ����
//	F	  = 10 > 8 +2 ���� + ��������  
//	G	  = 11 > 8 + 2 + 1 24�ð�,����,��������
//	��κ� 2�� ����
//		a < 2
//		1 + 2
//	1��(����) ����
//		!d
//	3�׿���
//	�����ڴ� stack������ ����̴� 
public class OperatorMain_2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = k.next();
		System.out.print("���̴� ? :");
		int age = k.nextInt();
		k.close();

		// �̸��� ȫ�浿�̸� �� .. ��, �ƴϸ� �������
		System.out.println((name.equals("ȫ�浿")) ? "��!!!" : "�������");
		//String say = (name == "ȫ�浿"(X)Ʋ��) ? "��" : "����"; >> heap�� ����Ǳ⶧���� stack������ ����� �����ڴ� �ҷ��ü� ���� �׷��� ����
		//System.out.println(say);
		// 20�� �̻��̸� �ȳ��ϼ���, �ƴϸ� ����
		// 3�׿��� ���ǽ� '?' o�� �� ��(true) : x�� ��(false)
		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		// ���̰� ¦���� ¦, Ȧ���� Ȧ
		System.out.println((age % 2 == 0) ? "¦" : "Ȧ");

	}
}
