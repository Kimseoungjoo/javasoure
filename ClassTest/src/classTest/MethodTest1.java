package classTest;

/*
 * ����Ÿ�� �޼ҵ�� (....)
 * 
 * 		����Ÿ���� void �� ���� �����Ѵٸ� 
 * 		������ return Ű���尡 ���;��Ѵ�. 
 * 
 * 
 */
public class MethodTest1 {
	// ���� ���� t/f �޼ҵ� ���� >> boolean

	boolean isRedierect() {
		return false;
	}

	// ���ϰ��� int Ÿ���� �޼ҵ�
	int sum() {
		return 3;
	}

	// ���ϰ��� int, �� ���� ��������(int)�� �ޱ�
	int gksrmf(int num1, int num2) {
		return num1 * num2;

	}

	// ���ϰ� : long, �� ���� ��������(int)�� �ޱ�
	long add(long num1, long num2) {
		return num1 + num2;

	}

	// ���ϰ� : char �޼ҵ�
	char method() {
		return 'c';
	}

	// ���ϰ��� �ʿ� ����
	void method1() {

	}

	// ����Ÿ�� : int�� 1���� �迭
	// �������� : int�� 1���� �迭
	int[] print(int arr[]) {
		return arr;
	}

	// ����Ÿ�� : double , �Ű����� : �ΰ��� double
	// �ؾ��� �� : ���� �ΰ��� �Ű������� �������� ��� ����
	double div(double num1, double num2) {
		return num1 / num2;
	}

}
