import java.util.Scanner;

//   �ܼ� �Է¹޴� ���α׷� ����ÿ�




public class ConsoleInputMain {
	public static void main(String[] args) {
	// Ű���� �Է¹��� �غ��ؼ� k�� ������
		Scanner k = new Scanner(System.in);
		System.out.print("�Ĵ� �̸� : ");     //�Ĵ� �̸� �Է¹ޱ�
		
		String rastourant = k.next();
		System.out.println(rastourant);
		
		System.out.print("�Ĵ��� ũ�� : ");
		double size = k.nextDouble();
		
		System.out.print("�Ĵ� ���̺� ���� : ");
		int table = k.nextInt();
		
		System.out.print("���� ���Դϱ�?(true/false) : ");
		boolean isOpening = k.nextBoolean();
		k.close();
		System.out.println(size);
		System.out.println(rastourant);
		System.out.println(table);
		System.out.println(isOpening);
	}
}
