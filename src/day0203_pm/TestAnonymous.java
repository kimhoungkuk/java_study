package day0203_pm;

/**
 *	익명 클래스
 * @author owner
 */
public class TestAnonymous {
	public void test(TestInter ti) {
//		if( ti instanceof InterImpl ) {
//			System.out.println("InterImpl로 생성된 객체");
//		}else {
//			System.out.println("InterImpl이 아닌 객체");
//		}//end else
		//입력된 객체가 InterImpl1일때에는 msg() 호출
		if( ti instanceof InterImpl1 ) {
			InterImpl1 ii1=(InterImpl1)ti;
			System.out.println(ii1.msg());
		}//end if
		ti.test();
		ti.test1();
	}//test

	public static void main(String[] args) {
		//1.클래스 객체화
		TestAnonymous ta=new TestAnonymous();
		//2. 매개변수와 is a 관계를 가진 클래스를 작성한후 객체 생성
		InterImpl ii=new InterImpl();
		//3. method 호출할 때 is a관계의 객체를 arguments로 입력
		ta.test(ii);
		System.out.println("--------------------------------------------------");
		//anonymous inner class로 처리 : is a 관계의 클래스를 작성할 필요없음
		ta.test(new TestInter() {
			@Override
			public void test1() {
				System.out.println("anonymous test1");
			}
			@Override
			public void test() {
				System.out.println("anonymous test");
			}
		});
		System.out.println("------------------------------------------------");
		InterImpl1 ii1=new InterImpl1();
		ta.test(ii1);
	}//main

}//class



