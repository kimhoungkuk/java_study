package day0120_pm;

/**
 * ���۰� ���� �� �� ����ϴ� �ݺ��� : for
 * @author kimhk0
 *
 */
public class UseFor {

	public static void main(String[] args) {
		
		//���� for
		for(int i = 0;i<10;i++) {
			System.out.println((i+1)+"��° �ȳ��ϼ���.");
		} // end for
		
		//1. 1 ~ 100 ���� ����ϴ� for
		for(int i = 1;i<101;i++) {
			System.out.println(i);
		} // end for
		
		//2. 1 ~ 100 ���� Ȧ���� ��� for
		for(int i = 1;i<101;i+=2) {
			System.out.println(i);
		} // end for
		
		//3. 1 ~ 100 ���� ������ for : 5050
		int sum = 0;
		for(int i = 1;i<101;i++) {
			sum += i;
		} // end for
		System.out.println("������ : " + sum);
		
		//4. 'A' ~ 'Z' ���� ����ϴ� for
	     char c='A';
	     for(int i=0;  i<26; i++, c++){
	        System.out.println("���ĺ� ��� : " + c);
	     }
	
		//5. ������ 3�� ��� for
	     for(int i=1;  i<10; i++){
		        System.out.println("������ 3�� ��� : 3 * " + i + " = " + (i * 3));
		 }
		
		//���� for
		for(int i = 0;i<4;i++) {
			System.out.println(i+"��° ���� for ����--");
			for(int j = 0;j < 6; j++) {
				System.out.println("i : " + i + ", j : "+j);
			}
			System.out.println(i+"��° ���� for ��--");
		} // end for
		
		//6. ������ 2~9�ܱ��� ����
		// 2x1=2 ------------------- 2x9=19
		//.
		// 9x1=2 ------------------- 9x9=91
	     for(int i=2;  i<10; i++){
		       for( int j=1; j<10; j++) {
		    	   System.out.println("������ ��� : " + i + " �� : " + i + " * " + j + " = " + i*j );
		       }
		 }
		
		//7. ������ 2~9�ܱ��� ����
		// 2x1=2 ------------------- 9x1=9
		// 2x2=4 ------------------- 9x2=18
		//.
		// 2x9=18 ------------------- 9x9=81
	     for(int i=1;  i<10; i++){
		       for( int j=2; j<10; j++) {
		    	   System.out.println("������ ��� �ι�° : " + j + " * " + i + " = " + j*i );
		       }
		 }
	     
		//8. ������ 2~9�ܱ��� ����
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2
		// 3 0 3 1 3 2 3 3
	     for(int i=1;  i<10; i++){
		       for( int j=2; j<10; j++) {
		    	   System.out.println("������ ��� �ι�° : " + j + " * " + i + " = " + j*i );
		       }
		 }
		
		//for ���� loop : ������� �ʴ� ���α׷�(����, �ð�)
		for( int i =0;;i++) { // ���� �����ʴ� ���� loop
			System.out.println("����");
			break;
		}
		// int temp = 0; ����loop ���� ���� �ڵ�� ���� �� �� ����.
				
	} // main
	
} // class
