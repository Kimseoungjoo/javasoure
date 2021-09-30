package classTest;

public class SquareEx {
	public static void main(String[] args) {

		Square square = new Square(3.4);
//		square.sideLength= 3.4;
		System.out.printf("정사각형의 면적 : %.2f  \n",square.getArea());
	
		Square square2 = new Square(3);
//		square2.sideLength = 3;
		System.out.printf("정사각형의 면적 : %.2f  \n",square2.getArea());
		
	
	}
}
