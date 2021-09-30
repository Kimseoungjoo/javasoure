package exception;





// Exception(예외사항)
// CheckedException : compile 시 나타나는 예외
// UnCheckedException : run 타임 시 나타나는 예외

public class CheckedException {
	public static void main(String[] args)  {// 첫번쨰 해결방식
		try {
			Class.forName("java.lang.String"); // Unhandled exception type ClassNotFoundException
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
	}
}
