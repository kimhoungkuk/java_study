package day0928;

import java.util.ArrayList;
import java.util.List;

/**
 *	Override���� : <br>
 *	��Ģ : ���������ڴ� ������ ���� �����ڷ� ���� ���� �ϰ�,
 *			��ȯ��, method ��, �Ű������� ���ƾ��Ѵ�.<br>
 * annotation ���� : <br>
 * 		JDK1.5���� ���� �����Ǵ� ���<br>
 * 		@Annotation�� : �����Ϸ����� ����� ���� �� �ִ�.
 * @author owner
 */
public class TestOverride {

	//��ü�� ��µɶ� �ּҰ� �ƴ϶� �ٸ� ���� ����ϰ� �ʹٸ�
	//toString() �� Override �ؾ��Ѵ�.
	@Override
	public String toString() {  //�ڹٴ� ��ҹ��ڸ� �����ϹǷ� method����
		// �ٸ��ٸ� compiler�� Override �� �������� �ʰ� ���ο� method��
		//�����ߴٰ� �Ǵ��Ѵ�.
		return "�ȳ��ϼ���?";
	}
	/**
	 *  ����� ������� å���� ����...
	 */
	@Deprecated
	public void test() {
		System.out.println(" test !!!!");
	}
	// ��� ���ֱ� 
	@SuppressWarnings({ "rawtypes", "unused" })
	public void foo() {
//		@SuppressWarnings("unused") // ���� �� 
		int i;
		List list=new ArrayList();
		
	}
	
	public static void main(String[] args) {
		TestOverride to=new TestOverride();
		System.out.println( to.toString() );
		System.out.println( to );
		
		to.test();
	
		String str=new String("�ȳ��ϼ���?");
		System.out.println( str.toString() );
		System.out.println( str );
		
	}//main
	

}//class
