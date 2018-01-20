package day0120_pm;

/**
 * if - 모든 값을 비교할 수 있는 조건문
 * 		
 * @author kimhk0
 *
 */
public class TestIf {

	public static void main(String[] args) {
		// 단일 if : 조건에 맞는 경우에만 코드를 실행해야할때
			
			int price = 3000; // 상품 가격
			// 할인율 : 특별고객 30% , 일반고객 할인 10%
			double sale = 0.1D; // D,d 는 형명시
			String type="일반"; // 특별 or 일반
			
			// if(type.equals("특별)) { // NullPointerException 을 발생시킬수 있는 코드
			if("특별".equals(type)) {
				sale = 0.3;
			} // end if
			
			System.out.println(type + " 고객님 정상가 " + price + ", 할인가 " + (price - price*sale));
			
		///////////////////////////// if~else /////////////////////////////////////////////////////////////////
			
			int num = 20;
			// 둘중 하나의 코드를 실행 해야할 때
			System.out.print(num + "은 ");
			if(num >= 0) {
				System.out.println("양수");
			}else {
				System.out.println("음수");
			} 
			
		/////////////////////////// 다중 if(else~if) /////////////////////////////////////////////////////////
		// 연관성 있는 여러 조건을 비교	
	    // 점수 유효 범위 : 점수는 0~100점 사이만 유효
		int score = 50;
		
		System.out.println(score + "점은 ");
		if(score < 0) {
			System.out.println("0보다 작을수 없다.");
		}else if(score > 100) {
			System.out.println("100보다 클수 없다.");
		}else {
			System.out.println("유효범위!!!!!!!!!!!!");
		}
			
			
	}// main
	
}// class
