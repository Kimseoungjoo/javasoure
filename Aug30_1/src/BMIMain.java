import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/*�� �� : 35 �̻�
��(��)�� �� (2�ܰ� ��) : 30 - 34.9
�浵 �� (1�ܰ� ��) : 25 - 29.9
��ü�� : 23 - 24.9
���� : 18.5 - 22.9
��ü�� : 18.5 �̸�*/
public class BMIMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("����� �̸��� ? ");
		String name = k.next();
		System.out.print("����� Ű�� ? ");
		double height = k.nextDouble();
		System.out.print("����� �����Դ� ? ");
		double weight = k.nextDouble();
		k.close();
		if (height >= 3) {
			height /= 100;
		}
		double bmi = weight / (height * height);
		// System.out.println(bmi);
		System.out.println("----------------------------------");
		System.out.printf("%s���� BMI ��ġ�� %.1f �Դϴ�\n", name, bmi);
		if (bmi >= 35) {
			System.out.println("����� �� ���Դϴ�.");
		} else if (bmi >= 30) {
			System.out.println("����� �ߵ� ���Դϴ�.");
		} else if (bmi >= 25) {
			System.out.println("����� �浵 ���Դϴ�.");
		} else if (bmi >= 23) {
			System.out.println("����� ��ü���Դϴ�.");
		} else if (bmi >= 18.5) {
			System.out.println("����� �����Դϴ�.");
		} else
			System.out.println("����� ��ü���Դϴ�.");
		/*
		 * �������� �Ͻ� ���α׷� String result = "��ü��"; if (bmi >= 35) { result = "����"; } else
		 * if (bmi >= 30) { result = "�ߵ���"; } else if (bmi >= 25) { result = "�浵��"; }
		 * else if (bmi >= 23) { result = "��ü��"; } else if (bmi >= 18.5) { result =
		 * "����"; } System.out.printf("%s ���� %s �Դϴ�",name,result);
		 */

	}
}
