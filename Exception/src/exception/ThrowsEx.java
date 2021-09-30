package exception;

// main에서 throws ClassNotFoundException : jvm 한테 던져지는 의미 => 화면 출력 

public class ThrowsEx {
	public static void main(String[] args) /*throws ClassNotFoundException*/ { //JVM이 받아서 처리한다 
		
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	// throws : 여기서 발생한 예외를 이 메소드를 호출하는 곳으로 던지겠음
	public static void findClass() throws ClassNotFoundException { // 메소드를 부른 곳으로 던진다 
		Class.forName("");
	}
}

