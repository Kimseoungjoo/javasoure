import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) throws InterruptedException{
		Scanner a = new Scanner(System.in);
		System.out.print("��ǰ�� : ");
		String name = a.next();
		System.out.print("���� : ");
		int price = a.nextInt();
		System.out.print("���� : ");
		double weight = a.nextDouble();
		a.close();
		System.out.println("-----------------------------------");
		System.out.print("��ǰ�� : "); System.out.println(name);
		System.out.print("���� : "); System.out.println(price);
		System.out.print("���� : "); System.out.println(weight);
		// ���������� ������ �Լ�(%s <string���� �ڸ�)
		// %d < ���� ���� �ڸ� ex)�ڸ��� ���� >%0?d ?���ϴ� �ڸ���
		// %f < �Ǽ� �����ڸ� ex)�Ҽ��� �ڸ������� > %0.?f ���ϴ� �ڸ���
		// %b < boolean
		System.out.println("-----------------------------------");
		System.out.printf("��ǰ�� : %s\n",name); 
		System.out.printf("��ǰ�� : %d\n",price); 
		System.out.printf("���� : %d\n",price); 
		System.out.printf("���� : %f\n",weight);  
		System.out.printf("���� : %.1f\n",weight);
		System.out.println("-----------------------------------");
		System.out.printf("--%s [ %d��] ���� : %.2f kg----\n",name, price, weight);
		System.out.println("-----------------------------------");
		double pct = 88.12;
		System.out.printf("%.2f%%",pct);// % / \ ���ڷ� �������ؼ��� 2�� \\ %% ����� ����� �����ϴ�
		Thread.sleep(10000);
	}
}
