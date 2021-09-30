package collection;

import java.util.ArrayList;
import java.util.List;

/* 컬렉션 프레임워크
 *  - 여러 데이터들을 저장하는 클래스들을 표준화한 설계방법
 *  - collection(interface) - List, Set
 *  - Map
 *  
 *  List(인터페이스) : 순서가 있다. 데이터의 중복이 가능하다. 
 *       구현 클래스 : Vector, ArrayList, LinkedList, Stack....
 *  	 배열과 같은 개념인데, 업그레이드한 구조
 *  E / T / K / V  >> 객체 타입을 지정하라는 소리다 
 *  
 *  기본 타입 => 객체 타입 (Wrapper 클래스)
 *  ex) int => Integer, float => Float, double => Double, char = > character
 *  boolean = > Boolean
 */

public class ListEx1 {
	public static void main(String[] args) {
		
		// 객체 생성 
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Character> list3 = new ArrayList<Character>();
		
		// 데이터 추가
		list1.add("사과");
		list1.add("복숭아");
		list1.add("바나나");
		list1.add("망고");
		list1.add("딸기");
		list1.add("배");
		list1.add("수박");
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);

		//데이터 가져오기
		for(String i :list1	 ) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println(list1); // toString 오버라이딩 
		for(int i =0 ; i<list1.size();i++) { // size = length
			System.out.println(list1.get(i));
		}
		
		for(int i :list2) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println(list2);
		
		// 합계구하기 
		int sum = 0;
		for(int i =0; i <list2.size(); i++) {
			sum+=list2.get(i);
			
		}
		System.out.println("합계 :" + sum);
		
	}
}
