import java.util.Scanner;

/*�񸸵� �˻�------
    �̸� : 
	Ű :
	������ : 
-------------------
ǥ��ü�� :  kg
�񸸵� :    %
�Ҽ��� 2�ڸ�������
ǥ��ü�� = (Ű-100)*0.9
�񸸵� = (������/ǥ��ü��) * 100
�񸸵� 120 �ʰ��ϸ� ��, �ƴϸ� ����*/

public class ObesityMain {
	public static void main(String[] args) throws InterruptedException{
		Scanner k = new Scanner(System.in);
		System.out.println("--------�񸸵�----------");
		System.out.print("�̸� : ");
		String name = k.next();
		System.out.print("Ű : ");
		double height = k.nextDouble();
		System.out.print("������ : ");
		double weight = k.nextDouble();
		k.close();
		System.out.println("----------------------");
		double avweight = (height - 100) * 0.9;
		double obesity = (weight / avweight) * 100;
		System.out.printf("ǥ��ü�� : %.2f kg\n", avweight);
		System.out.printf("�񸸵� : %.2f %%\n",obesity);
		String obesity2 = (obesity > 120) ? "��" : "����";
		
		System.out.printf("%s ���� %s�Դϴ�!", name, obesity2);
		Thread.sleep(4000);
	}
}
