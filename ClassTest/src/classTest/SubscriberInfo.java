package classTest;

public class SubscriberInfo {
	// �Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
	private String name;
	private String id;
	private String password;
	private String tel;
	private String addr;
	
	// ������ - �̸�, ���̵� �н����常 �ʱ�ȭ�� ���� ��ü����
	// 			�̸�, ���̵� �н�����,��ȭ��ȣ, �ּҸ� �ʱ�ȭ �� �� ��ü ����
	
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo(String name, String id, String password, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.addr = addr;
	}

	// ��� - ��й�ȣ ����, ��ȭ��ȣ ����, �ּ� ����
	//setter �޼ҵ�
	public void setPassword(String password) {
		this.password = password;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	void print() {
		System.out.println("�̸� :"+name+" ���̵� : "+id);
		System.out.println("��й�ȣ :"+password+" ��ȭ��ȣ : "+tel);
		System.out.println("�ּ� :"+addr);
		
	}
	
	

}
