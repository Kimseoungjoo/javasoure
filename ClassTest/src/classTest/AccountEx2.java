package classTest;

import java.io.IOException;
import java.security.AccessControlContext;
import java.util.Scanner;

public class AccountEx2 {
	public static void main(String[] args) throws IOException {
		//ȫ�浿 ����
		Account2 account1 = new Account2();
//		account1.accountNo = "12-1231-32131";
//		account1.name = "ȫ�浿";
//		account1.balance = 10000;
		
		// �����ڸ� ������� �ʰ� ������� �� �ʱ�ȭ 
		// ���¹�ȣ
				account1.setAccountNo("12-1231-32131");
		// �̸�
				account1.setName("ȫ�浿");
		// �ܾ�
		
				account1.setBalance(20000);
		
		//�Ա�
		account1.deposit(300);
//		System.out.println("�Ա� �� �ܾ� : "+);
				
		//���
		System.out.println("���� �ܾ� : "+account1.withdraw(50000));
		
		// ������ ����
		Account2 account2 = new Account2("12-32131-313132", "������");
		System.out.println("���� �ܾ� ��ȸ : "+ account2.getBalance());
		
		
		
		// �ں��� ����
		Account2 account3 = new Account2("122-01-23131", "�ں���", 60000);
		System.out.println("���� �ܾ� ��ȸ : "+ account3.getBalance());
	
	}
}
