package classTest;

public class MethodTestEx {
	public static void main(String[] args) {

		MethodTest1 obj = new MethodTest1();
		
		//�޼ҵ� ȣ��� ���ϵǴ� ���� �ִ� ���
		
		obj.isRedierect();
		// 1. print()
		System.out.println(obj.isRedierect());
		
		// 2. ���ϵǴ� �� �ޱ�
		boolean returnValue = obj.isRedierect();
		System.out.println(returnValue);
		
		int var1 = obj.sum();
		
		System.out.println(var1);
		System.out.println(obj.add(25, 34));
		
	}
}
