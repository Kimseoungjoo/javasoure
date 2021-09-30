package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String text = "ȫ�浿/������/�ڿ���/�̼�ȫ";
		String[] names = text.split("/");
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println();
		StringTokenizer st = new StringTokenizer(text, "/");
		
			Object object = (Object) st.nextElement();
			
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();

		String text2 = "ȫ�浿 ������ �ڿ��� �̼�ȫ";
		String[] names2 = text2.split(" ");
		for(String s:names2) {
			System.out.println(s);
		}
		
	}

}
