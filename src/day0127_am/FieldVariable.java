package day0127_am;

/**
 * class field�� ����Ǵ� ������ ���
 * instance(member) ���� : ��üȭ�Ͽ� ���, ��ü�� GC(System.gc()) �� ���� �޸𸮿��� ���ŵǴ� �� �������.
 *                                  '��ü��.������' ���� ��� (��ü���� ������ ������ ���)
 * static(class) ���� : Ŭ������ ����Ǹ�(java Ŭ������) �޸�(method ����)�� �ε�ǰ� JVM(java.exe)�� ����Ǹ� �޸𸮿��� �������.
 *                          ���뺯��(��� ��ü�� �ϳ��� ������ ���)
 * @author kimhk0
 *
 */
public class FieldVariable {
	
	int i; //��üȭ�ؾ� �޸𸮿� ����
	static int j;
	
	public static void main(String[] args) {
		//static ������ Ŭ������ ����ɶ� ���� ���� ����ȴ�.
		//i = 27; // static ���������� instance ���Ҵ� ���� ����� �� ����.
		j = 27; // static ������ ���� ��밡�� 
		
		//i��� : 1. ��üȭ , 2.��ü��.������ ���� ���
		//1.��üȭ : Ŭ������ ��ü�� = new ������();
		
		FieldVariable fv = new FieldVariable();
		//2.���� ���
		fv.i = 1;
		System.out.println("static ����" + FieldVariable.j + ",instance ���� " + fv.i );
		// static ����(����-Ư����ü�� ������ ����) ��밡�������� �߸� �Ͽ��ϴ� ���� : ��ü��.������
		// fv.j = 20; //���
		// System.out.println(fv.j); //���
		
		fv.finalize();
		
	} // main
	
	public void finalize() {
		//��ü(fv)�� GC�� ���� �Ҹ�Ǹ� ȣ��Ǵ� �޼ҵ� 
		// Servlet / JSP (destroy / _jspDestroy )
	}
	
} // class
