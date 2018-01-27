package day0127_am;

/**
 * JDK1.5에서 추가된 기능
 * @author kimhk0
 *
 */
public class UseVariableArguments {
	
	/**
	 * 가변인자형 연습<br>
	 * 호출) 호출시 입력값을 가변적으로 넣을 수 있다.<br>
	 * vaMethod();<br>
	 * vaMethod(1);<br>
	 * vaMethod(1,2,3,4);<br>
	 * vaMethod(1,2,3............x);<br>
	 * @param param
	 */
	public void vaMethod(int ...param) {
		
		for(int i=0;i<param.length;i++) {
			System.out.println(param[i]); // V.A로 입력된 모든 값 출력
		}//end for
		
	} // vaMethod
	
	//V.A가 여러개의 매개변수와 같이 사용되면  가장 마지막에만 정의
/*    protected void test(int i, char ... c, String s) { // Error
*/    	
    protected void test(int i, String s, char ... c) { // OK
    	
    }
    
	public static void main(String[] args) {
		UseVariableArguments uva = new UseVariableArguments();
		/*uva.vaMethod();*/
		uva.vaMethod(2018,1,27,11,42);
		uva.test(1, "안녕", 'A','B','가');
		System.out.println("-----------------------------------------------");
		System.out.printf("[%d][%4d][%-4d]\n",12,12,12);
		System.out.printf("[%f][%5.2f][%-7.2f]\n",1.2345,1.2345,1.2345);		
		System.out.format("오늘은%d년도%d월%d일 %c요일(%s)입니다.\n", 2018,1,27,'토',"퇼요일");
		System.out.println("오늘은\t토요일\n입니다.");
	} //main
	
} //class
