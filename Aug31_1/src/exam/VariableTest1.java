package exam;
/* ������ ��ȿ����
 * 1. ����� ��� �������� ��밡��
 * 2. ����(local)������ �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�. 
 * 3. ���� ������ ���ؾ��Ѵ�. ^^
 */
public class VariableTest1 {
	// ����
	private int num1;// ������ class {} �ȿ� ���� ��밡�� 

	// �޼ҵ�
	// �޼ҵ� �ȿ� ���� �������� stack�� ���̰� �ȴ� ������ ������ �ڵ� �ʱ�ȭ�ȴ�.
	public static void main(String[] args) {
		int num2 = 0;// main �޼ҵ� {} �ȿ��� ��밡���ϴ�(local ����) 
		
		if (num2 < 10 ) {
			System.out.println(num2);
			int num3 =3;// if �Լ� �ȿ����� ��� ����
		}
//		System.out.println(num3); <<< error ������ ���´� num3 ���� ���̱� �����̴�.
		for(int i = 0 ; i<5;i++) {
			System.out.println(i+"  ");
		}
//		System.out.println(i); << for�Լ� �ȿ��� ������ �����߱⶧����  for�Լ������� ���ѵȴ�
	}
	public void print() {
		System.out.println(num1);
//		System.out.println(num2); << num2 ������ main �޼ҵ忡���� ��밡��
	}
}
