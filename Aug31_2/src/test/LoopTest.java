package test;

//�ݺ��ؾ��� �۾��� �ִ� �� 
/*
 * for ���� ���ư��� ��� 
 * 1. int i = 0;
 * 2. i < 10
 * 3. for main �� �ݺ��ؾ� �� �۾� ���� ~ 
 * 4. i++; >> i = 1 (i += 1) ���� ������ + 1
 * 5. i < 10  (5 > 3 > 4 > 5) �ݺ� 
 * ������ i = 10 
 * i < 10; ���� �Ҹ��� > for ������ �������� > for ����  
 */
public class LoopTest {
	public static void main(String[] args) {
		// ; - ��ħǥ �ǹ̸� ������ �ִ�
		// �ڵ��� ������
		for (int i = 0; i < 10; i++) {// 10�� �ݺ��Ѵٴ� �ǹ�
			System.out.println("�ȳ��ϼ���" + i);
		}
		System.out.println();
//1~10���� ���
		for (int i = 1; i < 11; i++) {

			System.out.println(i);
		}
		System.out.println();

		// 0 ~ 10 ¦�� ���

		for (int i = 0; i < 11; i += 2) {
			System.out.print(i + "\t");
		}

		System.out.println();

		for (int i = 3; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
	}
}