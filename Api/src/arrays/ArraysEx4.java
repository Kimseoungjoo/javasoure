package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysEx4 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple","���","lemon"); // ���� ũ�� ... 
		//list.set(1,"����"); // runTime Exeception
		System.out.println(list);
		// ���� ũ�� �����ϴ� ��
		List<String> list2 = new ArrayList<>(Arrays.asList("apple","���","lemon")); // ���� ũ�� ... 
		list2.add("����");
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<String>(); // ũ�Ⱑ ���� 
		
		
		list3.add("apple");
		list3.add("���");
		list3.add("lemon");
		
		List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list4.add(6);
		System.out.println(list4);
		
	}
}
