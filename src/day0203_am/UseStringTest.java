package day0203_am;

/**
 * @author kimhk0
 *
 */
public class UseStringTest {
	
	public UseStringTest() {
		String str = "AbcdEfdG";
		System.out.println(str);
		System.out.println(str + " 의 글자수 " + str.length());
		System.out.println(str + " 대문자 " + str.toUpperCase());
		System.out.println(str + " 대문자 " + str.toLowerCase());		
		System.out.println(str + " 'd'의 인덱스 " + str.indexOf("d"));		
		System.out.println(str + " 뒤로부터 'd'의 인덱스 " + str.lastIndexOf("d"));		
		System.out.println(str + " 'k'의 인덱스 " + str.indexOf("k")); // -1
		System.out.println(str + " 에서 5번째 인덱스의 문자 " + str.charAt(5)); 
		//System.out.println(str + " 에서 15번째 인덱스의 문자 " + str.charAt(15)); 에러 발생
		//AbcdEfdG 
		// 가장 마지막 문자에 문자열 끝 기호를 덮어 쓰기 때문에 끝인덱스 + 1 로 써줘야 한다.
		System.out.println(str + " 에서 2 ~ 4 사이의 문자열 " + str.substring(2,5)); 
		String temp="서울시 동대문구 역삼동";
		System.out.println(temp + " 은(는)  " + (temp.startsWith("서울")?"특별시":"일반도시")); 
		temp="경기도 의정부시";
		System.out.println(temp + " 은(는)  " + (temp.startsWith("서울")?"특별시":"일반도시")); 
		temp="강남구 역삼동";
		System.out.println(temp + " 은(는)  " + (temp.endsWith("동")?"도시":"시골")); 
		temp="장흥면 교현리";
		System.out.println(temp + " 은(는)  " + (temp.endsWith("동")?"도시":"시골")); 
		temp="java,oracle,JSP,MyBatis,Spring";
		System.out.println(temp + " 에서 'a'를 ''Test'로 변환 " + temp.replace("a","Test"));
		System.out.println(temp + " 에서 'a'를 ''Test'로 변환 " + temp.replaceAll("a","Test"));
		temp= "   A AA   ";
		System.out.println("[" + temp + "]를 앞뒤공백 제거 [" + temp.trim()+"]");
		System.out.println("[" + temp + "]를 모든공백 제거 [" + temp.replace(" ", "")+"]");
		
	} // UseStringTest
	
	public static void main(String[] args) {
		
		 // 객체생성 후 객체명으로 변수,method를 사용하지 않는 경우 객체화.
		new UseStringTest();
		// 객체생성 후 객체명으로 변수,method를 사용하는 경우 객체화.
		// 클래스명 객체명 = new 생성자();
		
	}//main
	
}//class
