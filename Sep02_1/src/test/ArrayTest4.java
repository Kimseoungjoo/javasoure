package test;

public class ArrayTest4 {
	public static void main(String[] args) {
		// �迭����
//		ex) int arry[];	//���� 
//			arry = new int[10];	//���� (�����ʹ� 0)
//			int arry2[] = {12,32,42,52};	//���� �� ����

		int score[] = { 78, 65, 95, 88, 36, 45, 25, 47, 87, 43 };

		// ���
		int sum = 0;
		
//		for(int i =0; i<score.length;i++) {
//			sum +=score[i];			
//		}
		for(int jumsu:score) {
			sum+=jumsu;
		}
	System.out.println("�� ��� : "+(double)sum/score.length+"�Դϴ�");
		
	}
	
}
