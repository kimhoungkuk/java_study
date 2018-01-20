package day0113;

/**
 * 기본형데이터형사용.
 * 지역변수 선언.
 * 형명시.
 * 자동형변환.
 * @author sist00
 */
public class DataType {
	public static void main(String[] args) {
		/*
		int i ;//1. 지역변수선언
		i=7;//2. 값할당 
		System.out.println( i );//3. 변수의 사용
		*/
		///////////// 정수형 //////////////////////////////
		byte a=10;//literal이 1byte로 자동 변환되어 할당
		short b=10;//literal이 2byte로 자동 변환되어 할당
		int c=2_147_483_647; //JDK1.7부터는 정수를 사용할 때 _를 구분자로 사용
		long d=2147483647;
		long e=2147483648L;//형명시 : literal을 4byte에서 8byte 로 변경
		System.out.println("byte = "+a+", short = "+b+", int = "+ c+
					"long = "+d+", "+e);
		///////////// 문자형 //////////////////////////////
		char f='A'; //unicode값 할당 
		char g='0';
		char h='가';
		System.out.println("char = "+ f+", "+g+", "+h);
		
		///////////// 실수형 //////////////////////////////
		float i=1.13F;//형명시 : literal을 8byte에서 4byte로 변경
		double j=1.13D;//형명시 필요없음.
		System.out.println("float = "+ i+", double"+j);
		///////////// 불린형 //////////////////////////////
		boolean k=true;
		boolean l=false;
		System.out.println("booelan = "+ k+", "+l);
	}//main

}//class




