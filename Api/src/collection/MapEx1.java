package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// data 추가
		// 키값은 중복이 안된다 .
		map.put("id_0123", "홍길동");
		map.put("id_0124", "장길동");
		map.put("id_0125", "송길동");
		map.put("id_0126", "최길동");
		
		// 가져오기
		System.out.println("키에 해당하는 값 가져오기 "+map.get("id_0123") );
		System.out.println("키에 존재여부 확인 "+map.containsKey("id_0125") );
		System.out.println("값이 존재여부 확인 "+map.containsValue("장길동") );
		System.out.println("map 의 크기 "+map.size());
		System.out.println("map 요소 삭제" + map.remove("id_0126"));
		
		
		// 키 값만 전체 가져오기	
		Set<String> set = map.keySet(); // 변경의 의미가 아니다.
		System.out.println(set);
		
		// Value 값만 가져오기 
		Collection<String> values = map.values();
		System.out.println(values);
		
	}
}
