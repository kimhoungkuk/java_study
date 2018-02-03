package day0203_pm;

/**
 * @author kimhk
 *
 */
public class UseArrayTwo {
	
	public void array2() {
		// 1.선언 : 데이터형[][] 배열명 = null;
		int[][] arr = null;
		// 2.생성 : 배열명 = new 데이터형[행수][열수]; 모든방의 값이 초기화
		arr = new int[3][2];
		// 2. 열의 갯수를 설정하지 않으면 가변배열로 생성(행마다 열의수가 다른 배열)
	    int[][] variableArr = null;
	    variableArr = new int[5][];
	    
	    // 3.값 할당 : 배열명[행][열] = 값;
	    arr[0][0] = 10;
	    arr[2][1] = 20;
	    // 가변배열은 열리 생성되어 있지 않기 때문에 행마다 열을 생성해야한다.
	    // 배열명[행의번호] = new 데이터형[열의수];
	    // 고정값을 설정하여 열 생성 : 배열명[행의번호] = new 데이터형[]{값,,,,,};
	    variableArr[0] = new int[2]; //모든 방의 값이 초기화
	    variableArr[1] = new int[3]; //모든 방의 값이 초기화
	    variableArr[2] = new int[]{1,2,3,4,5,5,6,7,78}; //고정값으로 방을 생성
	    variableArr[3] = new int[5]; //모든 방의 값이 초기화
	    variableArr[4] = new int[2]; //모든 방의 값이 초기화	    
	    
	    // 값 할당
	    variableArr[0][0] = 2;
	    variableArr[4][1] = 20;

	    System.out.println("============== arr ===================== ");
	    
	    for(int i=0; i < arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.print(arr[i][j] + " ");
	    	}
	    	System.out.println();
	    }//end for
	    
	   System.out.println("============== variableArr ================ ");
	    
	   //가변배열의 모든 방 출력 
	   for(int i=0; i < variableArr.length;i++) {
	    	for(int j=0;j<variableArr[i].length;j++) {
	    		System.out.print(variableArr[i][j] + " ");
	    	}
	    	System.out.println();
	   }//end for
	   
	   System.out.println("============== 개선된 for 루프 arr ================ ");
	   
	   for(int[] arr1 : arr ) { // 이차원배열의 한행은 일차원 배열로 이루어져 있음
		   for(int value:arr1) { // 일차원 배열의 방하나는 데이터형으로 이루어져 있다.
			   System.out.print(value + " ");
		   }
		   System.out.println();
	   }
	    
	   System.out.println("============== 개선된 for 루프 variableArr ================ ");
	    
	   for(int[] arr2 : variableArr ) { // 이차원배열의 한행은 일차원 배열로 이루어져 있음
		   for(int value2:arr2) { // 일차원 배열의 방하나는 데이터형으로 이루어져 있다.
			   System.out.print(value2 + " ");
		   }
		   System.out.println();
	   }
	
	   System.out.println("============================== ");
	   //이차원 배열의 기본형 형식 사용(행구분 괄호사용)
	   //데이터형[][] 배열명 = {{값,,,,},{,,,,,}};
	   int[][] tempArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	   for(int[] arr1 : tempArr) {
		   for(int value : arr1) {
			   System.out.print(value + " ");
		   }// end for
		   System.out.println();
	   }// end for
	    
	}// array2
	
	public static void main(String[] args) {
		new UseArrayTwo().array2();
	}// main
	
}// class
