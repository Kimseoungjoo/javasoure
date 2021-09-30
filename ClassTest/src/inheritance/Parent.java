package inheritance;

/*
 * 
 * 
 *  코드의 중복 제거 =>프로그램 생산성과 유지보수 높아짐
 *  조상 클래스 : 부모, 상위, super
 *  자손 클래스 : 자식, 하위, sub
 */
public class Parent {
	private int age;

	public Parent(int age) {
		super(); // 부모클래스(Object)의 기본 생성자 호출
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.println("Hello");
	}

}
