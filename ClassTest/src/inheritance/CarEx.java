package inheritance;

public class CarEx {
	public static void main(String[] args) {
		FireEngine fire;
		Ambulance ambul;
		// fire= ambul; ��Ӱ��谡 �ƴ� Ŭ���� ���� ����ȯ �Ұ�

		fire = new FireEngine();
		Car car = fire; // ��� ���谡 �ִ� ��Ȳ������ ����ȯ����(upcasting,��ĳ����(�ڽ��� �θ�����) > ����ȯ ��������)
		
		FireEngine f2;
		f2 = (FireEngine) car; //downcasting �ٿ� ĳ���� > ����ȯ ���� �Ұ�
		
		f2.water();
	}
}
