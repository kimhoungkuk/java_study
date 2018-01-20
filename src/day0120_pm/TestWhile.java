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
	
	public static void main(String[] args) { // static method : 클래스가 실행되면 memory에 가장 처음 올라가는 method
		//while
		int i = 0; // 초기값
		while(i<10) { // 조건식 : true 무한 loop
		//while(true) { // 조건식 : true 무한 loop
			System.out.println(i+"번 수행");//반복문장
			i++; // 증,감소식
		}
		
		//do~while
		int j = 0;//초기값
		do {
			System.out.println("----------"+j+"--------------------");
			j++;
		}while(j<10); // 조건식
		
	}//end while
	
}
