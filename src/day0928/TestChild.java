package day0928;

public class TestChild extends TestParent{
	
	int ii;
	int i; //부모와 이름이 같다.
	public TestChild() {
		System.out.println(" 자식의 생성자");
	}//TestChild
	
	public void cMethod() {
		super.i=2017; //부모클래스의 변수 사용.
		System.out.println("자식의 method 부모 i="+ super.i
				+", 자식 i ="+ this.i );
	}//cMethod

	@Override
	public void pMethod() {
		System.out.println(" Overriding 한 메소드");
		super.pMethod(); //부모클래스의 method 호출 사용.
	}//pMethod

	public static void main(String[] args) {
		//자식클래스로 객체화 
		//사용 가능 : 부모 (j, pMethod), 자식의 모든 자원
		// 부모의  i는 자식에 같은 변수가 존재하므로 이름으로 접근하는 자바에서는 사용할 수 없다.
		TestChild tc=new TestChild();
		tc.i=100;//자식
		tc.ii=1000;//자식
		tc.j=10000;//부모
		tc.pMethod();//부모, Override하면 자식의 method가 호출
		tc.cMethod();//자식
		 System.out.println("--------------------------------------------");
		 // is a 관계의 객체화 (상속관계의 객체화)
		 // 부모클래스명 객체명=new 자식생성자();
		 //사용가능 : 부모(i,j,pMethod)
		 
		  TestParent tp=new TestChild();
		  tp.i=200; //부모
		  tp.j=2000;//부모
		  tp.pMethod();//부모, Override를 하면 자식의  method가 호출 
		
		  //자식클래스가 데이터형으로 사용되면 부모클래스로는 객체를
		  //생성할 수 없다.
//		  TestChild tc1=new TestParent();
		

	}//main

}//class
