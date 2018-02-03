package day0203_pm;

public abstract class TestAbstract {
	
	int i;
	public TestAbstract() {
		System.out.println("추상클래스의 생성자");
	}
	
	//추상method : 구현의 강제성, body가 없어 일을 못하는 method
	public abstract void test();
	
/*	public static void main(String[] args) {
		//추상클래스는 직접 객체화 될 수 없다.
		//TestAbstract ta = new TestAbstract();
	}*/
	
}
