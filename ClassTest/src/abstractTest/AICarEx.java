package abstractTest;

public class AICarEx {
	public static void main(String[] args) {
		AICar ai = new AICar("black");

		ai.start();
		ai.drive();
		ai.stop();
		
		// Cannot instantiate the type Car(Car ��ü���� �Ұ�)
		// �߻� Ŭ������ ��ü ���� �Ұ� 
		// Car car = new Car();
		
		Car car = new AICar("white");
		car.start();
		car.drive();
		car.stop();
		
	}
}
