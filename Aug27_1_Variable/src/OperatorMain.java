import java.util.Scanner;

// ��������(>,   >=,   ==,  <,  <=,   !=) 
//          (�ʰ�,�̻�,����,�̸�,����,�ٸ���)
// �����տ�����
//        &&   ||   ! 
//        and  or   not�ݴ�
public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű�� : ");
		double height = k.nextDouble();
		System.out.print("���� : ");
		int age = k.nextInt();
		k.close();
		System.out.println("----------------------");
		System.out.printf("Ű : %.1fcm, ���� : %d��\n", height, age);

		// Ű�� 150 �̻�����
		boolean playing = (height >= 140);
		System.out.println(playing);

		// ���̰� 14�� �̻�
		boolean playing2 = (age <= 14);
		System.out.println(playing2);

		// ���̰� 5���̻��̰�, Ű�� 190cm�̻��ΰ�
		boolean playing3 = (age >= 5) && (height >= 190);
		System.out.println(playing3);
		// ���̰� 5���̻��̰ų�, Ű�� 190�̻�

		boolean playing4 = (age >= 5) || (height >= 190);
		System.out.println(playing4);
		
		// playing4�� true�� 5�� false
		// playing4rk false�� 5�� true
		boolean playing5 = !playing4;
		System.out.println(playing5);

	}
}
