package day0120_am;

/**
 * ���׿����� ���
 * ~,!,+,-,++,--
 * @author kimhk0
 *
 */
public class Oeprator1 {
	
	public static void main(String[] args) {
		int i = 20;
		System.out.println("~" + i + "=" + ~i); // -21
//		System.out.println(!10);  //! �ڿ��� true or false
		
		int temp = 0;
		//�������� : ���� ����(���� �� ����) 
		temp = ++i;
		System.out.println("���� ���� �� temp = " + temp + " , i = " + i);

		//�������� : ���� �� ����(���� �� ����)
		temp = 0;
		temp = i++;
		System.out.println("���� ���� �� temp = " + temp + " , i = " + i);
				
	}//main
	
}//class
