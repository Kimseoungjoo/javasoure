package classTest;


public class AccountEx3 {
	public static void main(String[] args)  {
		//Account3 객체를 5개 생성하고 싶다.
		Account3 account1 = new Account3("122-11",25000,"홍길동");
		Account3 account2 = new Account3("122-12",25000,"김길동");
		Account3 account3 = new Account3("122-13",25000,"최길동");
		Account3 account4 = new Account3("122-14",25000,"박길동");
		Account3 account5 = new Account3("122-15",25000,"오길동");
		Account3 account6 = new Account3("122-16",25000,"이길동");
		
		//동일한 타입으로 객체 생성시 효율성을 적용한다면?
		//배열
		//int a,b....; >> int arr[] = new int [10];
		//arr[0] print = > 0 
		// double arr[] = new double[5]; => arr[0] => 0.0
		
		//클래스배열 
		Account3 accArr[] = new Account3[5];
		
		System.out.println(accArr[0]);
		
		accArr[0] = new Account3("122-11", 250000,"홍길동");
		accArr[1] = new Account3("122-12",25000,"김길동");
		accArr[2] = new Account3("122-13",25000,"최길동");
		accArr[3] = new Account3("122-14",25000,"박길동");
		accArr[4] = new Account3("122-15",25000,"오길동");
		
		for(int i = 0; i<5;i++) {
			Account3 account = accArr[i];
//			System.out.println(account.getName()+"\t");
//			System.out.println(account.getAccountNo()+"\t");
//			System.out.println(account.getBalance()+"\t");
			accountPrint(account);
		}
		
		accountPrint(accArr);
		
		
	}
	static void accountPrint(Account3 accArr[]) {
		for(int i = 0; i<accArr.length;i++) {
			System.out.println(accArr[i].getName()+"\t");
			System.out.println(accArr[i].getAccountNo()+"\t");
			System.out.println(accArr[i].getBalance()+"\t");
		}
	}
	static void accountPrint(Account3 account) {
			System.out.println(account.getName()+"\t");
			System.out.println(account.getAccountNo()+"\t");
			System.out.println(account.getBalance()+"\t");
	}
	
}
