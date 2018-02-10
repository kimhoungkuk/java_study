package day0210_am;

import java.util.Calendar; // 특정 패키지내에 특정 클래스만 사용할 때.
import java.util.Date;
import kr.co.sist.service.Test;
//import java.util.*; // util 패키지의 모든 byte code (클래스,인터페이스)를 참조  - 속도가 느려저서 권장하지 않음
//JDK 1.5에서 부터 지원하는 static import
import static java.lang.Integer.MAX_VALUE;
//method를 static import 받을 때에는 method 기호()를 기술하지 않는다.
import static java.lang.Integer.parseInt;


/**
 * @author kimhk0
 *
 */
public class UseImport {
	
	public static void main(String[] args) {
		Date date = new Date();
		Calendar ca = null;
		
		//개발된 project을 배포하기 위해 x.jar로 압축하여 배포되면
		//eclipse에서는 build path를 설정하여 사용하고
		//service할 때는 classpath를 설정하여 사용한다.
		Test t = new Test();
		System.out.println(t.toDate());
		System.out.println(t.nowYear());

		//다른 클래스의 Constant 를 사용 : 클래스명.상수명
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);	
		
		System.out.println(MAX_VALUE);
		
		String today = "10";
		//문자열 => 정수 Integer.parseInt(문자열);
		int intToday = parseInt(today);
		System.out.println(intToday);
		
	} // main

}// class
