package shop;


// ���� �߻�ȭ ���� => ����ʵ�,�߻�޼��常 ������
//jdk8 => default, static ���� �� �ֱ�� ��

public interface Ishop {
	// �߻�޼���
	void setTitle(String title); // abstract ������ �޼����� �����ϸ� �ȴ� 
	void genUser();
	void genProduct();
	void start();
	
	
	
}
