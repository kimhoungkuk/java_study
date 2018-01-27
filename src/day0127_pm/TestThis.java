package day0127_pm;

/**
 * this method 형식<br>
 * 내 클래스의 다른 생성자 호출시 사용
 * @author sist06
 *
 */
public class TestThis {
	int i;
	
	public TestThis() {
		//this(100); // 객체를 더 생성하지 않는다. 
		// new TestThis(100); 쓸수 있지만 객체 하나를 더 만들게 된다.
		System.out.println("기본 생성자");
	}//TestThis
	
	public TestThis(int i) {
		//this();
		this.i = i;
		System.out.println("Overload 생성자" + i);
	}//TestThis
	
	public void useThis(int i) {
		this.i = i;
		System.out.println("useThis 내 this 키워드 : " + this);
	}//useThis
	
	public static void main(String[] args) {
		//new TestThis(100); // 객체를 저장하지 않는 객체화
		// 객체로 인스턴스변수나 ,method를 호출할 필요가 없을 때
		TestThis tt = new TestThis(100); // 객체를 저장한 객체화
		TestThis tt1 = new TestThis(500); // 객체를 저장한 객체화
		System.out.println("tt주소(heap) : " + tt);
		System.out.println("tt1주소(heap) : " + tt1);
		//객체로 인스턴스 변수나, method를 호출할 필요가 있을때
		System.out.println(tt.i);
		
		tt.useThis(5); 
		tt1.useThis(5);	
	}//main
	
}//class
