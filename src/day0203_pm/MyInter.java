package day0203_pm;

/**
 * �����ϴ� Ŭ�������� �ݵ�� �ؾ��ϴ� ���� ����� ����.
 * @author kimhk
 *
 */
public interface MyInter {
	//int i; ������ ������ ����.
	public static final int Test = 10; //constant
	
	//public void test() {}; // �Ϲ� method ���� �� ����.
	
	public void test(); // abstract ����
	public abstract void temp(); // abstract ���
	
	public default void foo() { // default method : ���� ������ �� �ִ�.
		System.out.println("foo called!!");
	} // foo
	
} //interface
