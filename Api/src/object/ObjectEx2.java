package object;

public class ObjectEx2 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// toString => 객체를 문자열로 표현 
		System.out.println(obj1.toString());  // java.lang.Object@7de26db8
		System.out.println(obj2.toString());  // java.lang.Object@1175e2db
		
		// toString 사용하는 toString 을 오버라이딩 적용 => 객체가 가지고 있는 값 출력
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		// toString() = > 10
		System.out.println(value1.toString()); //object.Value@76ccd017
		System.out.println(value2.toString()); //object.Value@182decdb
		
	}
}
