package inheritance;

public class CellPhone {
	String model;
	String color;
	void powerOn() {
		System.out.println("���� on");
	}
	void powerOff() {
		System.out.println("���� off");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoidce(String msg) {
		System.out.println("���� :" +msg);
	}
	void receiveVoidce(String msg) {
		System.out.println("���� :" +msg);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
