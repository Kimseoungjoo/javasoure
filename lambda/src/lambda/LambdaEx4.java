package lambda;


public class LambdaEx4 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		LambdaTest3 obj = (s, v) -> System.out.println(s+" , "+v);
		obj.makeString(str1, str2);
		
		
	}
}
