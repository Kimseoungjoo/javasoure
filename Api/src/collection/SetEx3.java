package collection;

import java.util.HashSet;
import java.util.Set;

// hashcode  

public class SetEx3 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// hashCode() / equals() => �Ѵ� ���ٸ� �������� ����
		set.add(new Member("hong123","hong123","ȫ�浿"));
		set.add(new Member("hong124","hong123","ȫ�浿"));
		set.add(new Member("hong125","hong123","ȫ�浿"));
		set.add(new Member("hong123","hong123","ȫ�浿"));
		
		for(Member m : set) {
			System.out.println(m);
			System.out.println(m.hashCode());
		}
		
		
	}
}
