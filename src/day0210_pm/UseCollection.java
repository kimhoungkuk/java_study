package day0210_pm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UseCollection {
	
	public UseCollection() {
		
		//List : 순차입력, 중복 값 입력가능, 검색 기능
		List<String> list = new ArrayList<String>();
		
		//Set: 순차 입력 X, 중복 값 입력불가능, 검색 기능이 없다.
		//검색가능할려면 Iterator 사용
		Set<String> set = new HashSet<String>();
		
		//값 추가
		list.add("오늘은");// 0
		list.add("토요일");// 1
		list.add("입니다.");// 2
		list.add("^o^");// 3
		list.add("!!!");// 4
		
		//객체를 출력하면 Object class의 toString() method 가 호출 되어 객체의 주소가 나오거나 Override(Overring) 했다면 주소가 아닌 값이 반환된다.
		System.out.println(list); 
		
		set.add("오늘은");// 0
		set.add("토요일");// 1
		set.add("입니다.");// 2
		set.add("^o^");// 3
		set.add("!!!");// 4
		
		System.out.println(set); 		
		
		System.out.println("========== 중복 체크 =========="); 		
		
		list.add("토요일");
		set.add("토요일");
		
		System.out.println("list 중복제거 X : " + list); 
		System.out.println("set 중복제거 O : " + set); 		
				
		System.out.println("list 크기 : " + list.size()); 
		System.out.println("set 크기 : " + set.size()); 		

		System.out.println("========== 값 삭제 =========="); 		
		
		list.remove("토요일"); //중복값이 있을 때에는 왼쪽에서 오른쪽으로 진행하면서 처음 일치하는 값만 삭제
		set.remove("토요일");
		
		System.out.println(list); 
		System.out.println(set); 		
				
		System.out.println("삭제 후 list 크기 : " + list.size()); 
		System.out.println("삭제 후 set 크기 : " + set.size()); 		
		
		System.out.println("========== List 값 출력 =========="); 		
		
		//System.out.println(list.get(0)); 
		//System.out.println(set.get(0)); 값 조회 기능없음
		for(int i=0;i < list.size();i++) {
			System.out.println(list.get(i));
		}// end for
		
		System.out.println("========== Set 값 출력 =========="); 		
		
		//Iterator를 사용하여 값 얻기, hasNext() - 요소가 있는지 판단, next() 현재 요소를 가지고 온 후 포인터를 다음 요소로 이동
		Iterator<String> ita = set.iterator(); //Iterator에 제어권 이양 
		while(ita.hasNext()) {//요소가 존재하는지 판단
			System.out.println(ita.next()); //값을 얻고 다음 방으로 이동
		}// end while
		
	}//UseCollection
	
	public static void main(String[] args) {
		new UseCollection();
	}// main
	
}// class
