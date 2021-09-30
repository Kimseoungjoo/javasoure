package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		
		//String accountNo, String name, int balance, String cardNo
		CheckingAccount checkingAccount = new CheckingAccount("122-12","ȫ�浿",200000,"122-12-133");
		
		
		System.out.println(checkingAccount.pay("122-12-133",20000));
		
		
	}
}
