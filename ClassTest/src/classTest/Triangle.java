package classTest;

public class Triangle {
	// �ﰢ�� ���� ���ϱ�
	// �غ� * ���� / 2

	// �Ӽ� : �غ�, ����
	// ���(�޼ҵ�) : �غ� * ���� / 2 ��� ����

	// ������ �⺻ ������
	int low;
	int height;

	// �����ڴ� �⺻ ������

//	Triangle(int a, int b) {
//		System.out.printf("�غ� : %d , ���� : %d ���� %.1f",a,b,(double)a*b/2);
//	}

//	���(�޼ҵ�) : �غ� *���� / 2
	double getArea() {
		return low * height / 2;
	}

}
