package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysEx4 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple","사과","lemon"); // 고정 크기 ... 
		//list.set(1,"수박"); // runTime Exeception
		System.out.println(list);
		// 고정 크기 변경하는 법
		List<String> list2 = new ArrayList<>(Arrays.asList("apple","사과","lemon")); // 고정 크기 ... 
		list2.add("수박");
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<String>(); // 크기가 자유 
		
		
		list3.add("apple");
		list3.add("사과");
		list3.add("lemon");
		
		List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list4.add(6);
		System.out.println(list4);
		
	}
}
