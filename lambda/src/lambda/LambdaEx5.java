package lambda;


public class LambdaEx5 {
	
	public static void execute(LambdaTest5 lambda) {
		lambda.run();
	}
	
	// 반환 값으로 쓰이는 람다식 
	public static LambdaTest5 getRun() {
		LambdaTest5 lambda = () -> System.out.println("함수형 인터페이스 리턴");
		return lambda;
	}
	
	public static void main(String[] args) {
		LambdaTest5 lambda = () -> System.out.println("Lambda!!! run");
		lambda.run();
		
		// 매개변수로 전달하는 람다식
		System.out.println("---------------------------------");
		execute(getRun());
		System.out.println("---------------------------------");
		
		
	}
}
