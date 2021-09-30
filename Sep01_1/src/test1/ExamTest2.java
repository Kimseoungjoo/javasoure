package test1;

public class ExamTest2 {
	public static void main(String[] args) {
		// 중첩 for 문을 사용해서 방정식 4x+ 5y = 60 의 모든 해를
		// 구해서 (x,y) 형태로 출력하기
		// 단, x,y 는 10이하의 자연수
		int result = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				result = (4*i)+(5*j);
				if(result == 60) {
					
					System.out.printf("(%d , %d) > 4 x %d + 5 x %d = %d\n",i,j,i,j,result);
				}
			}
		}
	}
}
