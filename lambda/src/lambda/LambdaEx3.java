package lambda;


public class LambdaEx3 {
	public static void main(String[] args) {
		
		LambdaTest4 obj = str -> System.out.println(str + "!!");
		obj.showString("�峭ġ�� ���ڽľ� ");
		
		showMyString(obj);
	}
	public static void showMyString(LambdaTest4 lambda) {
		lambda.showString("hello lambda");
	}
}
