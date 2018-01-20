package day0113;

/**
 * 강제형변환
 * @author sist00
 */
public class UseCasting {

	public static void main(String[] args) {
		float f=(float)1.13;//형명시로 할당 가능, 강제형변환으로 할당 가능
		int i=(int)f;//값손실 발생
		System.out.println("f ="+f+", i= "+i);  
		
		//float a = 0.003f;
		
		//기본형데이터형과 참조형 데이터형은 서로 casting할 수 없다.
		//String str="10";//참조형
		//int num=(int)str;
		//int num=10;
		//String str=(String)num;
		
		//boolean 은 동일형으로만  casting 된다.
		boolean b=false;
//		int num=(int)b;
		boolean c=(boolean)b;
		System.out.println(b+" / "+c);
	}//main

}//class






