package exam;

import java.util.Scanner;

//���� ȭ���µ� > �����µ��� ��ȯ  ����ϱ�
/*
 * Scanner k = new Scanner(System.in); 
 * System.out.print("ȭ�� �µ��� �����ּ��� :");
 * double hwa = k.nextDouble(); 
 * k.close();
 * System.out.printf("���� �µ��� %.2f �� �Դϴ� \n",(hwa-32)/1.8);
 */

public class DegreesMain {
	public static void main(String[] args) {
		// ȭ���µ�>> �����µ��� ��ȯ ���α׷�
		// ���� ȭ���µ� �Է¹ޱ�(����)
		Scanner k = new Scanner(System.in/* Ű���忡�� �Է��� �޴´ٴ� �ǹ� */);
		System.out.print("ȭ�� �µ� �Է� :");
		int fahr = k.nextInt(); // �������ٰ� �Է��� �ִ� �۾�
		k.close();
		//���� ȭ���µ� >> �����µ��� ��ȯ �� ����ϱ�
		// (ȭ���µ� -32)*5/9
		double sub = (fahr-32)*5/9.0;//(fahr-32)*5/9 << int ������ ���̳��´�. 
		//�׷��⿡ ����ȯ (double)�� ������ְų�/ �Ҽ������� ��ȯ 
		System.out.println("�����µ� : " + sub);
		System.out.printf("�����µ� : %.4f", sub);

	}
}
