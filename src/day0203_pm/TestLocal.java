package day0203_pm;

/**
 *	����Ŭ������ ���(Ŭ������ ��������ó�� ����� ��)
 * �̺�Ʈ�� Ư�� method �ȿ����� ó���ؾ� �� ��
 * byte code : �ܺ�Ŭ������$1Ŭ������.class
 * @author owner
 */
public class TestLocal {
	int i;
	public TestLocal() {
		System.out.println("�ܺ� Ŭ������ ������");
	}//TestLocal
	
	public void methodA(int param_i, final int param_j) {
		int loc_i=10;
		final int loc_j=20;
		///////////////// ���� Ŭ���� ����//////////////////
		class LocalInner{
			int in_i;
			public LocalInner() {
				System.out.println("����Ŭ������ ������");
			}//LocalInner
			public void locMethod() {
				i=2017; //����Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� ������ 
				//����� �� �ִ�.
				System.out.println("�ܺ� �ν��Ͻ� ���� "+i);
				//final �� ���� ���� ���� ��� (JDK1.8+ ������ ������θ�
				//��밡���ϵ��� ���� )
//				loc_i=10;// final�� �پ� ���� �ʴ��� �� �Ҵ��� �� �� ����.
				System.out.println("final�� ���� ���� ��� "+
						loc_i+" / "+ param_i);
				
				System.out.println("final�� �ִ� ���� ��� "+
						loc_j+" / "+param_j);
			}//locMethod			
		}//class
		///////////////// ���� Ŭ���� ��//////////////////
		LocalInner li=new LocalInner();
		li.in_i=100; //����Ŭ������ ���� ���
		li.locMethod();// ����Ŭ������ method
		
	}//methodA

	public static void main(String[] args) {
		TestLocal tl=new TestLocal();
		tl.methodA(11, 10);
	}//main

}//class
