package classTest;

public class Card {
	// �������
	// ��ü������ �޸𸮿� �ε�
	private String kind; // ī�� ��� ����
	private int number; // ī�� ���� ����

//	int width = 10;
//	int height = 7;
	// static(����) : Ŭ������ ������ ���
	// 				  ��ü�� ���������ʰ� ���
	//				  Ŭ������ �޸𸮿� �ε�� �� ����
	static int width = 10;
	static int height = 7;
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	//static(����) : ��ü�� �������� �ʰ� ���
	//				 Ŭ������ �޸𸮿� �ε�� �� ����
	//				 static �޼��� �ȿ��� �ν��Ͻ� ��� ���Ұ�
//	public static int getWidth() {
//		return width;
//	}

//	public static int getHeight() {
//		return height;
//	}

}
