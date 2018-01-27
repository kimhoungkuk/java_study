package day0127_am;

/**
 * JDK1.5���� �߰��� ���
 * @author kimhk0
 *
 */
public class UseVariableArguments {
	
	/**
	 * ���������� ����<br>
	 * ȣ��) ȣ��� �Է°��� ���������� ���� �� �ִ�.<br>
	 * vaMethod();<br>
	 * vaMethod(1);<br>
	 * vaMethod(1,2,3,4);<br>
	 * vaMethod(1,2,3............x);<br>
	 * @param param
	 */
	public void vaMethod(int ...param) {
		
		for(int i=0;i<param.length;i++) {
			System.out.println(param[i]); // V.A�� �Էµ� ��� �� ���
		}//end for
		
	} // vaMethod
	
	//V.A�� �������� �Ű������� ���� ���Ǹ�  ���� ���������� ����
/*    protected void test(int i, char ... c, String s) { // Error
*/    	
    protected void test(int i, String s, char ... c) { // OK
    	
    }
    
	public static void main(String[] args) {
		UseVariableArguments uva = new UseVariableArguments();
		/*uva.vaMethod();*/
		uva.vaMethod(2018,1,27,11,42);
		uva.test(1, "�ȳ�", 'A','B','��');
		System.out.println("-----------------------------------------------");
		System.out.printf("[%d][%4d][%-4d]\n",12,12,12);
		System.out.printf("[%f][%5.2f][%-7.2f]\n",1.2345,1.2345,1.2345);		
		System.out.format("������%d�⵵%d��%d�� %c����(%s)�Դϴ�.\n", 2018,1,27,'��',"�p����");
		System.out.println("������\t�����\n�Դϴ�.");
	} //main
	
} //class
