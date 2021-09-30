package test;

public class Test2 {
	public static void main(String[] args) {
		//배열은 추가/삭제 하는 기능은 프로그램에 좋은 영향을 주지않는다.
		int oldArr[] = {10,20,30};
		
		int newArr[] = new int [4];
		//기존 값 새로운 곳으로 복사
//		for(int i=0; i<oldArr.length; i++) {
//				newArr[i] = oldArr[i];
//		} 사용자가 직접 하는 방식
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);// 위의 방식과 같다;

		newArr[3] = 40;
		
		for(int i:newArr	) {
			System.out.println(i+" ");
		}
		
		
	}
}
