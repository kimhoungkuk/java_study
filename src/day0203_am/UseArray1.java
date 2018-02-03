package day0203_am;

import java.util.Scanner;

/**
 *	 ������ �迭�� ��� 
 * @author kimk0
 */
public class UseArray1 {
	/**
	 * ������ ������ ���
	 */
	private void arr1() {
		//1. ���� ) ��������[] �迭��=null;
		int[] arr=null;
		int arr1[]=null;
		//2. ���� ) �迭��=new ��������[���� ��]; - ��� ���� �ڵ��ʱ�ȭ�ȴ�.
		arr=new int[5];
		arr1=new int[6];
		System.out.println("arr�� ���Ǽ� "+ arr.length+"/ arr1 �� ���� �� "+ arr1.length);
		//1+2 ) ��������[] �迭��=new ��������[���Ǽ�];
		String[] arr2=new String[10];
		System.out.println( "arr2�� ���� �� "+ arr2.length );
		//3. �� �Ҵ� ) �迭��[�ε���]=��;
		arr[0]=2017;
		arr[1]=9;
		
		arr1[0]=10;
		arr1[1]=23;
		arr1[2]=50;
		
		arr2[0]="�ȳ�";
		arr2[2]="�ϼ���.";
		arr2[9]="������ ȭ���� �Դϴ�.";
		
		//4. �� ���) �迭��[�ε���];
		System.out.println(arr[0]+" / "+ arr1[2]+" / "+arr1[3]+
				"/ "+arr2[0]+" / "+arr2[1]);
		// �ϰ�ó�� 
//		for(int i=0 ; i < arr.length ;i ++) {
//			System.out.println("arr["+i+"]="+ arr[i]);
//		}//end for
		
		for(int i : arr) {
			System.out.println( i );
		}//end for
		// arr2 �迭�� ������� ó�� ����� ���
		
		
	}//arr1
	
	/**
	 * �⺻�� ����(�迭�� �ʱ�ȭ)�� ���
	 */
	private void arr2() {
		// new ���� : ��������[] �迭��={��,,,,,};
		int[] arr= {1,10,100,1000,10000};
		// new ��� : ��������[] �迭��=new ��������[]{ ��,,,,, };
		int[] arr1=new int[] {2017,9,26,11,7,1,2,3,4,5};
		System.out.println( "arr�� ���Ǽ� "+ arr.length
					+" arr1�� ���Ǽ� "+ arr1.length);	
		//�� �Ҵ� : 
		arr[0]=100000000;
		
		//��� ���� �� ���
		for(int i=0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"]="+ arr[i]);
		}//end for
		for(int i=0 ; i < arr1.length ; i++) {
			System.out.println("arr1["+i+"]="+ arr1[i]);
		}//end for
		
	}//arr2
	
	protected void arr3() {
		int[] class4_score= {89,74,99,62,93,77};
		String[] class4_name= {"���¿�","������","�迵��","Ȳ����"
					,"�����","���ٱ�"};
		System.out.println("�̸�\t�ڹ�����");
		System.out.println("---------------------------------------");
		int total=0;//����
		int max=class4_score[0]; //�ְ�
		int min=100;//����
		//���� : 
		for( int i=0 ; i< class4_name.length ; i++ ) {
			System.out.printf("%s\t%d\n",class4_name[i], class4_score[i]);
			total+= class4_score[i];
			if(max < class4_score[i]) {
				max=class4_score[i];
			}//end if
			if(min > class4_score[i]) {
				min=class4_score[i];
			}//end if
		}//end for
		System.out.println("---------------------------------------");
		System.out.printf("����[%7d] ���[ %.2f ]\n",total, 
				(double)total/class4_score.length);
		System.out.printf("������ [%5d]��\n",class4_score.length); 
		System.out.printf("�ְ����� [%3d]��\n",max); 
		System.out.printf("�������� [%3d]��\n",min);
		
		//
		int temp=0;
		for(int i=0 ; i < class4_score.length-1 ; i++) {
			for(int j=i+1; j < class4_score.length ;j++) {
				if( class4_score[i] < class4_score[j] ) {
					temp=class4_score[i];
					class4_score[i]=class4_score[j];
					class4_score[j]=temp;
				}//end if
			}//end for
		}//end for
	
		System.out.println("���� �������� ����");
		for( int i=0 ; i < class4_score.length ; i++) {
			System.out.printf("%-4d", class4_score[i]);
		}//end for
		
		
	}//arr3
	
	public static void main(String[] args) {
		UseArray1 ua=new UseArray1();
		System.out.println("------------------������ ���� ���---------------");
		ua.arr1();
		System.out.println("------------------�⺻�� ���� ���---------------");
		ua.arr2();
		System.out.println("------------------�л�����---------------");
		ua.arr3();
		
		int year=2000;
		String[] zodiac= {"������","��","��",
				"����","��","��","ȣ����","�䳢","��","��","��","��"};
		System.out.println( zodiac[ year%12 ] );
		
		
	}//main

}//class
