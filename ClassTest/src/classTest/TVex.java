package classTest;

public class TVex {
//	Ŭ����(.java) >> ������(.class) > ����
	public static void main(String[] args) {
		
		//��ü ����, ����
		TV tv = new TV();//*****���� ���� �ؾ��Ѵ�// �ν��Ͻ�ȭ (tv : �ν��Ͻ�)
		System.out.println(tv);
		
		// ��ü ���� 
		tv.power = true; // on
		tv.channel = 2;
	
		tv.channelUp(); // �޼ҵ� ȣ�� 
		System.out.println("ä�� ���� : "+tv.channel);
		
		
		
		
		
	}
}
