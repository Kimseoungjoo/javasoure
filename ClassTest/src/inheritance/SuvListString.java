package inheritance;

public class SuvListString extends ListString {
	String name = "������";

	@Override
	public void list() {
		super.list();
		System.out.println(name + " ���� Ŭ����");
	}
	public void writer() {
		//�θ� ������ �ִ� �̸� ���
		System.out.println(super.name);
		super.list();
	
	}
}
