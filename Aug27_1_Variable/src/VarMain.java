//	����(Variable)
//	���α׷� ���� �߿� ������� ������ 
// CPU - ������ġ > ������ ���� 
// RAM - ������ġ > ������ ���� ����
//              ���� 
//				stack  - ���α׷� ����� �ڵ��ݳ� > ���ᰡ �ȵȴٸ� ?? >> ��� ���� > �������� �ݳ��� �Ұ��� 
//				static - 
//				heap   - �ڵ��ݳ��� ���� �ʴ´�. > �����ڰ� �������� �ݳ�ó���� �ؾ��Ѵ�. 
//  					 java���� GarbageCollection ����� heap���� �ڵ����� �ý����� �ִ�. - 
// SSD/HDD - ������ġ 
// GPU - �׷��� ǥ���ϴµ� �ʿ���(����+����(RAM+HDD)
// 1bit = 0/1
// 1byte 
//�ڷ��� 
//	   �⺻��
//		  ���� - byte(1byte : -100~100), short(2byte - 6��~6��) , int(4byte -21��~21��)***, long
//		  �Ǽ� - float(4), double(8)**** 
//		  ���� - char(2)
//		  �� - boolean(1)
//		  ���� - void, null
//	   ������
//		  ���ڿ� - string  << ��ǻ�� 32bit/64bit ������ �����ش� 
//					�������� heap�� �����Ѵ�. �ٸ� �������� stack�� ���δ� 
//	������ 
//		���ڷ� ���� �Ұ�, 
//		Ư������ �Ұ�($�� ������)
//		�ڹٹ��� �Ұ� 
public class VarMain {

	public static void main(String[] args) {
		int kor;
		double tem = 24.38;
		kor = 80;
		System.out.println("korscore");
		System.out.println(kor);
		System.out.print("�������� : ");
		System.out.print(tem);
		System.out.println("�� �Դϴ�");
		
		float temp= (float) 24.38; // ����ȯ(casting);
		System.out.println(temp);
		
		char laugh = 'z';
		System.out.println(laugh);
		
		String laugh2 = "���� �����̾�...";
		System.out.println(laugh2);
		
		boolean isHungry = true;
		System.out.println(isHungry);
		
		/* Java���� ���������� ����� ���� �ȳ����� ����� �Ұ���
		 * int age; 
		 * System.out.println(age);
		 */
		int age=27;
		System.out.println(age);
	}
}