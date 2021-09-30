package shop;


// 완전 추상화 개념 => 상수필드,추상메서드만 가진다
//jdk8 => default, static 가질 수 있기는 함

public interface Ishop {
	// 추상메서드
	void setTitle(String title); // abstract 생략된 메서드라고 생각하면 된다 
	void genUser();
	void genProduct();
	void start();
	
	
	
}
