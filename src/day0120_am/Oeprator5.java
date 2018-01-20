package day0120_am;

/**
 * 논리연산자
 * 		일반논리 : && , ||
 *     비트논리 : & , | , ^
 * @param kimhk0
 */
public class Oeprator5 {
	public static void main(String[] args) {

		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		// &&(AND) : 전항과 후항이 모두 참일 때만 참 반환.
		// 전항이 거짓이라면 후항을 계산하지 않는다.
		flag1 = (flag2=3<2)&&(flag3=3<4);
		System.out.println("결과 " + flag1 + " 전항 " + flag2 + " 후항 " + flag3);

		System.out.println("--------------------------------- && -----------------------------------");
		System.out.println(true + " && " + true + " = " + (true&&true)); //true
		System.out.println(true + " && " + false + " = " + (true&&false)); //false
		System.out.println(false + " && " + true + " = " + (false&&true)); //false
		System.out.println(false + " && " + false + " = " + (false&&false)); //false
		System.out.println("--------------------------------- || -----------------------------------");
		System.out.println(true + " && " + true + " = " + (true||true)); //true
		System.out.println(true + " && " + false + " = " + (true||false)); //true
		System.out.println(false + " && " + true + " = " + (false||true)); //true
		System.out.println(false + " && " + false + " = " + (false||false)); //false
		
		System.out.println("=================================================");
		// &(AND) : 상위 비트와 하위 비트 모두 1일때만 1 내림
		// |(OR) : 상위 비트와 하위 비트 모두 0 일때만 0 내림
		// ^(XOR) : (eXclusive OR) 상위 비트와 하위 비트 둘 중 하나만 1 일때 1 내림
		int i = 17;
		int j = 7;
		// 0001 0001 & 0000 0111 = 0000 0001
		System.out.println(i + " & " + j + " = " + (i&j)); 
		
		// 0001 0001 & 0000 0111 = 0001 0111
		System.out.println(i + " | " + j + " = " + (i|j)); 
		
		// 0001 0001 ^ 0000 0111 = 0001 0110
		System.out.println(i + " ^ " + j + " = " + (i^j)); 

	}
}
