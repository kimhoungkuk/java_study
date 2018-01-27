package day0127_am;

/**
 * class field에 선언되는 변수의 사용
 * instance(member) 변수 : 객체화하여 사용, 객체가 GC(System.gc()) 에 의해 메모리에서 수거되는 때 사라진다.
 *                                  '객체명.변수명' 으로 사용 (객체마다 각각의 변수를 사용)
 * static(class) 변수 : 클래스가 실행되면(java 클래스명) 메모리(method 영역)에 로드되고 JVM(java.exe)이 종료되면 메모리에서 사라진다.
 *                          공용변수(모든 객체가 하나의 변수를 사용)
 * @author kimhk0
 *
 */
public class FieldVariable {
	
	int i; //객체화해야 메모리에 설정
	static int j;
	
	public static void main(String[] args) {
		//static 영역은 클래스가 실행될때 가장 먼저 실행된다.
		//i = 27; // static 영역에서는 instance 변소는 직접 사용할 수 없다.
		j = 27; // static 변수는 직접 사용가능 
		
		//i사용 : 1. 객체화 , 2.객체명.변수명 으로 사용
		//1.객체화 : 클래스명 객체명 = new 생성자();
		
		FieldVariable fv = new FieldVariable();
		//2.변수 사용
		fv.i = 1;
		System.out.println("static 변수" + FieldVariable.j + ",instance 변수 " + fv.i );
		// static 변수(공용-특정객체에 속하지 않은) 사용가능하지만 잘못 하용하는 문법 : 객체명.변수명
		// fv.j = 20; //경고
		// System.out.println(fv.j); //경고
		
		fv.finalize();
		
	} // main
	
	public void finalize() {
		//객체(fv)가 GC에 의해 소멸되면 호출되는 메소드 
		// Servlet / JSP (destroy / _jspDestroy )
	}
	
} // class
