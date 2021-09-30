package string;

public class CharAt {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		char ch1 = str1.charAt(3);
		
		System.out.println(ch1);
	
		boolean flag =false;
		for(int i= 0 ; i<str1.length();i++) {
			char ch2 = str1.charAt(i);
			if((ch2=='그')) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "포함하고 있음" : "포함하고 있지않음");
		
		// str1 에 '그' 라는 문자가 있는지 확인하고 들어있따면 
		// 포함하고 있음, 없다면 포함하고 있지않음
		String str2 = "Hello java!!";
		char[] chArr = new char[str2.length()] ;
		//str2를 char 배열에 담고 그 배열을 출력
		for(int i =0;i<str2.length();i++) {
			chArr[i] = str2.charAt(i);			
		}
		for(char i :chArr) {
			System.out.printf("%c ",i);
		}
		
	}

}
