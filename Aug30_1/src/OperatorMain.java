
import java.util.Scanner;

// ---------������ �ù�-------
//���� , ���� , ����, ����
//----------------------------
//���� = ����*����*����
//��������
// && &, || |, ! 
//	xor  = ^
// ex) & �۾��� ���������� �Ѵ�.(�տ� ������ Ʋ����)
// 2��  : �ߴܵǴ� ���� - V
//	&& - �� Ȯ���� �����Ÿ� ������ ��ġ
// 	|| - �� Ȯ���� �����Ÿ� ������ ��ġ
//	1�� : ������ ���� ����
//	���ǹ�, �ݺ���, �迭(�÷���), �� ���� Ư¡ - ��ü ���̺귯�� �� Ȱ�� 
public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�ù踦 ���Ͻʴϱ�?(true / false)");
		boolean doWant = k.nextBoolean();
		System.out.print("�ù� ���� :");
		double horizontal = k.nextDouble();
		System.out.print("�ù� ���� :");
		double vertical = k.nextDouble();
		System.out.print("�ù� ���� :");
		double height = k.nextDouble();
		System.out.print("�ù� ���� :");
		double weight = k.nextDouble();
		k.close();
		System.out.println("-----------------------");
		System.out.printf("�ù��ϱ⸦ ���Ͻʴϱ�? : %b \n", doWant);
		System.out.printf("�ù� ���� : %.1f cm\n", horizontal);
		System.out.printf("�ù� ���� : %.1f cm\n", vertical);
		System.out.printf("�ù� ���� : %.1f cm\n", height);
		System.out.printf("�ù� ���� : %.1f kg\n", weight);
		double volume = horizontal * vertical * height;
		System.out.printf("�ù� ���� : %.1f = %.1f*%.1f*%.1f \n", volume, horizontal, vertical, height);
		System.out.println("-----------------------");
//      ���ǰ� 10�̻��̰�, ���԰� 1000�̻��̸� true
		boolean a = (volume >= 10) && (weight >= 1000);
//		���ǰ� 10�̸��̰ų�, ���԰� 1000�̸��̸�
//		boolean b = (volume < 10) || (weight < 1000);X
		boolean b = (weight < 1000) || (volume < 10);// O
//		���԰� 20�̻��̰�, ���԰� 30�̻��̸�
		// boolean c = (weight >= 20) || (weight >= 30); X
		boolean c = (weight >= 30); // O

		if (a == true || b == true || c == true) {
			System.out.println("���񽺸� ��������");
		} else
			System.out.println("���񽺸� ���������� �� �����ϴ�");
		boolean d = (volume < 10) ^ (weight < 1000);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
