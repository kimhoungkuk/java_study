package day0127_pm;

/**
 * 생성자 Overload - 객체를 생성할때 다양한 값을 가지고 객체를 생성할 수 있다.
 * <br>
 * method Overload - 같은 이름의 method 호출 하지만 다양한 일을 수행할 수 있다.
 * @author kimhk0
 *
 */
public class TestOverload {
	int temp;
	
	public TestOverload() {
		System.out.println("기본생성자(default Constructor)");
	}
	
	public TestOverload(int i) {
		temp = i;
		System.out.println("Overload 생성자");
	}
	
	public TestOverload(String i) {
		temp = Integer.parseInt(i); //문자열을 정수로 변경하는 일
		System.out.println("Overload 생성자");
	}
	
	public void star() {
		System.out.print("*");
	}//star
	
	public void star(int cnt) {
		for(int i=0; i <= cnt; i++)
		{
			System.out.print("*");
		}//end for
	}//star
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload(); //기본생성자 사용
		TestOverload to1 = new TestOverload(27);//Overload된 생성자 사용
		TestOverload to2 = new TestOverload("30");//Overload된 생성자 사용
		System.out.println("기본 생성자 사용 " + to.temp);
		System.out.println("Overload 생성자 사용 " + to1.temp);
		System.out.println("Overload 생성자 사용 " + to2.temp);
		
		//Overload된 method 호출
		// 별 하나 출력
		to.star();
		System.out.println();
		//별 여러개 출력
		to.star(5);
	}//main
	
} //class
