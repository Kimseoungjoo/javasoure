package exception;





// Exception(���ܻ���)
// CheckedException : compile �� ��Ÿ���� ����
// UnCheckedException : run Ÿ�� �� ��Ÿ���� ����

public class CheckedException {
	public static void main(String[] args)  {// ù���� �ذ���
		try {
			Class.forName("java.lang.String"); // Unhandled exception type ClassNotFoundException
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
	}
}
