package classTest;

public class Triangle3 {
	// 삼각형 넓이 구하기
	// 밑변 * 높이 / 2

	// 속성 : 밑변, 높이
	// 기능(메소드) : 밑변 * 높이 / 2 결과 리턴
	private int baseLine;
	private int height;

	// 생성자 기본 생성자
	Triangle3() {
	}

	Triangle3(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;

	}
	// 생성자는 기본 생성자

//	Triangle(int a, int b) {
//		System.out.printf("밑변 : %d , 높이 : %d 넓이 %.1f",a,b,(double)a*b/2);
//	}

//	기능(메소드) : 밑변 *높이 / 2
	double getArea() {
		return baseLine * height / 2;
	}

}
