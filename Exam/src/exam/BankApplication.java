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
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5.����");
			System.out.println("======================================================");
			System.out.print("���� > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// ���»��� �۾�
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
		System.out.println("���α׷� ����");
	}

	// ���� ����
	private static void createAccount() {
		// �迭���� ��� �ִ��� Ȯ��
		System.out.print("���� ��ȣ(xx-xx-xxxx) : ");
		String ano = sc.next();
		System.out.print("������ �̸� : ");
		String owner = sc.next();
		System.out.print("�Աݾ� : ");
		int balance = sc.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���°� �����Ǿ����ϴ�");
				break;
			}
		}

		// ��� �ִٸ� ������� �Է°��� ������� ��ü ���� ��� �ִ� �迭�� ���
		// ���¹�ȣ, ������, �ܾ�
	}

	// ���¸��
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}
	}

	// ����
	private static void deposit() {
		// findAccount ȣ���� �̿�

		// �Ա��� ���¹�ȣ �Է¹ޱ�
		System.out.print("�Ա��� ���� ��ȣ : ");
		String ano = sc.next();
		System.out.println();
		Account account = findAccount(ano);

		// �Ա��ϱ� ���
		if (account != null) {
			System.out.print("�Աݾ� : ");
			int balance = sc.nextInt();
			account.setBalance(account.getBalance() + balance);
		} else {
			System.out.println("�Աݰ��¸� Ȯ���� �ּ���");
		}
	}

	// ���
	private static void withdraw() {
		System.out.print("����� ���� ��ȣ : ");
		String ano = sc.next();
		System.out.println();
		Account account = findAccount(ano);

		// ����ϱ� ���
		if (account != null) {
			System.out.print("��ݾ� : ");
			int balance = sc.nextInt();
			account.setBalance(account.getBalance() - balance);
		} else {
			System.out.println("��ݰ��¸� Ȯ���� �ּ���");
		}
	}

	// ���� ã�� Account �迭���� ano�� ������ Account��ü ã��
	private static Account/* <���ϰ� */ findAccount(String ano) {
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
