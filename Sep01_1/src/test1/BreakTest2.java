package test1;

public class BreakTest2 {
	public static void main(String[] args) {
		// ���ڸ� 0�������� �ϳ��� ������Ű�鼭 �հ踦 ���ϱ�
		// ��, �հ谡 100�� ������ �ݺ��� ����
		int i = 0;
		int sum = 0;
	
		while (true) {
			i++;
			sum += i;
			System.out.println(sum);
			if (sum > 100) {
				break;
			}
		}
		
		System.out.printf("%d �������� �� �� : %d", i, sum);
	
	}

}
