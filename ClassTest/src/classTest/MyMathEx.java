package classTest;

public class MyMathEx {
	public static void main(String[] args) {
		//static 메소드 (클래스 메소드) 호출 => 객체생성 없이 호출
		System.out.println(MyMath.addMath(200L, 100L));
		System.out.println(MyMath.subMath(200L, 100L));
		System.out.println(MyMath.mulMath(200L, 100L));
		System.out.println(MyMath.divMath(200.0, 100.0));
		// 멤버메소드 호출
		MyMath math = new MyMath(200, 100);
		System.out.println(math.addMath());
		System.out.println(math.subMath());
		System.out.println(math.mulMath());
		System.out.println(math.divMath());
		
	}
}
