package classTest;

public class MyMath {
	// 멤버변수 long 변수 2개
	long x;
	long y;

	// 메소드 : add, subtract, multiply, divide
	// : 입력값 없음, 반환값은 연산결과

	public MyMath(long x, long y) {
		super();
		this.x = x;
		this.y = y;
	}

	long addMath() {
		return x + y;
	}

	long subMath() {
		return x - y;
	}

	long mulMath() {
		return x * y;
	}

	double divMath() {
		return x / y;
	}
	static long addMath(long a, long b) {
		return a + b;
	}
	
	static long subMath(long a, long b) {
		return a - b;
	}
	
	static long mulMath(long a, long b) {
		return a * b;
	}
	
	static double divMath(double a, double b) {
		return a / b;
	}
}
