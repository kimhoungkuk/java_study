package day0120_pm;

/**
 * @author kimhk0
 *
 */
public class TestWhile {
	
	int test;
	
	public void m() { // instance method
		test = 100;
	}
	
	public static void main(String[] args) { // static method : Ŭ������ ����Ǹ� memory�� ���� ó�� �ö󰡴� method
		//while
		int i = 0; // �ʱⰪ
		while(i<10) { // ���ǽ� : true ���� loop
		//while(true) { // ���ǽ� : true ���� loop
			System.out.println(i+"�� ����");//�ݺ�����
			i++; // ��,���ҽ�
		}
		
		//do~while
		int j = 0;//�ʱⰪ
		do {
			System.out.println("----------"+j+"--------------------");
			j++;
		}while(j<10); // ���ǽ�
		
	}//end while
	
}
