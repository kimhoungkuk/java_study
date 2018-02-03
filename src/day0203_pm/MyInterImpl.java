package day0203_pm;

/**
 * interface�� ������ Ŭ���� : interface�� ��� �߻�޼ҵ带 ����(Override) �ؾ��Ѵ�.
 * @author kimhk
 *
 */
public class MyInterImpl implements MyInter {

	@Override
	public void test() {
		System.out.println("test called!!");
	}

	@Override
	public void temp() {
		System.out.println("temp called!!");
	}

	public void impl() {
		System.out.println("�ڽ��� method!!!!!!!!!!!");
	}// impl
	
	public static void main(String[] args) {
		// interface �� ���� ��üȭ �� �� ����.
		// MyInter mi = new MyInter(); error
		// ����Ŭ������ ��üȭ�Ǹ�  �� �ּҴ� ������ �� �ִ�.(��ü�� �޴´�.)
		MyInter mi = new MyInterImpl(); // is a ������ ��üȭ
		//is a ������ ��üȭ�϶� ��ü�� ȣ�� ���� �Ѱ��� �θ��� method , ����
		mi.foo(); //default method�� body�� �����ϹǷ� ȣ�� ����
		mi.test(); //override �� method�� ȣ���ϸ� �ڽ��� ������ method�� �ֿ켱������ ȣ��ȴ�.
		mi.temp(); //override �� method�� ȣ���ϸ� �ڽ��� ������ method�� �ֿ켱������ ȣ��ȴ�.
		//mi.impl(); // mi ��ü�� ���������� MyInter�̹Ƿ� �ڽ�Ŭ������ ���Ͽ� ��üȭ �ߴٰ� �ϴ��� ȣ���� �Ұ����ϴ�.
		
	} // main
	
} // class
