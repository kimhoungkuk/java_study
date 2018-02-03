package day0203_am;

/**
 * @author kimhk0
 *
 */
public class UseArrayOne {
	
	public UseArrayOne() {
		//System.out.println("생성자");
	} //Constructor
	
	public void array1() {
		//1. 선언 : 데이터형[] 배열명 = null;
		int[] arr = null;
		// int cnt = arr.length;
		//2. 생성(모든방의 값이 초기화) : 배열명 = new 데이터형[방의수];
		arr = new int[5];
		
		// 1 + 2 : 데이터형[] 배열명 = new 데이터형[방의수]
		int[] arr1 = new int[10];
		
		System.out.println("arr 배열의 방의 수 : " + arr.length + " , arr1 배열의 방의 수 : " + arr1.length);
		
		// 방의 값이 고정되어 있다면 기본형 형식으로 생성
		//문법) 데이터형[] 배열명 = {값,,,,,};
		String[] subjectArr = {"Java","JDBC","JNDI","DBCP"};
		for(int i=0;i<subjectArr.length;i++) {
			System.out.println("subjectArr["+i+"] = " + subjectArr[i]);
		}
		
		//3. 값 할당 : 배열명[방의번호]=rkqt;
		arr[0]=100;
		
		// 모든 방의 값 출력
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		} //end for
		
		//개선된 for: 인덱스를 사용할 수 없으며, 모든 방의 값을 출력
		for(int value : arr) {
			System.out.println(value);	
		}
		
		for(String subject : subjectArr) {
			System.out.println(subject);	
		}
		
	}// array1
	
	public static void main(String[] args) {
/*		UseArrayOne uao = new UseArrayOne();
		uao.array1();*/
		
		//객체생성 후  method 호출 동시 : new 생성자().method명();
		new UseArrayOne().array1();
		
	}//main
	
}//class
