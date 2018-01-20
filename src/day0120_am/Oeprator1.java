package day0120_am;

/**
 * 단항연산자 사용
 * ~,!,+,-,++,--
 * @author kimhk0
 *
 */
public class Oeprator1 {
	
	public static void main(String[] args) {
		int i = 20;
		System.out.println("~" + i + "=" + ~i); // -21
//		System.out.println(!10);  //! 뒤에는 true or false
		
		int temp = 0;
		//전위연산 : 내것 먼전(연산 후 대입) 
		temp = ++i;
		System.out.println("전위 연산 후 temp = " + temp + " , i = " + i);

		//후위연산 : 남의 것 먼저(대입 후 연산)
		temp = 0;
		temp = i++;
		System.out.println("후위 연산 후 temp = " + temp + " , i = " + i);
				
	}//main
	
}//class
