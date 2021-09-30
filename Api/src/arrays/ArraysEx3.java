package arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		
		int arr3[] = {45,34,241,232,21,58,32,123,53,66};	
		
		// 58 숫자가 몇번째에 있는지
		for(int i = 0 ; i< arr3.length; i++) {
			if(arr3[i]==58) {
				System.out.println("58이라는 숫자는 "+(i+1)+"번에 있습니다");
				break;
			}
		}
		System.out.println();
		
		Arrays.sort(arr3);
		// binarySearch : 이진 검색( 정렬을 먼저 한 후 해줘야 오류가 안난다)
		int pos = 	Arrays.binarySearch(arr3, 53);
		System.out.println("58이라는 숫자는 "+(pos+1)+"번에 있습니다");
	
	
	}

}
