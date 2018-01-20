package day0120_pm;

/**
 * switch ~ case
 * ��ġ�ϴ� ������ ���� �� ���
 * @author kimhk0
 *
 */
public class TestSwitch {
	
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	
	public static void main(String[] args) {
		
		int b=1; // byte, short, int, chr
		
		switch(b) { // �ԷµǴ� ������ ������ case ��� ����
			case ZERO : System.out.println("0�� ��� ����� �ڵ�");
				break;
			case ONE : System.out.println("1�� ��� ����� �ڵ�");
				break;
			case TWO : System.out.println("2�� ��� ����� �ڵ�");
				break;
			default :
				System.out.println("�Էµ� ������ ��ġ�ϴ� ����� ���� �� ����� �ڵ�");
		} // switch
		
		String str = "";
		
		switch(str) { // JDK 1.7���� ���� ���ڿ��� �� ����
			case "java" : 
				System.out.println("��ü������");
				break;
			case "javascript" : 
				System.out.println("��ü��ݾ��");
				break;
			default :
		}
		
	} //main
	
}// class
