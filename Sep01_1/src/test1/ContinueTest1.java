package test1;

//Continue : �ݺ����ȿ��� ���Ǹ�, ��� ������ continue ����
//����Ǹ� for���� ������, while ���ǽ����� �̵�

public class ContinueTest1 {
	public static void main(String[] args) {
		
		for(int i =0; i<10 ; i++) {
			if(i%2!=0) {
				continue;// ���ǿ� �ش�Ǹ� continue�� ������ �Լ��� ���������ʰ�
						 // �ٽ� for ���ǽ����ΰ��� 
			}
			System.out.println(i);
		}
		
	}

}
