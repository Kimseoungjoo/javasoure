package test1;

public class ExamTest2 {
	public static void main(String[] args) {
		// ��ø for ���� ����ؼ� ������ 4x+ 5y = 60 �� ��� �ظ�
		// ���ؼ� (x,y) ���·� ����ϱ�
		// ��, x,y �� 10������ �ڿ���
		int result = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				result = (4*i)+(5*j);
				if(result == 60) {
					
					System.out.printf("(%d , %d) > 4 x %d + 5 x %d = %d\n",i,j,i,j,result);
				}
			}
		}
	}
}
