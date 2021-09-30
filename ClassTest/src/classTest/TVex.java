package classTest;

public class TVex {
//	클래스(.java) >> 컴파일(.class) > 실행
	public static void main(String[] args) {
		
		//객체 선언, 생성
		TV tv = new TV();//*****가장 먼저 해야한다// 인스턴스화 (tv : 인스턴스)
		System.out.println(tv);
		
		// 객체 조작 
		tv.power = true; // on
		tv.channel = 2;
	
		tv.channelUp(); // 메소드 호출 
		System.out.println("채널 상태 : "+tv.channel);
		
		
		
		
		
	}
}
