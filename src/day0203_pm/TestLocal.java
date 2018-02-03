package day0203_pm;

/**
 *	지역클래스의 사용(클래스를 지역변수처럼 사용할 때)
 * 이벤트를 특정 method 안에서만 처리해야 할 때
 * byte code : 외부클래스명$1클래스명.class
 * @author owner
 */
public class TestLocal {
	int i;
	public TestLocal() {
		System.out.println("외부 클래스의 생성자");
	}//TestLocal
	
	public void methodA(int param_i, final int param_j) {
		int loc_i=10;
		final int loc_j=20;
		///////////////// 지역 클래스 시작//////////////////
		class LocalInner{
			int in_i;
			public LocalInner() {
				System.out.println("지역클래스의 생성자");
			}//LocalInner
			public void locMethod() {
				i=2017; //지역클래스에서 외부 클래스의 인스턴스 변수는 
				//사용할 수 있다.
				System.out.println("외부 인스턴스 변수 "+i);
				//final 이 붙지 않은 변수 사용 (JDK1.8+ 에서는 출력으로만
				//사용가능하도록 변경 )
//				loc_i=10;// final이 붙어 있지 않더라도 값 할당은 할 수 없다.
				System.out.println("final이 없는 변수 사용 "+
						loc_i+" / "+ param_i);
				
				System.out.println("final이 있는 변수 사용 "+
						loc_j+" / "+param_j);
			}//locMethod			
		}//class
		///////////////// 지역 클래스 끝//////////////////
		LocalInner li=new LocalInner();
		li.in_i=100; //지역클래스의 변수 사용
		li.locMethod();// 지역클래스의 method
		
	}//methodA

	public static void main(String[] args) {
		TestLocal tl=new TestLocal();
		tl.methodA(11, 10);
	}//main

}//class
