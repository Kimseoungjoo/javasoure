package inheritance;


//extends �θ� Ŭ������
//�����ڿ� �ʱ�ȭ ���� ��ӵ��� ����
//private ��������� ������ ���ѵ�


public class Child extends Parent {

	public Child(int age) {
		super(age);// Parent int�� �޴� ������ ȣ��
	}
	
//mplicit super constructor Parent() is undefined for default constructor. 
//Must define an explicit constructor
	
//	public Child() {
//		super(); // Parent �⺻������ ȣ��
//	}
	void play() {
		System.out.println("����!!!");
	}
}
