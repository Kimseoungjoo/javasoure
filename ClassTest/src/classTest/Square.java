package classTest;

public class Square {
	// 정사각형 면적
	
	// 속성 : 변의 길이
	// 기능 : 변 x 변 > 입력값 x 반환값 실수
	double sideLength;
	Square(double sideLength){
		this.sideLength = sideLength;
	} // 생성자
	double getArea() {
		return sideLength*sideLength;
	}
}
