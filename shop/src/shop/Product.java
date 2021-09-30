package shop;

// �߻�Ŭ����  : ���߻����̴� 
// ���߻� : �Ϲ�Ŭ������ �����ѵ�, �߻�޼��嵵 ������ �ִ� ���� 

public abstract class Product {
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void printDetail() {// ��ǰ�� �⺻������ �̸��� ������ ���
		System.out.println("��ǰ�� : "+this.pname);
		System.out.println("���� : "+this.price);
		printExtra();
		
	}
	public abstract void printExtra();
	
	
}
