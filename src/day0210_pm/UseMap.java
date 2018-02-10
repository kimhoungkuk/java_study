package day0210_pm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMap {
	
	public UseMap() {
		
		Map<String, String> map = new HashMap<String,String>();
		System.out.println(map.size());
		// �� �߰� : ���������� �Էµ��� �ʴ´�.
		map.put("java","��ü���� ���");
		map.put("javascript","��ü��� ���");
		map.put("oracle","��뷮 �����ͺ��̽�");
		System.out.println(map);
		System.out.println(map.size());
		// �� �߰�
		map.put("spring", "DI Core�� �����ӿ�ũ");
		// Ű�� �ٸ��ٸ� �ߺ��� ���
		map.put("C#","��ü���� ���");
		// Ű�� ���ٸ� �����ϴ� Ű�� ���� ����.
		map.put("java","�Ϻ��� ��ü���� ���");
		System.out.println(map);		
		// ��� Ű ���
		Set<String> set = map.keySet();
		// ������ for�� ����ϸ� Set�� ��� ���� ���� ���� �� �ִ�.
		for(String key: set) {
			System.out.println(key);
		}// end for
		// �� ���
		String value = map.get("C#");
		System.out.println(value);
		// �����
		map.remove("C#");
		map.remove("javascript");
		System.out.println(map);
		System.out.println(map.size());
		
	}// UseMap
	
	public static void main(String[] args) {
		new UseMap();
	}// main
	
}// class
