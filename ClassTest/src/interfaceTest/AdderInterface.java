package interfaceTest;

/*
 * 인터페이스 
 * 1)상수 필드만 가짐
 */

public interface AdderInterface {
//	Illegal modifier for the interface field AdderInterface.x; only public, static & final are permitted
	public static final  int x =100;
	
	//Abstract methods do not specify a body
	void method1();
	
	//1.8부터 
	// static메소드와 default 메소드 들어올 수 있음
	static void method2() {
		
	}
	default void method3() {
		
	}
	
}
