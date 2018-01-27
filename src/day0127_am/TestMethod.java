package day0127_am;

/**
 * @author kimhk0
 *
 */
public class TestMethod {
	public void instanceMethod() {
		System.out.println("instanceMethod called!!");
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod called!!");
	}
	
	///고정일 : 반환형 없고, 매개변수 없는 형
	public void typeA() {
		System.out.println("고정적인 일");
	}
	///가변일 : 반환형 없고, 매개변수 있는 형
	public void typeB(int i) {
		System.out.println("가변 일" + i);
	}	
	///고정값 : 반환형 있고, 매개변수 없는 형
	public int typeC() {
		int i=27;
		return i;
	}
	///가변값 : 반환형 있고, 매개변수 있는 형
	public int typeD(char c) {
		return (int)c;
	}

	public static void main(String[] args) {
		//static 영역에서는 instance영역(non-static field)의 변수,메소드를 직접사용할수 없다.
		//instanceMethod();
		//객체회 후 호출
		TestMethod tm/*객체*/ = new TestMethod();
		tm.instanceMethod();
		//static method는 객체화 없이 직접 사용가능
		TestMethod.staticMethod();
		
		//고정일
		tm.typeA();
		//가변일
		tm.typeB(2018);
		tm.typeB(1);
		tm.typeB(27);
		//고정값 : return 되는 값을 받는 변수가 존재
		int temp = tm.typeC();
		System.out.println(temp + tm.typeC());
		//가변값 : return 되는 값을 받는 변수가 존재
		for(char c='A';c <= 'Z'; c++) {
			temp = tm.typeD(c);
			System.out.println(c+"의 Unicode값 "+ temp + " ");
		}
	} //main
	
}//class
