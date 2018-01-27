package day0127_pm;

/**
 * ������ Overload - ��ü�� �����Ҷ� �پ��� ���� ������ ��ü�� ������ �� �ִ�.
 * <br>
 * method Overload - ���� �̸��� method ȣ�� ������ �پ��� ���� ������ �� �ִ�.
 * @author kimhk0
 *
 */
public class TestOverload {
	int temp;
	
	public TestOverload() {
		System.out.println("�⺻������(default Constructor)");
	}
	
	public TestOverload(int i) {
		temp = i;
		System.out.println("Overload ������");
	}
	
	public TestOverload(String i) {
		temp = Integer.parseInt(i); //���ڿ��� ������ �����ϴ� ��
		System.out.println("Overload ������");
	}
	
	public void star() {
		System.out.print("*");
	}//star
	
	public void star(int cnt) {
		for(int i=0; i <= cnt; i++)
		{
			System.out.print("*");
		}//end for
	}//star
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload(); //�⺻������ ���
		TestOverload to1 = new TestOverload(27);//Overload�� ������ ���
		TestOverload to2 = new TestOverload("30");//Overload�� ������ ���
		System.out.println("�⺻ ������ ��� " + to.temp);
		System.out.println("Overload ������ ��� " + to1.temp);
		System.out.println("Overload ������ ��� " + to2.temp);
		
		//Overload�� method ȣ��
		// �� �ϳ� ���
		to.star();
		System.out.println();
		//�� ������ ���
		to.star(5);
	}//main
	
} //class
