package day0203_am;

/**
 * @author kimhk0
 *
 */
public class UseArrayOne {
	
	public UseArrayOne() {
		//System.out.println("������");
	} //Constructor
	
	public void array1() {
		//1. ���� : ��������[] �迭�� = null;
		int[] arr = null;
		// int cnt = arr.length;
		//2. ����(������ ���� �ʱ�ȭ) : �迭�� = new ��������[���Ǽ�];
		arr = new int[5];
		
		// 1 + 2 : ��������[] �迭�� = new ��������[���Ǽ�]
		int[] arr1 = new int[10];
		
		System.out.println("arr �迭�� ���� �� : " + arr.length + " , arr1 �迭�� ���� �� : " + arr1.length);
		
		// ���� ���� �����Ǿ� �ִٸ� �⺻�� �������� ����
		//����) ��������[] �迭�� = {��,,,,,};
		String[] subjectArr = {"Java","JDBC","JNDI","DBCP"};
		for(int i=0;i<subjectArr.length;i++) {
			System.out.println("subjectArr["+i+"] = " + subjectArr[i]);
		}
		
		//3. �� �Ҵ� : �迭��[���ǹ�ȣ]=rkqt;
		arr[0]=100;
		
		// ��� ���� �� ���
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		} //end for
		
		//������ for: �ε����� ����� �� ������, ��� ���� ���� ���
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
		
		//��ü���� ��  method ȣ�� ���� : new ������().method��();
		new UseArrayOne().array1();
		
	}//main
	
}//class
