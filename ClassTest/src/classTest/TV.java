package classTest;

public class TV {
	//�Ӽ� ( �ʵ� ) : ���� / ä�� / ��������
	String color; // red,black
	boolean power;              // on, off
	int channel;
	
	//���� ( �޼ҵ� ) : ä�� �����ϴ� / ������ Ű�� / ����

	
	void channelUp() {
		//channelUp �� �ؾ� �ϴ� �۾� �ۼ� (����ä��(7) > 6 
		channel++;
	}
	
	void channelDown()	{
		//channelDown �� �ؾ� �ϴ� �۾� �ۼ�
		channel--;
		
	}
	
	void power () {
		//power �� �ؾ� �ϴ� �۾� �ۼ�
		power = !power;
	}
	
	
}
