package day0203_pm;

public class TestAbstractSub extends TestAbstract {

	public TestAbstractSub() {
		System.out.println("�ڽ� ������");
	}// TestAbstractSub
	
	@Override
	public void test() {
		//������ �߻� method : body�� ������ �ڽ�Ŭ������ ��Ȳ�� �°� ����
		System.out.println("Override method");
		//Override�� method�� �ִٸ�, ��üȭ�� �پ�(is a ��üȭ)�ϰ� �ϴ��� �ڽ��� ������ method�� ���� ���� ȣ��ȴ�.
	}// test
	
	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��üȭ�ϸ� �θ� Ŭ������ �߻�Ŭ������� �ϴ��� �θ�Ŭ������ �����ȴ�.
		//TestAbstract ta = new TestAbstractSub();
		TestAbstractSub tas = new TestAbstractSub();
		tas.test(); //Override�� method ȣ��
		
	}

	
}
