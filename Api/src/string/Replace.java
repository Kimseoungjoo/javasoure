package string;

//1. Immutable(�Һ�, �������ʴ´�) 

public class Replace {
	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";

		// �ڹ� => JAVA; ���� ��ü�� ������ ���� ���⋚���� �ٽ� ��ƾ��Ѵ�.
		//str1 = str1.replace("�ڹ�", "JAVA");
		str1 = str1.replaceFirst("�ڹ�", "JAVA");

		System.out.println(str1);

	}
}
