package day0203_pm;

public class TestInner {
	int i;
	public TestInner() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//TestInner

	public void outMethod( ) {
		System.out.println("�ٱ� Ŭ������ method");
//		 j=100; //����Ŭ������ �ڿ��� �ܺ� Ŭ�������� ���� ����� �� ����.
//		 inMethod();
		//instance method ������  this��  new �� �Ͽ� ���� Ŭ������ ����.
//		TestInner.Inner in=this.new Inner();
//		in.j=100; //������ ��ü�� ���� Ŭ������ �ڿ� ���
//		in.inMethod();
	}//outMethod
	
	//////////////////////////////// ����Ŭ���� ����////////////////////
	public class Inner{
		int j;
		public Inner() {
			System.out.println("���� Ŭ������ ������");
		}//Inner
		public void inMethod() {
			System.out.println("���� Ŭ������ method");
			i=29; //���� Ŭ���������� �ܺ�Ŭ������ �ڿ��� ����� �� �ִ�.
			outMethod();
		}//inMethod
	}//Inner
	//////////////////////////////// ����Ŭ���� ��////////////////////
	public static void main(String[] args) {
		//1. �ܺ� Ŭ���� ��üȭ : Ŭ������ ��ü��=new ������();
		TestInner ti=new TestInner();
		ti.outMethod();
		//2. ���� Ŭ���� ��üȭ :
		//�ܺ�Ŭ������.����Ŭ������ ��ü��=�ܺ�Ŭ������ü��.new ����Ŭ������ ������();
		TestInner.Inner in=ti.new Inner();
		in.j=30;
		in.inMethod();
//		Inner in=ti.new Inner();
	}//main
}//class






