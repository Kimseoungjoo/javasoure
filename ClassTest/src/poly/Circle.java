package poly;

// Point�� has-a����

public class Circle extends Shape {
	// ��ü�� �����ϴ� 
	Point center; // ���� �߽���ǥ
	
	int r; // ������

		
	public Circle() {
//		super(); ��������
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
