package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		// �ζ� ��ȣ ����
		// 1~45 ���� �ߺ�
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
			
		}
		System.out.println(set);
		
		
		
	}
}
