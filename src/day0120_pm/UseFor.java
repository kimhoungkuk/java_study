package day0120_pm;

/**
 * 시작과 끝을 알 때 사용하는 반복문 : for
 * @author kimhk0
 *
 */
public class UseFor {

	public static void main(String[] args) {
		
		//단일 for
		for(int i = 0;i<10;i++) {
			System.out.println((i+1)+"번째 안녕하세요.");
		} // end for
		
		//1. 1 ~ 100 까지 출력하는 for
		for(int i = 1;i<101;i++) {
			System.out.println(i);
		} // end for
		
		//2. 1 ~ 100 까지 홀수만 출력 for
		for(int i = 1;i<101;i+=2) {
			System.out.println(i);
		} // end for
		
		//3. 1 ~ 100 까지 누적합 for : 5050
		int sum = 0;
		for(int i = 1;i<101;i++) {
			sum += i;
		} // end for
		System.out.println("누적합 : " + sum);
		
		//4. 'A' ~ 'Z' 까지 출력하는 for
	     char c='A';
	     for(int i=0;  i<26; i++, c++){
	        System.out.println("알파벳 출력 : " + c);
	     }
	
		//5. 구구단 3단 출력 for
	     for(int i=1;  i<10; i++){
		        System.out.println("구구단 3단 출력 : 3 * " + i + " = " + (i * 3));
		 }
		
		//다중 for
		for(int i = 0;i<4;i++) {
			System.out.println(i+"번째 안쪽 for 시작--");
			for(int j = 0;j < 6; j++) {
				System.out.println("i : " + i + ", j : "+j);
			}
			System.out.println(i+"번째 안쪽 for 끝--");
		} // end for
		
		//6. 구구단 2~9단까지 추출
		// 2x1=2 ------------------- 2x9=19
		//.
		// 9x1=2 ------------------- 9x9=91
	     for(int i=2;  i<10; i++){
		       for( int j=1; j<10; j++) {
		    	   System.out.println("구구단 출력 : " + i + " 단 : " + i + " * " + j + " = " + i*j );
		       }
		 }
		
		//7. 구구단 2~9단까지 추출
		// 2x1=2 ------------------- 9x1=9
		// 2x2=4 ------------------- 9x2=18
		//.
		// 2x9=18 ------------------- 9x9=81
	     for(int i=1;  i<10; i++){
		       for( int j=2; j<10; j++) {
		    	   System.out.println("구구단 출력 두번째 : " + j + " * " + i + " = " + j*i );
		       }
		 }
	     
		//8. 구구단 2~9단까지 추출
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2
		// 3 0 3 1 3 2 3 3
	     for(int i=1;  i<10; i++){
		       for( int j=2; j<10; j++) {
		    	   System.out.println("구구단 출력 두번째 : " + j + " * " + i + " = " + j*i );
		       }
		 }
		
		//for 무한 loop : 종료되지 않는 프로그램(서버, 시계)
		for( int i =0;;i++) { // 수를 세지않는 무한 loop
			System.out.println("무한");
			break;
		}
		// int temp = 0; 무한loop 다음 줄의 코드는 실행 될 수 없다.
				
	} // main
	
} // class
