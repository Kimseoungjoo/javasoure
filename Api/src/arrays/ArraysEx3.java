package arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		
		int arr3[] = {45,34,241,232,21,58,32,123,53,66};	
		
		// 58 ���ڰ� ���°�� �ִ���
		for(int i = 0 ; i< arr3.length; i++) {
			if(arr3[i]==58) {
				System.out.println("58�̶�� ���ڴ� "+(i+1)+"���� �ֽ��ϴ�");
				break;
			}
		}
		System.out.println();
		
		Arrays.sort(arr3);
		// binarySearch : ���� �˻�( ������ ���� �� �� ����� ������ �ȳ���)
		int pos = 	Arrays.binarySearch(arr3, 53);
		System.out.println("58�̶�� ���ڴ� "+(pos+1)+"���� �ֽ��ϴ�");
	
	
	}

}
