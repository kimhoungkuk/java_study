package day0203_am;

/**
 * 클래스의 이름이 java.lang package에서 제공하는 이름과 같다면
 * lang pcakage의 클래스를 사용해야 하는 상황에 내가 만든 클래스를 사용하게 되므로 문제가 발생하게 된다.
 * 해결 : 클래스를 사용할 때 패키지명.클래스명으로 사용하든 클래스를 작성할 때 이름이 겹치지 않도록 설정
 * @author kimhk0
 *
 */
public class UseString {
	
	public static void main(String[] args) {
		// 기본형 (new 사용하지 않음) : String str = "ABC";
		String str = "ABC";
		// 참조형 형식 ( new 를 사용한다 ) : String str = new String("ABC");
		String str1 = new String("ABC");
		// 비교
		// 기본형 형식 : == , equals 모두 사용 가능
		System.out.println("기본형  == 비교 : " + ( str == "ABC" ? "같다" : "다르다"));
		System.out.println("기본형  equals 비교 : " + ( str.equals("ABC") ? "같다" : "다르다"));
		// 참조형 형식 : equals 만 사용
		System.out.println("참조형  == 비교 : " + ( str1 == "ABC" ? "같다" : "다르다"));
		System.out.println("참조형  equals 비교 : " + ( str1.equals("ABC") ? "같다" : "다르다"));
		
		System.out.println("테스트 입니다.");
		
	} // main
	
} // class
