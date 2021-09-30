package classTest;

public class SubscriberInfo {
	// 속성 - 이름, 아이디, 패스워드, 전화번호, 주소
	private String name;
	private String id;
	private String password;
	private String tel;
	private String addr;
	
	// 생성자 - 이름, 아이디 패스워드만 초기화를 한후 객체생성
	// 			이름, 아이디 패스워드,전화번호, 주소를 초기화 한 후 객체 생성
	
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo(String name, String id, String password, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.addr = addr;
	}

	// 기능 - 비밀번호 변경, 전화번호 변경, 주소 변경
	//setter 메소드
	public void setPassword(String password) {
		this.password = password;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	void print() {
		System.out.println("이름 :"+name+" 아이디 : "+id);
		System.out.println("비밀번호 :"+password+" 전화번호 : "+tel);
		System.out.println("주소 :"+addr);
		
	}
	
	

}
