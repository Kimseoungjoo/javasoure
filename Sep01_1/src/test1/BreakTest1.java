package test1;

//break : 반복문 실행 중지 함수


public class BreakTest1 {
	public static void main(String[] args) {

		while(true) {
			//주사위를 돌려서 6이 나오면 반복문 종료
			int dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
			if(dice==6) {
				break;
			}
		}
		
	}
}
