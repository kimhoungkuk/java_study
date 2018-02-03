package day0203_pm;

public class TestInner {
	int i;
	public TestInner() {
		System.out.println("바깥클래스의 생성자");
	}//TestInner

	public void outMethod( ) {
		System.out.println("바깥 클래스의 method");
//		 j=100; //내부클래스의 자원을 외부 클래스에서 직접 사용할 수 없다.
//		 inMethod();
		//instance method 에서는  this로  new 를 하여 내부 클래스를 생성.
//		TestInner.Inner in=this.new Inner();
//		in.j=100; //생성된 객체로 내부 클래스의 자원 사용
//		in.inMethod();
	}//outMethod
	
	//////////////////////////////// 내부클래스 시작////////////////////
	public class Inner{
		int j;
		public Inner() {
			System.out.println("내부 클래스의 생성자");
		}//Inner
		public void inMethod() {
			System.out.println("내부 클래스의 method");
			i=29; //내부 클래스에서는 외부클래스의 자원을 사용할 수 있다.
			outMethod();
		}//inMethod
	}//Inner
	//////////////////////////////// 내부클래스 끝////////////////////
	public static void main(String[] args) {
		//1. 외부 클래스 객체화 : 클래스명 객체명=new 생성자();
		TestInner ti=new TestInner();
		ti.outMethod();
		//2. 내부 클래스 객체화 :
		//외부클래스명.내부클래스명 객체명=외부클래스객체명.new 내부클래스의 생성자();
		TestInner.Inner in=ti.new Inner();
		in.j=30;
		in.inMethod();
//		Inner in=ti.new Inner();
	}//main
}//class






