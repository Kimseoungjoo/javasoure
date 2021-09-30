package classTest;

public class TV2 {
	//속성 ( 필드 ) : 생삭 / 채널 / 전원상태
		String color; // red,black
		boolean power;              // on, off
		int channel;
		//동작 ( 메소드 ) : 채널 변경하다 / 전원을 키다 / 끄다

		
		//생성자
		TV2(){
			//Default(기본) 생성자
			//명시적으로 생성자가 하나도 선언되지않았다면 컴파일러가 자동으로만든다.
			System.out.println(color+" "+channel);
		}
		TV2(String color, int channel) { // 오버로딩 (생성자 2개이상)
										 // 메인 메소드에서 기본값을 주기위해
			this.color = color;
			this.channel = channel;
			System.out.println(color+" "+channel);
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
