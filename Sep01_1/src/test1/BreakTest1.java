package test1;

//break : �ݺ��� ���� ���� �Լ�


public class BreakTest1 {
	public static void main(String[] args) {

		while(true) {
			//�ֻ����� ������ 6�� ������ �ݺ��� ����
			int dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
			if(dice==6) {
				break;
			}
		}
		
	}
}
