package string;

public class CharAt {
	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		char ch1 = str1.charAt(3);
		
		System.out.println(ch1);
	
		boolean flag =false;
		for(int i= 0 ; i<str1.length();i++) {
			char ch2 = str1.charAt(i);
			if((ch2=='��')) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "�����ϰ� ����" : "�����ϰ� ��������");
		
		// str1 �� '��' ��� ���ڰ� �ִ��� Ȯ���ϰ� ����ֵ��� 
		// �����ϰ� ����, ���ٸ� �����ϰ� ��������
		String str2 = "Hello java!!";
		char[] chArr = new char[str2.length()] ;
		//str2�� char �迭�� ��� �� �迭�� ���
		for(int i =0;i<str2.length();i++) {
			chArr[i] = str2.charAt(i);			
		}
		for(char i :chArr) {
			System.out.printf("%c ",i);
		}
		
	}

}
