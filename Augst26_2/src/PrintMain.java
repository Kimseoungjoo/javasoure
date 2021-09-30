// 버전1.8.0-302
// 1 : major version <<< 이자리 숫자가 바뀌면 프로그램이 완전 달라진다.
// 8.0-302 : minor 뒷자리가 마뀔수록 조금

public class PrintMain {
	public static void main(String[] args) {
		// 메인 안 내용만 실행된다.
		
		System.out.print("단축키가 넘나 많은걸");	// 콘솔에 출력
		System.out.println("언제다 외우죠?");		// 출력 및 줄바꿈
		System.out.println("행복하다......");		//println << Test로 많이 사용한다.
		System.out.printf("%.1f",123313.123);		//형식을 지정하면서 콘솔창에 출력
		System.out.println();	
		System.out.println("1,7호선"); 
		// \n -  줄만바꿈  new line
		// \r -  커서 맨앞으로 바꿈carriage return  
		// \r\n - perfect new line
		// \t - tap 줄 (밑/윗)라인 맞추기
		// \b - backspace(1byte) >>하지만 모든 언어 2byte ㅋㅋㅋㅋ 못 지워 버려 !!!쓰지마 
		// \\ - \랑 같다 
		// \" = " << 출력가능
		System.out.print("교통비 : ");System.out.println(1500);
		System.out.print("ㅋㅋㅋ\r\nㅎㅎㅎㅎ");
		System.out.print("\r\nㅋㅋㅋ\tㅎㅎㅎㅎ");
		System.out.println("\r\n집 : \t부천");
		System.out.println("직업 : \t학생");
		System.out.println("\"");
		
	}
}
