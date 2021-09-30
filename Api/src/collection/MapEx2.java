package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// data 추가
		// 키값은 중복이 안된다 .
		map.put("id_0123", "홍길동");
		map.put("id_0124", "장길동");
		map.put("id_0125", "송길동");
		map.put("id_0126", "최길동");
		
		// 가져오기
		Set<String> keys = map.keySet();
		
		// List, Set, Map 에 담겨진 데이터들을 표준화된 방법으로 가져올 수 있도록 제공해주는 인터페이스 
		// Iterator
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String userId = iter.next();
			String value = map.get(userId);
			System.out.println(userId+" : "+value);
		}
		
		//Map.Entry 객체 사용
		Set<Entry<String, String>>  entrySet = map.entrySet();
		Iterator<java.util.Map.Entry<String, String>> iter2 = entrySet.iterator();
		
		while(iter2.hasNext()) {
			Entry<String, String> entry = iter2.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
	}
	
}
