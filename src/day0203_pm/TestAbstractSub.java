package day0203_pm;

public class TestAbstractSub extends TestAbstract {

	public TestAbstractSub() {
		System.out.println("자식 생성자");
	}// TestAbstractSub
	
	@Override
	public void test() {
		//구현한 추상 method : body의 내용은 자식클래스의 상황에 맞게 설정
		System.out.println("Override method");
		//Override한 method가 있다면, 객체화를 다양(is a 객체화)하게 하더라도 자식이 구현한 method가 가장 먼저 호출된다.
	}// test
	
	public static void main(String[] args) {
		//자식 클래스를 객체화하면 부모 클래스가 추상클래스라고 하더라도 부모클래스가 생성된다.
		//TestAbstract ta = new TestAbstractSub();
		TestAbstractSub tas = new TestAbstractSub();
		tas.test(); //Override한 method 호출
		
	}

	
}
