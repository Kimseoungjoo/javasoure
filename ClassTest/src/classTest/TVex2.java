package classTest;

public class TVex2 {
//	Ŭ����(.java) >> ������(.class) > ����
	public static void main(String[] args) {
		
		//��ü ����, ����
		TV2 tv1 = new TV2("black",8);//*****���� ���� �ؾ��Ѵ�// �ν��Ͻ�ȭ (tv : �ν��Ͻ�)
		//���� �ڵ� 
		//TV2 tv1 = new TV2();
		//tv1.color = "black";
		//tv1.channel = 8;
		// �� ��������� �ʴ´�
		
		
		
		
		TV2 tv2 = new TV2();//*****���� ���� �ؾ��Ѵ�// �ν��Ͻ�ȭ (tv : �ν��Ͻ�)
		tv2.color = "white";
		// ��ü ���� 
		System.out.println(tv1);
		System.out.println(tv2);
		
	
		tv1.channelUp(); // �޼ҵ� ȣ�� 
		System.out.println("ä�� ���� : "+tv1.channel);
		
		
		
		
		
	}
}
