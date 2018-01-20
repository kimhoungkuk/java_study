package day0120_pm;

/**
 * switch ~ case
 * 일치하는 정수를 비교할 때 사용
 * @author kimhk0
 *
 */
public class TestSwitch {
	
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	
	public static void main(String[] args) {
		
		int b=1; // byte, short, int, chr
		
		switch(b) { // 입력되는 변수의 범위로 case 상수 설정
			case ZERO : System.out.println("0인 경우 실행될 코드");
				break;
			case ONE : System.out.println("1인 경우 실행될 코드");
				break;
			case TWO : System.out.println("2인 경우 실행될 코드");
				break;
			default :
				System.out.println("입력된 변수에 일치하는 상수가 없을 때 실행될 코드");
		} // switch
		
		String str = "";
		
		switch(str) { // JDK 1.7에서 부터 문자열도 비교 가능
			case "java" : 
				System.out.println("객체지향언어");
				break;
			case "javascript" : 
				System.out.println("객체기반언어");
				break;
			default :
		}
		
	} //main
	
}// class
