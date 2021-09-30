package exam;

import java.util.Scanner;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("======================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("======================================================");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// 계좌생성 작업
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성
	private static void createAccount() {
		// 배열에서 비어 있는지 확인
		System.out.print("계좌 번호(xx-xx-xxxx) : ");
		String ano = sc.next();
		System.out.print("계좌주 이름 : ");
		String owner = sc.next();
		System.out.print("입금액 : ");
		int balance = sc.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다");
				break;
			}
		}

		// 비어 있다면 사용자의 입력값을 기반으로 객체 생성 비어 있는 배열에 담기
		// 계좌번호, 계좌주, 잔액
	}

	// 계좌목록
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}
	}

	// 예금
	private static void deposit() {
		// findAccount 호출을 이용

		// 입급할 계좌번호 입력받기
		System.out.print("입금할 계좌 번호 : ");
		String ano = sc.next();
		System.out.println();
		Account account = findAccount(ano);

		// 입금하기 기능
		if (account != null) {
			System.out.print("입금액 : ");
			int balance = sc.nextInt();
			account.setBalance(account.getBalance() + balance);
		} else {
			System.out.println("입금계좌를 확인해 주세요");
		}
	}

	// 출금
	private static void withdraw() {
		System.out.print("출금할 계좌 번호 : ");
		String ano = sc.next();
		System.out.println();
		Account account = findAccount(ano);

		// 출금하기 기능
		if (account != null) {
			System.out.print("출금액 : ");
			int balance = sc.nextInt();
			account.setBalance(account.getBalance() - balance);
		} else {
			System.out.println("출금계좌를 확인해 주세요");
		}
	}

	// 계좌 찾기 Account 배열에서 ano와 동일한 Account객체 찾기
	private static Account/* <리턴값 */ findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
				}
			}
		}
		return account;
	}

}
