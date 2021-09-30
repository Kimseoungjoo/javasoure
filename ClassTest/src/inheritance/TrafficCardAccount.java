package inheritance;

// Account2
// CheckingAccount
public class TrafficCardAccount extends CheckingAccount {

	//CheckingAccount => 계좌번호 , 계좌주, 잔액, 카드번호
	//CheckingAccount => 입금하다, 출금하다, 체크카드 결제
	private boolean hasTrafficCard;
	
	public TrafficCardAccount(String accountNo, String name, int balance, 
			String cardNo, boolean hasTrafficCard) {
		super(accountNo, name, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	// 교통카드 기능 여부
	
	
	// 교통카드 기능이 있다면 교통비 지불한다.
	// 입력값 : 카드번호, 사용액
	// 반환값 : 정수형(int)
	int trafficPay(String cardNo, int amount) {
		if(!hasTrafficCard) {// 같은 뜻 hasTrafficCard !=true
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}
		return pay(cardNo, amount);
	}

	
}
