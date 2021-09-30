package object;

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// equals(주소 비교) = > false 
		// 반환 타입이 있으면 받던가 출력하던가 둘 중하나 해야한다.
		
		System.out.println(obj1.equals(obj2));  // 주소가 다르기때문 
		
		// String 사용하는 equals 는 오버라이딩 적용
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.equals(str2));
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		// equals(주소 비교) = > false 
		System.out.println(
);
		
	}
}
