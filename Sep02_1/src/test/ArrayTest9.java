package test;

public class ArrayTest9 {
	public static void main(String[] args) {
		int score[][] = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 40, 30 }, { 40, 50, 20 }, { 50, 60, 50 } };
		// .length = ���� ����
		int result[][] = new int[score.length + 1][score[0].length + 1];// �̷��� ��!!(why? ���α׷��� ��ȯ���� �� ���ϱ⶧��)

		// score ���� result �ű��
		// �հ踦 ���ؼ� ���� �߰�
		// result �� ���
		System.arraycopy(score, 0, result, 0, score.length);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// ���ű��
				result[i][j] = score[i][j];
				// ���հ�
				// result[0].length > 4
				result[i][result[i].length - 1] += result[i][j];
//				��ü�հ�
				result[5][3] += score[i][j];
			}
			//���հ�
			result[result.length-1][0]+=result[i][0];
			result[result.length-1][1]+=result[i][1];
			result[result.length-1][2]+=result[i][2];
			
			
		}
//ȭ��
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		
	}
}
