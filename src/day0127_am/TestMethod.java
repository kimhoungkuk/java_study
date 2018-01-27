package day0127_am;

/**
 * @author kimhk0
 *
 */
public class TestMethod {
	public void instanceMethod() {
		System.out.println("instanceMethod called!!");
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod called!!");
	}
	
	///������ : ��ȯ�� ����, �Ű����� ���� ��
	public void typeA() {
		System.out.println("�������� ��");
	}
	///������ : ��ȯ�� ����, �Ű����� �ִ� ��
	public void typeB(int i) {
		System.out.println("���� ��" + i);
	}	
	///������ : ��ȯ�� �ְ�, �Ű����� ���� ��
	public int typeC() {
		int i=27;
		return i;
	}
	///������ : ��ȯ�� �ְ�, �Ű����� �ִ� ��
	public int typeD(char c) {
		return (int)c;
	}

	public static void main(String[] args) {
		//static ���������� instance����(non-static field)�� ����,�޼ҵ带 ��������Ҽ� ����.
		//instanceMethod();
		//��üȸ �� ȣ��
		TestMethod tm/*��ü*/ = new TestMethod();
		tm.instanceMethod();
		//static method�� ��üȭ ���� ���� ��밡��
		TestMethod.staticMethod();
		
		//������
		tm.typeA();
		//������
		tm.typeB(2018);
		tm.typeB(1);
		tm.typeB(27);
		//������ : return �Ǵ� ���� �޴� ������ ����
		int temp = tm.typeC();
		System.out.println(temp + tm.typeC());
		//������ : return �Ǵ� ���� �޴� ������ ����
		for(char c='A';c <= 'Z'; c++) {
			temp = tm.typeD(c);
			System.out.println(c+"�� Unicode�� "+ temp + " ");
		}
	} //main
	
}//class
