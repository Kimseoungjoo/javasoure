// ����1.8.0-302
// 1 : major version <<< ���ڸ� ���ڰ� �ٲ�� ���α׷��� ���� �޶�����.
// 8.0-302 : minor ���ڸ��� ������� ����

public class PrintMain {
	public static void main(String[] args) {
		// ���� �� ���븸 ����ȴ�.
		
		System.out.print("����Ű�� �ѳ� ������");	// �ֿܼ� ���
		System.out.println("������ �ܿ���?");		// ��� �� �ٹٲ�
		System.out.println("�ູ�ϴ�......");		//println << Test�� ���� ����Ѵ�.
		System.out.printf("%.1f",123313.123);		//������ �����ϸ鼭 �ܼ�â�� ���
		System.out.println();	
		System.out.println("1,7ȣ��"); 
		// \n -  �ٸ��ٲ�  new line
		// \r -  Ŀ�� �Ǿ����� �ٲ�carriage return  
		// \r\n - perfect new line
		// \t - tap �� (��/��)���� ���߱�
		// \b - backspace(1byte) >>������ ��� ��� 2byte �������� �� ���� ���� !!!������ 
		// \\ - \�� ���� 
		// \" = " << ��°���
		System.out.print("����� : ");System.out.println(1500);
		System.out.print("������\r\n��������");
		System.out.print("\r\n������\t��������");
		System.out.println("\r\n�� : \t��õ");
		System.out.println("���� : \t�л�");
		System.out.println("\"");
		
	}
}
