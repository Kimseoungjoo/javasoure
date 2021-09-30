package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
	public static void main(String[] args) {
		int arr1[] = {10,73,2,-5,42};
		int arr2[] = {10,73,2,-5,41};
		
		System.out.println(Arrays.equals(arr1,arr2) ? "����" : "�ٸ�");
		
		 System.out.println();
		 
		 int arr3[] = {45,34,241,232,21};
		 // ����
		 
		Arrays.sort(arr3); // �������� 
		System.out.println(Arrays.toString(arr3));
		
		
		// ���� ���� �ϴ¹��
		Integer arr4[]	= {45,34,241,232,21};

		Arrays.sort(arr4, Comparator.reverseOrder()); //T >> ��üŸ������ �־�� Comparator.naturalOrder() - ��������
		
		System.out.println(Arrays.toString(arr4));
		
		String[] strArr = { "good","height","very","apple","zero", "zoo"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		Character chArr[] = {'��','��','��','��','��','��','��'};
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		Arrays.sort(chArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(chArr));
		
		

		
		
		
		
	}
}
