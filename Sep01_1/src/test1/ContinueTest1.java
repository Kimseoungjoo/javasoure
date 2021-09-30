package test1;

//Continue : 반복문안에서 사용되며, 블록 내에서 continue 문이
//실행되면 for문의 증감식, while 조건식으로 이동

public class ContinueTest1 {
	public static void main(String[] args) {
		
		for(int i =0; i<10 ; i++) {
			if(i%2!=0) {
				continue;// 조건에 해당되면 continue는 다음의 함수를 수행하지않고
						 // 다시 for 조건식으로간다 
			}
			System.out.println(i);
		}
		
	}

}
