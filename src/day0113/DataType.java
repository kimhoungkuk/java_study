package day0113;

/**
 * �⺻�������������.
 * �������� ����.
 * �����.
 * �ڵ�����ȯ.
 * @author sist00
 */
public class DataType {
	public static void main(String[] args) {
		/*
		int i ;//1. ������������
		i=7;//2. ���Ҵ� 
		System.out.println( i );//3. ������ ���
		*/
		///////////// ������ //////////////////////////////
		byte a=10;//literal�� 1byte�� �ڵ� ��ȯ�Ǿ� �Ҵ�
		short b=10;//literal�� 2byte�� �ڵ� ��ȯ�Ǿ� �Ҵ�
		int c=2_147_483_647; //JDK1.7���ʹ� ������ ����� �� _�� �����ڷ� ���
		long d=2147483647;
		long e=2147483648L;//����� : literal�� 4byte���� 8byte �� ����
		System.out.println("byte = "+a+", short = "+b+", int = "+ c+
					"long = "+d+", "+e);
		///////////// ������ //////////////////////////////
		char f='A'; //unicode�� �Ҵ� 
		char g='0';
		char h='��';
		System.out.println("char = "+ f+", "+g+", "+h);
		
		///////////// �Ǽ��� //////////////////////////////
		float i=1.13F;//����� : literal�� 8byte���� 4byte�� ����
		double j=1.13D;//����� �ʿ����.
		System.out.println("float = "+ i+", double"+j);
		///////////// �Ҹ��� //////////////////////////////
		boolean k=true;
		boolean l=false;
		System.out.println("booelan = "+ k+", "+l);
	}//main

}//class




