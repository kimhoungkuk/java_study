package day0113;

/**
 * ��������ȯ
 * @author sist00
 */
public class UseCasting {

	public static void main(String[] args) {
		float f=(float)1.13;//����÷� �Ҵ� ����, ��������ȯ���� �Ҵ� ����
		int i=(int)f;//���ս� �߻�
		System.out.println("f ="+f+", i= "+i);  
		
		//float a = 0.003f;
		
		//�⺻������������ ������ ���������� ���� casting�� �� ����.
		//String str="10";//������
		//int num=(int)str;
		//int num=10;
		//String str=(String)num;
		
		//boolean �� ���������θ�  casting �ȴ�.
		boolean b=false;
//		int num=(int)b;
		boolean c=(boolean)b;
		System.out.println(b+" / "+c);
	}//main

}//class






