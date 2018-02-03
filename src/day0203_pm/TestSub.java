package day0203_pm;

/**
 * 상속
 * @author kimhk
 *
 */
public class TestSub extends TestSuper {
	int i;
	
	public TestSub() {
		super(); // 부모 클래스의 생성자
		System.out.println("자식클래스 생성자");
	}
	
	public void childMethod() {
		System.out.println("자식 method");	
		//자식클래스와 부모 클래스의 변수명이 다르다면 this로 모두 접근 가능
		System.out.println("자식 i : " + this.i + " 부모 j : " + this.j);	
		//자식클래스와 부모 클래스의 변수명이 같다면 this로는 자식클래스의 자원만 사용 가능하고, 부모는 super로 접근하여 사용한다.
		super.i = 100;
		this.i = 3;
		System.out.println("자식 i : "+ i + " , 부모 i : "+ super.i);
	}//childMethod
	
	public static void main(String[] args) {
		TestSub ts = new TestSub(); // 자식을 생성하면 부모가 먼저 생성된다.
		ts.childMethod();
	}//main
	
}
