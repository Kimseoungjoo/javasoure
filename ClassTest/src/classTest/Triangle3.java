package classTest;

public class Triangle3 {
	// �ﰢ�� ���� ���ϱ�
	// �غ� * ���� / 2

	// �Ӽ� : �غ�, ����
	// ���(�޼ҵ�) : �غ� * ���� / 2 ��� ����
	private int baseLine;
	private int height;

	// ������ �⺻ ������
	Triangle3() {
	}

	Triangle3(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;

	}
	// �����ڴ� �⺻ ������

//	Triangle(int a, int b) {
//		System.out.printf("�غ� : %d , ���� : %d ���� %.1f",a,b,(double)a*b/2);
//	}

//	���(�޼ҵ�) : �غ� *���� / 2
	double getArea() {
		return baseLine * height / 2;
	}

}
