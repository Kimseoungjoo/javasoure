package test;

public class ArrayTest4 {
	public static void main(String[] args) {
		// 배열순서
//		ex) int arry[];	//선언 
//			arry = new int[10];	//생성 (데이터는 0)
//			int arry2[] = {12,32,42,52};	//선언 및 생성

		int score[] = { 78, 65, 95, 88, 36, 45, 25, 47, 87, 43 };

		// 평균
		int sum = 0;
		
//		for(int i =0; i<score.length;i++) {
//			sum +=score[i];			
//		}
		for(int jumsu:score) {
			sum+=jumsu;
		}
	System.out.println("반 평균 : "+(double)sum/score.length+"입니다");
		
	}
	
}
