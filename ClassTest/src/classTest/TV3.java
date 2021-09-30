package classTest;

public class TV3 {
	//속성 ( 필드 ) : 생삭 / 채널 / 전원상태
		private String color;
		private boolean power;
		private int channel;
		

		
		public String getColor() {
			return color;
		}
		public boolean isPower() {
			return power;
		}
		public int getChannel() {
			return channel;
		}
		public TV3(String color, boolean power, int channel) {
			super();
			this.color = color;
			this.power = power;
			this.channel = channel;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setPower(boolean power) {
			this.power = power;
		}
		public void setChannel(int channel) {
			this.channel = channel;
		}
		//생성자
		TV3(){
			//Default(기본) 생성자
			//명시적으로 생성자가 하나도 선언되지않았다면 컴파일러가 자동으로만든다.
			System.out.println(color+" "+channel);
		}
		TV3(String color, int channel) { // 오버로딩 (생성자 2개이상)
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
