package day0127_pm;

/**
 * this method ����<br>
 * �� Ŭ������ �ٸ� ������ ȣ��� ���
 * @author sist06
 *
 */
public class TestThis {
	int i;
	
	public TestThis() {
		//this(100); // ��ü�� �� �������� �ʴ´�. 
		// new TestThis(100); ���� ������ ��ü �ϳ��� �� ����� �ȴ�.
		System.out.println("�⺻ ������");
	}//TestThis
	
	public TestThis(int i) {
		//this();
		this.i = i;
		System.out.println("Overload ������" + i);
	}//TestThis
	
	public void useThis(int i) {
		this.i = i;
		System.out.println("useThis �� this Ű���� : " + this);
	}//useThis
	
	public static void main(String[] args) {
		//new TestThis(100); // ��ü�� �������� �ʴ� ��üȭ
		// ��ü�� �ν��Ͻ������� ,method�� ȣ���� �ʿ䰡 ���� ��
		TestThis tt = new TestThis(100); // ��ü�� ������ ��üȭ
		TestThis tt1 = new TestThis(500); // ��ü�� ������ ��üȭ
		System.out.println("tt�ּ�(heap) : " + tt);
		System.out.println("tt1�ּ�(heap) : " + tt1);
		//��ü�� �ν��Ͻ� ������, method�� ȣ���� �ʿ䰡 ������
		System.out.println(tt.i);
		
		tt.useThis(5); 
		tt1.useThis(5);	
	}//main
	
}//class
