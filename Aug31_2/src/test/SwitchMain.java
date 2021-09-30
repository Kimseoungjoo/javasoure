package test;
//Switch 함수
/*switch(int,double,float,char,String,enum ,조건)
 *   case 값1:
 *   해야할 일;
 *   break;
 *   case 값2:
 *   해야할 일;
 *   break;
 *   default:
 *   해야할 일;
 *   *****if 대체사용가능*********
 * */
public class SwitchMain {
	public static void main(String[] args) {
		//주사위 경우의 수가 6 
		
		// 1~6사이의 수를 자동으로 생성하게 해주는 random함수(math에 포함)
		int dice = (int)(Math.random()*6)+1; //Math.random() > 0.0 ~ 1.0 어떤 실수 값을 불러준다.
										//소수점은 버림으로 처리된다
										//1을 더하는 이유는 1보다 미만인 수가 나오기때문에 6이 안나온다 ^^
			/*
			 *  if (dice==1) {
			 *   System.out.println("숫자 1 나옴");
			 *    }else if (dice==2) {
			 * 		System.out.println("숫자 2 나옴"); 
			 * }else if (dice==3) {
			 * 		System.out.println("숫자 3 나옴"); 
			 * }else if (dice==4) {
			 * 		System.out.println("숫자 4 나옴");
			 *  }else if (dice==5) {
			 * 			System.out.println("숫자 5 나옴"); 
			 * }else{ 
			 * 		System.out.println("숫자 6나옴");
			 *  }
			 */
		switch (dice) {
		case 1:
			System.out.println("주사위 1이 나왔습니다");
			break;
		case 2:
			System.out.println("주사위 2이 나왔습니다");
			break;
		case 3:
			System.out.println("주사위 3이 나왔습니다");
			break;
		case 4:
			System.out.println("주사위 4이 나왔습니다");
			break;
		case 5:
			System.out.println("주사위 5이 나왔습니다");
			break;
		default:
			System.out.println("주사위 6이 나왔습니다");
			break;
		}
		System.out.println(dice);
	}
}
