package stringtokenizer;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		
		String str1 = "hello java!!!";
		char[] ch= new char[str1.length()];
		int s = str1.length()-1;
		//String ���·� �ΰ� �Ųٷ� ���
		for(int i = 0 ;i< str1.length();i++) {
			ch[i] = str1.charAt(s);
			s--;
		}
		for(char i :ch) {
			System.out.print(i);
		}
		// ���ӽ� coding
//		System.out.println();
//		
//		char[] chArr = str1.toCharArray();
//		for(int i=chArr.length-1; i>=0;i-- ) {
//			System.out.print(chArr[i]+" ");
//		}
//		
//		System.out.println();
		
		String str2 = "hello java!!!";
		//String Builder �Ųٷ� ���
		StringBuilder builder = new StringBuilder(str2);
		System.out.println(builder.reverse());
	}
}
