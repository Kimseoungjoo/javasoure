package object;

public class SmartPhone {
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}

	// 객체가 가지고 있는 멤버변수의 값을 출력하기 위해서 오버라이딩을 한다 
	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
}
