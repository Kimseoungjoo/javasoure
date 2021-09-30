package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		// 로또 번호 추출
		// 1~45 숫자 중복
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
			
		}
		System.out.println(set);
		
		
		
	}
}
