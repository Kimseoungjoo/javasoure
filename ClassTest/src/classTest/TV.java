package classTest;

public class TV {
	//속성 ( 필드 ) : 생삭 / 채널 / 전원상태
	String color; // red,black
	boolean power;              // on, off
	int channel;
	
	//동작 ( 메소드 ) : 채널 변경하다 / 전원을 키다 / 끄다

	
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
