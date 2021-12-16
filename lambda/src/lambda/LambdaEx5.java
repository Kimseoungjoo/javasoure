package lambda;


public class LambdaEx5 {
	
	public static void execute(LambdaTest5 lambda) {
		lambda.run();
	}
	
	// ��ȯ ������ ���̴� ���ٽ� 
	public static LambdaTest5 getRun() {
		LambdaTest5 lambda = () -> System.out.println("�Լ��� �������̽� ����");
		return lambda;
	}
	
	public static void main(String[] args) {
		LambdaTest5 lambda = () -> System.out.println("Lambda!!! run");
		lambda.run();
		
		// �Ű������� �����ϴ� ���ٽ�
		System.out.println("---------------------------------");
		execute(getRun());
		System.out.println("---------------------------------");
		
		
	}
}
