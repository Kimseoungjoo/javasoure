package test;

public class Test2 {
	public static void main(String[] args) {
		//�迭�� �߰�/���� �ϴ� ����� ���α׷��� ���� ������ �����ʴ´�.
		int oldArr[] = {10,20,30};
		
		int newArr[] = new int [4];
		//���� �� ���ο� ������ ����
//		for(int i=0; i<oldArr.length; i++) {
//				newArr[i] = oldArr[i];
//		} ����ڰ� ���� �ϴ� ���
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);// ���� ��İ� ����;

		newArr[3] = 40;
		
		for(int i:newArr	) {
			System.out.println(i+" ");
		}
		
		
	}
}
