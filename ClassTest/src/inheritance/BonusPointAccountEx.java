package inheritance;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("12-12-1342", "홍길동", 10000, 100);
		bonus.deposit(100000);
		
		System.out.println("현재 잔액 : "+bonus.getBalance());
		System.out.println("현재보너스포인트 : " + bonus.getBonusPoint());
	}
}
