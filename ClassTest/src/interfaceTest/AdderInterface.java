package interfaceTest;

/*
 * �������̽� 
 * 1)��� �ʵ常 ����
 */

public interface AdderInterface {
//	Illegal modifier for the interface field AdderInterface.x; only public, static & final are permitted
	public static final  int x =100;
	
	//Abstract methods do not specify a body
	void method1();
	
	//1.8���� 
	// static�޼ҵ�� default �޼ҵ� ���� �� ����
	static void method2() {
		
	}
	default void method3() {
		
	}
	
}
