package day0120_pm;

/**
 * Constant : ��𿡼��� ���Ǹ� �� ������� �ʴ� ����
 *           - ���α׷��� ���ذ��� ����,����� ����
 * @author kimhk0
 */
public class TestConstant {

	public static final int MIN = 0;
	public static final int MAX = 100;
	
	public static void main(String[] args) {
		//public static final int MAX = 100; ����� method ������ ������ �� ����.
		System.out.println("����� : " + MIN);
		System.out.println("Ŭ������ ����� : " + TestConstant.MIN);	
				//������� ���� �̿ܿ��� �� �Ҵ��� �� �� ����. MAX = 99; - ERROR
		
		// Wrapper Class : �⺻�� ���������� ��ü�� ����� ����ϱ� ���� �ۼ��� Ŭ������.
		// �⺻�� : �� �����ɸ� ����, ��ü : �� ������, ������ �ϵ�
		System.out.println("Int Wrapper Classs ��� : " + Integer.MIN_VALUE + " , " + Integer.MAX_VALUE);
		System.out.println("Long Wrapper Classs ��� : " + Long.MIN_VALUE + " , " + Long.MAX_VALUE);
	} //main
	
}//class
