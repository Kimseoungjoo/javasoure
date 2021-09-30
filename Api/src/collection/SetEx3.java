package collection;

import java.util.HashSet;
import java.util.Set;

// hashcode  

public class SetEx3 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// hashCode() / equals() => 둘다 같다면 저장하지 않음
		set.add(new Member("hong123","hong123","홍길동"));
		set.add(new Member("hong124","hong123","홍길동"));
		set.add(new Member("hong125","hong123","홍길동"));
		set.add(new Member("hong123","hong123","홍길동"));
		
		for(Member m : set) {
			System.out.println(m);
			System.out.println(m.hashCode());
		}
		
		
	}
}
