package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		// �ζ� ��ȣ ����
		// 1~45 ���� �ߺ�
		Set<Integer> set = new TreeSet<Integer>(); // �˻��ϰ� �����ϴ� ����� ���� 

		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);

		}
		System.out.println(set);

	}
}
