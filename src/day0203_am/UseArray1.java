package day0203_am;

import java.util.Scanner;

/**
 *	 일차원 배열의 사용 
 * @author kimk0
 */
public class UseArray1 {
	/**
	 * 참조형 형식의 사용
	 */
	private void arr1() {
		//1. 선언 ) 데이터형[] 배열명=null;
		int[] arr=null;
		int arr1[]=null;
		//2. 생성 ) 배열명=new 데이터형[방의 수]; - 모든 방이 자동초기화된다.
		arr=new int[5];
		arr1=new int[6];
		System.out.println("arr의 방의수 "+ arr.length+"/ arr1 의 방의 수 "+ arr1.length);
		//1+2 ) 데이터형[] 배열명=new 데이터형[방의수];
		String[] arr2=new String[10];
		System.out.println( "arr2의 방의 수 "+ arr2.length );
		//3. 값 할당 ) 배열명[인덱스]=값;
		arr[0]=2017;
		arr[1]=9;
		
		arr1[0]=10;
		arr1[1]=23;
		arr1[2]=50;
		
		arr2[0]="안녕";
		arr2[2]="하세요.";
		arr2[9]="오늘은 화요일 입니다.";
		
		//4. 값 사용) 배열명[인덱스];
		System.out.println(arr[0]+" / "+ arr1[2]+" / "+arr1[3]+
				"/ "+arr2[0]+" / "+arr2[1]);
		// 일괄처리 
//		for(int i=0 ; i < arr.length ;i ++) {
//			System.out.println("arr["+i+"]="+ arr[i]);
//		}//end for
		
		for(int i : arr) {
			System.out.println( i );
		}//end for
		// arr2 배열을 끝방부터 처음 방까지 출력
		
		
	}//arr1
	
	/**
	 * 기본형 형식(배열의 초기화)의 사용
	 */
	private void arr2() {
		// new 생략 : 데이터형[] 배열명={값,,,,,};
		int[] arr= {1,10,100,1000,10000};
		// new 명시 : 데이터형[] 배열명=new 데이터형[]{ 값,,,,, };
		int[] arr1=new int[] {2017,9,26,11,7,1,2,3,4,5};
		System.out.println( "arr의 방의수 "+ arr.length
					+" arr1의 방의수 "+ arr1.length);	
		//값 할당 : 
		arr[0]=100000000;
		
		//모든 방의 값 출력
		for(int i=0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"]="+ arr[i]);
		}//end for
		for(int i=0 ; i < arr1.length ; i++) {
			System.out.println("arr1["+i+"]="+ arr1[i]);
		}//end for
		
	}//arr2
	
	protected void arr3() {
		int[] class4_score= {89,74,99,62,93,77};
		String[] class4_name= {"김태영","김진석","김영욱","황의종"
					,"허재령","박줄기"};
		System.out.println("이름\t자바점수");
		System.out.println("---------------------------------------");
		int total=0;//총점
		int max=class4_score[0]; //최고
		int min=100;//최저
		//최저 : 
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
		System.out.printf("총점[%7d] 평균[ %.2f ]\n",total, 
				(double)total/class4_score.length);
		System.out.printf("응시자 [%5d]명\n",class4_score.length); 
		System.out.printf("최고점수 [%3d]점\n",max); 
		System.out.printf("최저점수 [%3d]점\n",min);
		
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
	
		System.out.println("점수 내림차순 정렬");
		for( int i=0 ; i < class4_score.length ; i++) {
			System.out.printf("%-4d", class4_score[i]);
		}//end for
		
		
	}//arr3
	
	public static void main(String[] args) {
		UseArray1 ua=new UseArray1();
		System.out.println("------------------참조형 형식 사용---------------");
		ua.arr1();
		System.out.println("------------------기본형 형식 사용---------------");
		ua.arr2();
		System.out.println("------------------학생점수---------------");
		ua.arr3();
		
		int year=2000;
		String[] zodiac= {"원숭이","닭","개",
				"돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		System.out.println( zodiac[ year%12 ] );
		
		
	}//main

}//class
