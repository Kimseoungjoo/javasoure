package classTest;

//final : 수정불가 / 초기화 무조건 필요
//사용되는 곳 : 클래스 , 메서드, 맴버변수 , 지역변수
//클래스 : 상속 불가
//메소드 : 오버라이딩 불가
//멤버변수, 지역변수 : 수정불가


public final class FinalTest {

	final int MAX_SIZE = 10; // 상수 
	
	final void getMaxSize() {
		final int LV = MAX_SIZE;
	}

	
}
