package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// data �߰�
		// Ű���� �ߺ��� �ȵȴ� .
		map.put("id_0123", "ȫ�浿");
		map.put("id_0124", "��浿");
		map.put("id_0125", "�۱浿");
		map.put("id_0126", "�ֱ浿");
		
		// ��������
		System.out.println("Ű�� �ش��ϴ� �� �������� "+map.get("id_0123") );
		System.out.println("Ű�� ���翩�� Ȯ�� "+map.containsKey("id_0125") );
		System.out.println("���� ���翩�� Ȯ�� "+map.containsValue("��浿") );
		System.out.println("map �� ũ�� "+map.size());
		System.out.println("map ��� ����" + map.remove("id_0126"));
		
		
		// Ű ���� ��ü ��������	
		Set<String> set = map.keySet(); // ������ �ǹ̰� �ƴϴ�.
		System.out.println(set);
		
		// Value ���� �������� 
		Collection<String> values = map.values();
		System.out.println(values);
		
	}
}
