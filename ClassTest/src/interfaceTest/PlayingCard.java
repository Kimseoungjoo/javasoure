package interfaceTest;

public interface PlayingCard {
	int spade = 4; // public static final ���� ���� (�Ⱥٿ��� �˾Ƽ� ����� ��)
	final int DIAMOND= 3; //public static final
	static int HEART =2; //public static final
	
	public abstract String	 getCardNumber();
	String getCardkind();
}
