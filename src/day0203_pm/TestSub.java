package day0203_pm;

/**
 * ���
 * @author kimhk
 *
 */
public class TestSub extends TestSuper {
	int i;
	
	public TestSub() {
		super(); // �θ� Ŭ������ ������
		System.out.println("�ڽ�Ŭ���� ������");
	}
	
	public void childMethod() {
		System.out.println("�ڽ� method");	
		//�ڽ�Ŭ������ �θ� Ŭ������ �������� �ٸ��ٸ� this�� ��� ���� ����
		System.out.println("�ڽ� i : " + this.i + " �θ� j : " + this.j);	
		//�ڽ�Ŭ������ �θ� Ŭ������ �������� ���ٸ� this�δ� �ڽ�Ŭ������ �ڿ��� ��� �����ϰ�, �θ�� super�� �����Ͽ� ����Ѵ�.
		super.i = 100;
		this.i = 3;
		System.out.println("�ڽ� i : "+ i + " , �θ� i : "+ super.i);
	}//childMethod
	
	public static void main(String[] args) {
		TestSub ts = new TestSub(); // �ڽ��� �����ϸ� �θ� ���� �����ȴ�.
		ts.childMethod();
	}//main
	
}
