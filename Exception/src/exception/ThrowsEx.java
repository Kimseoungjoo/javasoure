package exception;

// main���� throws ClassNotFoundException : jvm ���� �������� �ǹ� => ȭ�� ��� 

public class ThrowsEx {
	public static void main(String[] args) /*throws ClassNotFoundException*/ { //JVM�� �޾Ƽ� ó���Ѵ� 
		
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	// throws : ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
	public static void findClass() throws ClassNotFoundException { // �޼ҵ带 �θ� ������ ������ 
		Class.forName("");
	}
}

