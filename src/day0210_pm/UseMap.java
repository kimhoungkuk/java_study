package day0210_pm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMap {
	
	public UseMap() {
		
		Map<String, String> map = new HashMap<String,String>();
		System.out.println(map.size());
		// 값 추가 : 순차적으로 입력되지 않는다.
		map.put("java","객체지향 언어");
		map.put("javascript","객체기반 언어");
		map.put("oracle","대용량 데이터베이스");
		System.out.println(map);
		System.out.println(map.size());
		// 값 추가
		map.put("spring", "DI Core인 프레임워크");
		// 키가 다르다면 중복값 허용
		map.put("C#","객체지향 언어");
		// 키가 같다면 존재하는 키에 덮어 쓴다.
		map.put("java","완벽한 객체지향 언어");
		System.out.println(map);		
		// 모든 키 얻기
		Set<String> set = map.keySet();
		// 개선된 for를 사용하면 Set의 모든 방의 값을 얻을 수 있다.
		for(String key: set) {
			System.out.println(key);
		}// end for
		// 값 얻기
		String value = map.get("C#");
		System.out.println(value);
		// 지우기
		map.remove("C#");
		map.remove("javascript");
		System.out.println(map);
		System.out.println(map.size());
		
	}// UseMap
	
	public static void main(String[] args) {
		new UseMap();
	}// main
	
}// class
