package exam;

//���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� ���� num
//�� ���� �� �������� ���Ͻÿ�
//ex) num�� 24��� ũ�鼭�� ���� ����� 10�� ����� 30 ��

import java.util.Scanner;

public class NumMultiple {

	public static void main(String[] args) throws InterruptedException{

		Scanner k = new Scanner(System.in);
		
		System.out.print("���ϴ� ���ڴ� : ");
		int num = k.nextInt();
		k.close();
		int result = (num/10+1)*10; // result = num%10 >> num - result+10
		System.out.printf("���ϴ� ���� %d ���� ũ�鼭 10�� ����� ���� %d�Դϴ�\n",num,result);
		Thread.sleep(3000);
		/*
		 * ������ �ڵ�
		 *  int num=81; 
		 *  System.out.println(10-(num%10)*10); �����ϰ� ���α׷� 
		 */}

}
