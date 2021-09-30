package exception;
// 나만의 Exception 만드는 법(Exception 상속)
public class BalancesufficientException extends Exception{
	
	public BalancesufficientException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BalancesufficientException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}
