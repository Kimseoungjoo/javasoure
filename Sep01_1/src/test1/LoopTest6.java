package test1;

public class LoopTest6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {//���� ���
			for (int j = 0; j < 10; j++) {//���� ���
				System.out.print("*");
			}
			System.out.println();
		}
		// 1~100 ���� ���� �߿��� 3�� ������� ���ϴ� ���α׷� �ۼ�
		// �� , 9�� ����� ������ �ʱ�
		int sum = 0;
		for (int i = 0; i < 100; i += 3) {
			if (i % 9 != 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("--3�� ���, 9�ǹ���� ���� �� : "+sum+"-------------");
		
		sum = 0;
		// 1~100 ���� ���� �߿��� 3�� �转�ų� 5�� ����� ���� ��
		for (int i = 1; i < 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("--3�� ��� �Ǵ� 5�� ����� �� :"+sum);
	}
}
