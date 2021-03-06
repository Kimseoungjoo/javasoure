package exam;

public class PromotionEx1 {
	public static void main(String[] args) {
		// 변수 선언
		// 정수 타입 > byte(1byte=8bit) < char(2byte) 
		//             < short(2byte) < int(4byte) < long(8byte)
		// 실수 타입 > float(4byte) > double (8byte)
		
		//작은 타입으로 선언을 했는데 큰 타입에 넣으면 자동형변환이 이루어진다.
		
		byte byteValue = 10;
		
		//자동 형변환
		int intValue = byteValue;
		System.out.println(intValue);
		
		//자동 형변환
		intValue = 500;
		long longValue = intValue;
		
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2;
		System.out.println(charValue3);
		//강제 형변환(casting)
		System.out.println((char)charValue3); // B
		
	}
	
}
