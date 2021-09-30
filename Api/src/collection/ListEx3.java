package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		// 생성
		List<Member> list = new ArrayList<Member>();
		
		// 추가
		list.add(new Member("hong","hong1234","홍길동"));
		list.add(new Member("hong1","hong1235","이길동"));
		list.add(new Member("hong2","hong1236","김길동"));
		list.add(new Member("hong3","hong1237","박길동"));
		list.add(new Member("hong4","hong1238","오길동"));
		
		//가져오기
		System.out.println(list); 
		
		for(Member member:list) {
			System.out.println(member);
		}
		
		
	}

}
