package classTest;

public class Car2 {
// �Ӽ� : ����ȸ��, �𵨸�, ���� , �ִ�ӵ�
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
//������ - Ŭ���� �̸� �� ���� / ����Ÿ�Ծ��� / �ߺ�����(������ �����ε�)
//���� ��� �Ǵ��� ? ���� ��ü�����ÿ� �ڵ�ȣ��ȴ�	
// ���� - �ʵ忡 �ʱⰪ�� ����/ ��ü ������ �غ��ؾ� �ϴ� �۾� ����
	Car2(){ //������
		System.out.println("Car2 �⺻������");	
	}
	Car2(String model){ //Duplicate method Car2() in type Car2
		System.out.println("Car2 ������ -model �ʱ�ȭ");	
	}
	Car2(String model, String color){ 
		System.out.println("Car2 ������ -model �ʱ�ȭ");	
	}
	Car2(String company, String model, String color,int maxSpeed){
		System.out.println("Car2 ������ -�Ӽ� ��� �ʱ�ȭ");	
	}
	
	
	
	

	
	
	
// ���� : �����ϴ� , �����ϴ�
// ���� - �޼ҵ�
// ����Ÿ�� �޼ҵ��() {}
// ����Ÿ�� �޼ҵ��(Ÿ�� ������,...){}
	void forward() {
		System.out.println("�����ϴ�");

	}

	void backword() {
		System.out.println("�����ϴ�");
	}

}
