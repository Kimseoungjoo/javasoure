package inheritance;

public class SuvListString extends ListString {
	String name = "성춘향";

	@Override
	public void list() {
		super.list();
		System.out.println(name + " 하위 클래스");
	}
	public void writer() {
		//부모가 가지고 있는 이름 출력
		System.out.println(super.name);
		super.list();
	
	}
}
