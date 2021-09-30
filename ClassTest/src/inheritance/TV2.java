package inheritance;

public class TV2 {
	//속성 ( 필드,멤버변수,프로퍼티 ) : 생삭 / 채널 / 전원상태
	private String color; // red,black
	private boolean power;              // on, off
	private int channel;
	
	//동작 ( 메소드 ) : 채널 변경하다 / 전원을 키다 / 끄다

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
		//channelUp 가 해야 하는 작업 작성 (현재채널(7) > 6 
		channel++;
	}
	

	void channelDown()	{
		//channelDown 가 해야 하는 작업 작성
		channel--;
		
	}
	
	void power () {
		//power 가 해야 하는 작업 작성
		power = !power;
	}
	
	
}
