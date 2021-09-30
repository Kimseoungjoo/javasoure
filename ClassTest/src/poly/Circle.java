package poly;

// Point와 has-a관계

public class Circle extends Shape {
	// 객체를 생성하는 
	Point center; // 원의 중심좌표
	
	int r; // 반지름

		
	public Circle() {
//		super(); 생략가능
		this(new Point(3,0),100);
	}
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
		
	}

	@Override
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color = %s]", center.x, center.y, r, color);
	}
}
