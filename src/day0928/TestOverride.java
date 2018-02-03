package day0928;

import java.util.ArrayList;
import java.util.List;

/**
 *	Override연습 : <br>
 *	규칙 : 접근지정자는 광의의 접근 지정자로 변경 가능 하고,
 *			반환형, method 명, 매개변수는 같아야한다.<br>
 * annotation 연습 : <br>
 * 		JDK1.5에서 부터 제공되는 기능<br>
 * 		@Annotation명 : 컴파일러에게 명령을 내릴 수 있다.
 * @author owner
 */
public class TestOverride {

	//객체가 출력될때 주소가 아니라 다른 값을 출력하고 싶다면
	//toString() 을 Override 해야한다.
	@Override
	public String toString() {  //자바는 대소문자를 구분하므로 method명이
		// 다르다면 compiler는 Override 로 생각하지 않고 새로운 method를
		//정의했다고 판단한다.
		return "안녕하세요?";
	}
	/**
	 *  사용은 마음대로 책임은 안짐...
	 */
	@Deprecated
	public void test() {
		System.out.println(" test !!!!");
	}
	// 경고 없애기 
	@SuppressWarnings({ "rawtypes", "unused" })
	public void foo() {
//		@SuppressWarnings("unused") // 변수 위 
		int i;
		List list=new ArrayList();
		
	}
	
	public static void main(String[] args) {
		TestOverride to=new TestOverride();
		System.out.println( to.toString() );
		System.out.println( to );
		
		to.test();
	
		String str=new String("안녕하세요?");
		System.out.println( str.toString() );
		System.out.println( str );
		
	}//main
	

}//class
