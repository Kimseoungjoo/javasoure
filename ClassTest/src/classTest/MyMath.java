package classTest;

public class MyMath {
	// ������� long ���� 2��
	long x;
	long y;

	// �޼ҵ� : add, subtract, multiply, divide
	// : �Է°� ����, ��ȯ���� ������

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
