package classTest;

import java.util.Scanner;

public class AccountMy {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�
	// ��� : �Ա�, ���
	// �Ա��Ѵ�. (�Է°� : �Ա޾�, ��ȯ��:����) => �����ܾ� +=�Աݾ�
	// ����Ѵ�. (�Է°� : �Ա޾�, ��ȯ��:����) => �����ܾ� -=��ݾ�
	Scanner sc = new Scanner(System.in);
	private String[] accountNo;
	private String name[] = new String[10];
	private int inMoney;
	private int outMoney;
	private int store;
	private int i = 0;
	private int j = 0;

	void addInmoney(int inMoney) {
		store += inMoney;
	}

	int subOutmoney(int outMoney) {
		this.store -= outMoney;
		return store;
	}

	void print() {
		System.out.print("���¹�ȣ �Է� :");
		accountNo[i] = sc.next();
		System.out.print("�̸� �Է� :");
		name[j] = sc.next();
		i++;
		j++;
	}
	
	void print1() {
		System.out.println("====================================");
		System.out.println("���� ��ȣ :" + accountNo);
		System.out.println("�̸� : " + name);
		System.out.println("���� �ݾ� :" + store);
	}
}
