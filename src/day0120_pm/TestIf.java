package day0120_pm;

/**
 * if - ��� ���� ���� �� �ִ� ���ǹ�
 * 		
 * @author kimhk0
 *
 */
public class TestIf {

	public static void main(String[] args) {
		// ���� if : ���ǿ� �´� ��쿡�� �ڵ带 �����ؾ��Ҷ�
			
			int price = 3000; // ��ǰ ����
			// ������ : Ư���� 30% , �Ϲݰ� ���� 10%
			double sale = 0.1D; // D,d �� �����
			String type="�Ϲ�"; // Ư�� or �Ϲ�
			
			// if(type.equals("Ư��)) { // NullPointerException �� �߻���ų�� �ִ� �ڵ�
			if("Ư��".equals(type)) {
				sale = 0.3;
			} // end if
			
			System.out.println(type + " ���� ���� " + price + ", ���ΰ� " + (price - price*sale));
			
		///////////////////////////// if~else /////////////////////////////////////////////////////////////////
			
			int num = 20;
			// ���� �ϳ��� �ڵ带 ���� �ؾ��� ��
			System.out.print(num + "�� ");
			if(num >= 0) {
				System.out.println("���");
			}else {
				System.out.println("����");
			} 
			
		/////////////////////////// ���� if(else~if) /////////////////////////////////////////////////////////
		// ������ �ִ� ���� ������ ��	
	    // ���� ��ȿ ���� : ������ 0~100�� ���̸� ��ȿ
		int score = 50;
		
		System.out.println(score + "���� ");
		if(score < 0) {
			System.out.println("0���� ������ ����.");
		}else if(score > 100) {
			System.out.println("100���� Ŭ�� ����.");
		}else {
			System.out.println("��ȿ����!!!!!!!!!!!!");
		}
			
			
	}// main
	
}// class
