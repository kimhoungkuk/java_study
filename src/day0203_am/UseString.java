package day0203_am;

/**
 * Ŭ������ �̸��� java.lang package���� �����ϴ� �̸��� ���ٸ�
 * lang pcakage�� Ŭ������ ����ؾ� �ϴ� ��Ȳ�� ���� ���� Ŭ������ ����ϰ� �ǹǷ� ������ �߻��ϰ� �ȴ�.
 * �ذ� : Ŭ������ ����� �� ��Ű����.Ŭ���������� ����ϵ� Ŭ������ �ۼ��� �� �̸��� ��ġ�� �ʵ��� ����
 * @author kimhk0
 *
 */
public class UseString {
	
	public static void main(String[] args) {
		// �⺻�� (new ������� ����) : String str = "ABC";
		String str = "ABC";
		// ������ ���� ( new �� ����Ѵ� ) : String str = new String("ABC");
		String str1 = new String("ABC");
		// ��
		// �⺻�� ���� : == , equals ��� ��� ����
		System.out.println("�⺻��  == �� : " + ( str == "ABC" ? "����" : "�ٸ���"));
		System.out.println("�⺻��  equals �� : " + ( str.equals("ABC") ? "����" : "�ٸ���"));
		// ������ ���� : equals �� ���
		System.out.println("������  == �� : " + ( str1 == "ABC" ? "����" : "�ٸ���"));
		System.out.println("������  equals �� : " + ( str1.equals("ABC") ? "����" : "�ٸ���"));
		
		System.out.println("�׽�Ʈ �Դϴ�.");
		
	} // main
	
} // class
