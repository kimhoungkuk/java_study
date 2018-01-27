package day0127_pm;

/**
 * 마카펜 클래스를 객체로 만들어 사용하는 클래스
 * @author kimhk0
 *
 */
public class UseMaker {
	
	/**
	 * Java Application을 만들기 위해 정의하는 method(단독실행) <br>
	 * VM Arguments - java.exe에 설정값 ,<br>
	 *                        실행되는 JVM의 메모리 크기 변경<br>
	 *                        java -Xms512 -Xmx1024<br>
	 * Program Arguments - 실행되는 Java class에 입력하는 값<br>
	 * java UseMaker 안녕 하세요? 1월27
	 * java UseMaker 값 값 값 .......
	 * @param args Program Arguments - 실행시 입력하는 값
	 */
	public static void main(String[] args) {
		// 생성 : instance 변수가 초기화 : 기본형 정수형 = 0,
		// 실수형 : 0.0 , 불린 : false, 문자형 : \u0000,
		// 참조형 : class, String, Array : null 
		Marker black /*객체:참조형데이터형*/ = new Marker();
		System.out.println("heap의 주소 : "+black);
		System.out.println(black.getCap() + " " + black.getBody() + " " + black.getColor());
		
		// setter method 로 생성된 객체에 값 설정
		black.setCap(1);
		black.setBody(1);
		black.setColor("검은");
		
		//getter method 로 생성된 객체에 설정된 값 얻기
		System.out.println(black.getCap() + " " + black.getBody() + " " + black.getColor());		
		
		//동사적 특징 사용 (동작)
		System.out.println(black.write("안녕하세요"));
		
	} // main

} // class
