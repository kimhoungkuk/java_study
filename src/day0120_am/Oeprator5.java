package day0120_am;

/**
 * ��������
 * 		�Ϲݳ� : && , ||
 *     ��Ʈ�� : & , | , ^
 * @param kimhk0
 */
public class Oeprator5 {
	public static void main(String[] args) {

		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		// &&(AND) : ���װ� ������ ��� ���� ���� �� ��ȯ.
		// ������ �����̶�� ������ ������� �ʴ´�.
		flag1 = (flag2=3<2)&&(flag3=3<4);
		System.out.println("��� " + flag1 + " ���� " + flag2 + " ���� " + flag3);

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
		// &(AND) : ���� ��Ʈ�� ���� ��Ʈ ��� 1�϶��� 1 ����
		// |(OR) : ���� ��Ʈ�� ���� ��Ʈ ��� 0 �϶��� 0 ����
		// ^(XOR) : (eXclusive OR) ���� ��Ʈ�� ���� ��Ʈ �� �� �ϳ��� 1 �϶� 1 ����
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
