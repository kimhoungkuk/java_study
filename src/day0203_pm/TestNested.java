package day0203_pm;

/**
 *	중첩클래스(Nested Class) :
 *	내부클래스를 static 변수처럼 사용할 때 
 *	(Event를 객체화 없이 빠르게 처리할때, 공통의 이벤트를 처리해야할 때)
 * @author owner
 */
public class TestNested {
	int i;
	static int j ;
	
	public TestNested() {
		System.out.println("외부 클래스의 생성자");
	}//TestNested
	
	public void outMethodA() {
		System.out.println("외부 클래스의 method");
	}//outMethodA
	
	public static void outMethodB() {
		System.out.println("외부 클래스의 static method");
	}//outMethodB

	///////////////////////////////내부클래스 시작///////////////////////////
	static class NestedInner{
		static int in_i;
		public NestedInner() { //생성자를 사용하면 inner class가 되어버린다.
			System.out.println("내부 클래스의 생성자");
		}
		public static void inMethod() {
			System.out.println("내부클래스의 method");
//			i=10;//외부클래스의 instance영역은 사용할 수 없다.
			j=100;// 외부클래스의 static 영역은 직접 사용할 수 있다.
//			outMethodA();
			TestNested.outMethodB();// 외부클래스의 static 영역은 직접 사용할 수 있다.
		}//inMethod
		
	}//class
	///////////////////////////////내부클래스 끝///////////////////////////
	public static void main(String[] args) {
		//중첩클래스의 자원은 객체화를 하지 않고 사용한다.
		//(static 변수처럼 사용해야한다.)
		NestedInner.inMethod();
	}//main

}//class
