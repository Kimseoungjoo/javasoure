package interfaceTest;

public interface PlayingCard {
	int spade = 4; // public static final 생략 가능 (안붙여도 알아서 상수가 됨)
	final int DIAMOND= 3; //public static final
	static int HEART =2; //public static final
	
	public abstract String	 getCardNumber();
	String getCardkind();
}
