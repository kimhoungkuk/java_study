package day0203_pm;

/**
 * @author kimhk
 *
 */
public class UseArrayTwo {
	
	public void array2() {
		// 1.���� : ��������[][] �迭�� = null;
		int[][] arr = null;
		// 2.���� : �迭�� = new ��������[���][����]; ������ ���� �ʱ�ȭ
		arr = new int[3][2];
		// 2. ���� ������ �������� ������ �����迭�� ����(�ึ�� ���Ǽ��� �ٸ� �迭)
	    int[][] variableArr = null;
	    variableArr = new int[5][];
	    
	    // 3.�� �Ҵ� : �迭��[��][��] = ��;
	    arr[0][0] = 10;
	    arr[2][1] = 20;
	    // �����迭�� ���� �����Ǿ� ���� �ʱ� ������ �ึ�� ���� �����ؾ��Ѵ�.
	    // �迭��[���ǹ�ȣ] = new ��������[���Ǽ�];
	    // �������� �����Ͽ� �� ���� : �迭��[���ǹ�ȣ] = new ��������[]{��,,,,,};
	    variableArr[0] = new int[2]; //��� ���� ���� �ʱ�ȭ
	    variableArr[1] = new int[3]; //��� ���� ���� �ʱ�ȭ
	    variableArr[2] = new int[]{1,2,3,4,5,5,6,7,78}; //���������� ���� ����
	    variableArr[3] = new int[5]; //��� ���� ���� �ʱ�ȭ
	    variableArr[4] = new int[2]; //��� ���� ���� �ʱ�ȭ	    
	    
	    // �� �Ҵ�
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
	    
	   //�����迭�� ��� �� ��� 
	   for(int i=0; i < variableArr.length;i++) {
	    	for(int j=0;j<variableArr[i].length;j++) {
	    		System.out.print(variableArr[i][j] + " ");
	    	}
	    	System.out.println();
	   }//end for
	   
	   System.out.println("============== ������ for ���� arr ================ ");
	   
	   for(int[] arr1 : arr ) { // �������迭�� ������ ������ �迭�� �̷���� ����
		   for(int value:arr1) { // ������ �迭�� ���ϳ��� ������������ �̷���� �ִ�.
			   System.out.print(value + " ");
		   }
		   System.out.println();
	   }
	    
	   System.out.println("============== ������ for ���� variableArr ================ ");
	    
	   for(int[] arr2 : variableArr ) { // �������迭�� ������ ������ �迭�� �̷���� ����
		   for(int value2:arr2) { // ������ �迭�� ���ϳ��� ������������ �̷���� �ִ�.
			   System.out.print(value2 + " ");
		   }
		   System.out.println();
	   }
	
	   System.out.println("============================== ");
	   //������ �迭�� �⺻�� ���� ���(�౸�� ��ȣ���)
	   //��������[][] �迭�� = {{��,,,,},{,,,,,}};
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
