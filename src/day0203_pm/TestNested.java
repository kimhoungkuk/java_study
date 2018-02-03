package day0203_pm;

/**
 *	��øŬ����(Nested Class) :
 *	����Ŭ������ static ����ó�� ����� �� 
 *	(Event�� ��üȭ ���� ������ ó���Ҷ�, ������ �̺�Ʈ�� ó���ؾ��� ��)
 * @author owner
 */
public class TestNested {
	int i;
	static int j ;
	
	public TestNested() {
		System.out.println("�ܺ� Ŭ������ ������");
	}//TestNested
	
	public void outMethodA() {
		System.out.println("�ܺ� Ŭ������ method");
	}//outMethodA
	
	public static void outMethodB() {
		System.out.println("�ܺ� Ŭ������ static method");
	}//outMethodB

	///////////////////////////////����Ŭ���� ����///////////////////////////
	static class NestedInner{
		static int in_i;
		public NestedInner() { //�����ڸ� ����ϸ� inner class�� �Ǿ������.
			System.out.println("���� Ŭ������ ������");
		}
		public static void inMethod() {
			System.out.println("����Ŭ������ method");
//			i=10;//�ܺ�Ŭ������ instance������ ����� �� ����.
			j=100;// �ܺ�Ŭ������ static ������ ���� ����� �� �ִ�.
//			outMethodA();
			TestNested.outMethodB();// �ܺ�Ŭ������ static ������ ���� ����� �� �ִ�.
		}//inMethod
		
	}//class
	///////////////////////////////����Ŭ���� ��///////////////////////////
	public static void main(String[] args) {
		//��øŬ������ �ڿ��� ��üȭ�� ���� �ʰ� ����Ѵ�.
		//(static ����ó�� ����ؾ��Ѵ�.)
		NestedInner.inMethod();
	}//main

}//class
