import java.util.Scanner;

// �߰���� : 
// �⸻��� : 
//--------------
// ��� : 
// ����� �Ҽ��� ���ڸ���
public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("�߰���� ���� :");
		int score1 = k.nextInt();

		System.out.print("�⸻��� ���� :");
		int score2 = k.nextInt();

		System.out.println("----------------");
		k.close();
		double average = (double) (score1 + score2) / 2;
		System.out.printf("��� ������ : %.1f �Դϴ�\n", average);
		// ��� ������ 90 �̻��̸� ����� ���, �ƴϸ� �� !
		// System.out.println((average>=90)?"��": "��");
		if (average >= 90) {
			System.out.println("��");
		}else if (average >= 80) {
			System.out.println("��");
		} else if (average >= 70)

		{
			System.out.println("��");
		} else if (average >= 60) {
			System.out.println("��");
		} else
			System.out.println("��");

		 /*
		 * else { System.out.println("��!!"); if (average>=80) {
		 * System.out.println("�������� ���ض�~"); } }
		 */
		
	}
}
