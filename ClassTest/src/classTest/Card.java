package classTest;

public class Card {
	// 멤버변수
	// 객체생성후 메모리에 로드
	private String kind; // 카드 모양 지정
	private int number; // 카드 숫자 지정

//	int width = 10;
//	int height = 7;
	// static(정적) : 클래스에 고정된 멤버
	// 				  객체를 생성하지않고 사용
	//				  클래스가 메모리에 로드될 떄 생성
	static int width = 10;
	static int height = 7;
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	//static(정적) : 객체를 생성하지 않고 사용
	//				 클래스가 메모리에 로드될 떄 생성
	//				 static 메서드 안에서 인스턴스 멤버 사용불가
//	public static int getWidth() {
//		return width;
//	}

//	public static int getHeight() {
//		return height;
//	}

}
