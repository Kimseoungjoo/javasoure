package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		// ����
		List<Member> list = new ArrayList<Member>();
		
		// �߰�
		list.add(new Member("hong","hong1234","ȫ�浿"));
		list.add(new Member("hong1","hong1235","�̱浿"));
		list.add(new Member("hong2","hong1236","��浿"));
		list.add(new Member("hong3","hong1237","�ڱ浿"));
		list.add(new Member("hong4","hong1238","���浿"));
		
		//��������
		System.out.println(list); 
		
		for(Member member:list) {
			System.out.println(member);
		}
		
		
	}

}
