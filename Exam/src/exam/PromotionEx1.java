package exam;

public class PromotionEx1 {
	public static void main(String[] args) {
		// ���� ����
		// ���� Ÿ�� > byte(1byte=8bit) < char(2byte) 
		//             < short(2byte) < int(4byte) < long(8byte)
		// �Ǽ� Ÿ�� > float(4byte) > double (8byte)
		
		//���� Ÿ������ ������ �ߴµ� ū Ÿ�Կ� ������ �ڵ�����ȯ�� �̷������.
		
		byte byteValue = 10;
		
		//�ڵ� ����ȯ
		int intValue = byteValue;
		System.out.println(intValue);
		
		//�ڵ� ����ȯ
		intValue = 500;
		long longValue = intValue;
		
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2;
		System.out.println(charValue3);
		//���� ����ȯ(casting)
		System.out.println((char)charValue3); // B
		
	}
	
}
