package test;

public class ArrayTest1 {

	public static void main(String[] args) {
		//Array �迭 >>
		//int Ÿ���� ���� 10�� ����
		//int a=1 b=2 c=3 d=1....
		
//		int sum;
//		sum = 0;
//		System.out.println(sum);
		
		
		//�迭(����Ÿ��)
		//����Ÿ�� : heap / null/�ڵ����� �ʱ�ȭ
		//���� : 0, �Ǽ� : 0.0 , boolean : false �ʱ�ȭ���ȴ�
		int arr[] = new int[10];
		
		//���� ��ҿ� ���� 0������ ����(0~9)
		System.out.println(arr[0]);
		System.out.println(arr[9]);
		arr[3] = 90;
		arr[2] = 20;
		arr[7] = 120;
		for(int i = 0; i <10; i++) {
			System.out.println(arr[i]);
		}
		int i=0;
		while(i<10) {
			System.out.println(arr[i]);
			i++;
		}
		
		
		
	}

}
