package day0203_pm;

/**
 * 구현하는 클래스들이 반드시 해야하는 일의 목록을 정의.
 * @author kimhk
 *
 */
public interface MyInter {
	//int i; 변수를 가질수 없다.
	public static final int Test = 10; //constant
	
	//public void test() {}; // 일반 method 가질 수 없다.
	
	public void test(); // abstract 생략
	public abstract void temp(); // abstract 사용
	
	public default void foo() { // default method : 일을 구현할 수 있다.
		System.out.println("foo called!!");
	} // foo
	
} //interface
