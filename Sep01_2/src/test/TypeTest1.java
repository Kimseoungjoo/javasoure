package test;

public class TypeTest1 {
	public static void main(String[] args) {
		// Ÿ�� > 1) �⺻Ÿ�� 2) ����Ÿ��
		// ������ �޸𸮰� ���Ǵ� ����� �޶�����.

		// �⺻Ÿ��
		int age = 25;
		double price = 200.3;
		System.out.println(age);
		System.out.println(price);

		// ����Ÿ�� = > ����Ÿ�� / null�� �ʱ�ȭ�� �����ϴ�.
		// ���ڿ� ���� : String name = new String("java");
		String name = "java";
		String name2 = new String("java");
		String hobbby = null;// null�� heap�� �ּ� ������ ����Ű�� ���� �ʴٶ�� �ǹ� ���� 
		

		// �� ��� ==,!=
		// equals();
		System.out.println(name.equals(name2) ? "������" : "�ٸ�");
		System.out.println(name.equals(name2));
		System.out.println(hobbby);
		//System.out.println(hobbby.length());// java.lang.NullPointerException error
	}
}
