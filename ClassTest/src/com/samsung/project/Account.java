package com.samsung.project;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222),�ܾ�,�̸�
	private String accountNo;
	private int balance;
	private String name;

	// �⺻������
	
	

	// ��� : �Ա��Ѵ�.(�Է°� : �Աݾ�, ��ȯ��:����) => �����ܾ� += �Աݾ�
	public void deposit(int amount) {
		balance += amount;
	}

	public Account(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}

	// ����Ѵ�.(�Է°� : ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -= ��ݾ�
	public int withdraw(int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
}
