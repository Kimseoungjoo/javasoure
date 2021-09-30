package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		// 로또 번호 추출
		// 1~45 숫자 중복
		Set<Integer> set = new TreeSet<Integer>(); // 검색하고 정렬하는 기능이 좋다 

		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);

		}
		System.out.println(set);

	}
}
