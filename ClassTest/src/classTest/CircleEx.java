package classTest;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.radius = 5;
		System.out.println("���� ���� : "+circle1.getArea());
		
		Circle circle2 = new Circle();
		circle2.radius = 4.5;
		System.out.println("���� ���� : "+circle1.getArea());
	}
}
