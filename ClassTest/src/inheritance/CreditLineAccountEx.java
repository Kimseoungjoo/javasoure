package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount credit = new CreditLineAccount("122-12", "홍길동",
				10000, 1000000);
	
//		System.out.println(credit.withdraw(1500000)); // 사용금액 한도초과
		System.out.println(credit.withdraw(800000)); // - 790000 
		
			
	}

}
