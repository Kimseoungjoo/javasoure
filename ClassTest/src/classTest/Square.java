package classTest;

public class Square {
	// ���簢�� ����
	
	// �Ӽ� : ���� ����
	// ��� : �� x �� > �Է°� x ��ȯ�� �Ǽ�
	double sideLength;
	Square(double sideLength){
		this.sideLength = sideLength;
	} // ������
	double getArea() {
		return sideLength*sideLength;
	}
}
