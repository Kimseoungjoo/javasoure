package classTest;

public class TriangleEx3 {
	public static void main(String[] args) {
		// ���̰� ���� �ٸ� �ﰢ�� 5���� ������ �ִ�.
		// ���� ���ϱ�
		Triangle3 triArr[] = new Triangle3[5];
//		Triangle3 triangle1 = new Triangle3(10,15);
		triArr[0] = new Triangle3(10, 15);
		triArr[1] = new Triangle3(2, 4);
		triArr[2] = new Triangle3(6, 15);
		triArr[3] = new Triangle3(18, 14);
		triArr[4] = new Triangle3(12, 53);
		triArr(triArr);

	}

	static void triArr(Triangle3 triArr[]) {
		//�������ϱ�
		for(int i =0;i<triArr.length;i++) {
			System.out.println("�ﰢ�� ���� : "+triArr[i].getArea());
			System.out.println();
		}
	}
}