package test;
//�⺻���� �ڵ�� �׻� ������ �Ʒ��� ����

public class LoopTest2 {

	public static void main(String[] args) {
		// 1~10���� ��
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.print(sum+" ");
		}
		
		System.out.println("\n1~10������ �� : "+sum); // 55 
		
		sum=0;//sum �ȿ� �ִ� ������ �ʱ�ȭ �۾�
		
		for(int i=1;i<101;i++) {
			sum+=i;
			System.out.println(sum);
		}
		
		System.out.println("1~100������ �� : " + sum);
		
	}
}
