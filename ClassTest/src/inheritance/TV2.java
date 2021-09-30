package inheritance;

public class TV2 {
	//�Ӽ� ( �ʵ�,�������,������Ƽ ) : ���� / ä�� / ��������
	private String color; // red,black
	private boolean power;              // on, off
	private int channel;
	
	//���� ( �޼ҵ� ) : ä�� �����ϴ� / ������ Ű�� / ����

//	public TV2() {
//		super();
//	}
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}

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
