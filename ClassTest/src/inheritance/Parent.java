package inheritance;

/*
 * 
 * 
 *  �ڵ��� �ߺ� ���� =>���α׷� ���꼺�� �������� ������
 *  ���� Ŭ���� : �θ�, ����, super
 *  �ڼ� Ŭ���� : �ڽ�, ����, sub
 */
public class Parent {
	private int age;

	public Parent(int age) {
		super(); // �θ�Ŭ����(Object)�� �⺻ ������ ȣ��
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.println("Hello");
	}

}
