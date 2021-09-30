package string;

//1. Immutable(불변, 변하지않는다) 

public class Replace {
	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";

		// 자바 => JAVA; 원본 자체를 변경할 수는 없기떄문에 다시 담아야한다.
		//str1 = str1.replace("자바", "JAVA");
		str1 = str1.replaceFirst("자바", "JAVA");

		System.out.println(str1);

	}
}
