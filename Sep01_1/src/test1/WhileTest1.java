package test1;

public class WhileTest1 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println(i);
		}
		// 3�� ����� ����ϰ� �;��
		i = 3;
		while (i < 100) {
			i += 3;
			System.out.println(i);

		}
		// 1~100 ������ ��
		i = 1;
		int sum = 0;
		while (i < 101) {
			sum += i;
			i++;
		}System.out.println("1~100������ ���� : "+sum);
		//������
		i=1;
		while(i<10) {
			System.out.printf("2 * %d = %2d\n",i,(i*2));
			i++;
		}
	}
}
