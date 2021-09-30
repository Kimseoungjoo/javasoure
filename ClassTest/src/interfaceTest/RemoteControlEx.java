package interfaceTest;

public class RemoteControlEx {
	public static void main(String[] args) throws InterruptedException {
		
		RemoteControl rc;// = new Television();
		//rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Thread.sleep(1000);
		
		System.out.println();
		
//		rc.turnOn();
//		rc.setVolume(11);
//		rc.turnOff();
		// 익명 구현개체
		RemoteControl rc1 = new RemoteControl() {
			private int volume;
			@Override
			public void turnOn() {
				System.out.println("Radio를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Radio를 끕니다");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("Radio 현재 볼륨 : " + volume);				
			}
		};
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.turnOff();
	}
}
