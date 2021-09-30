package classTest;

public class TVex2 {
//	클래스(.java) >> 컴파일(.class) > 실행
	public static void main(String[] args) {
		
		//객체 선언, 생성
		TV2 tv1 = new TV2("black",8);//*****가장 먼저 해야한다// 인스턴스화 (tv : 인스턴스)
		//같은 코드 
		//TV2 tv1 = new TV2();
		//tv1.color = "black";
		//tv1.channel = 8;
		// 잘 사용하지는 않는다
		
		
		
		
		TV2 tv2 = new TV2();//*****가장 먼저 해야한다// 인스턴스화 (tv : 인스턴스)
		tv2.color = "white";
		// 객체 조작 
		System.out.println(tv1);
		System.out.println(tv2);
		
	
		tv1.channelUp(); // 메소드 호출 
		System.out.println("채널 상태 : "+tv1.channel);
		
		
		
		
		
	}
}
