package day0203_am;

/**
 * @author kimhk0
 *
 */
public class UseStringTest {
	
	public UseStringTest() {
		String str = "AbcdEfdG";
		System.out.println(str);
		System.out.println(str + " �� ���ڼ� " + str.length());
		System.out.println(str + " �빮�� " + str.toUpperCase());
		System.out.println(str + " �빮�� " + str.toLowerCase());		
		System.out.println(str + " 'd'�� �ε��� " + str.indexOf("d"));		
		System.out.println(str + " �ڷκ��� 'd'�� �ε��� " + str.lastIndexOf("d"));		
		System.out.println(str + " 'k'�� �ε��� " + str.indexOf("k")); // -1
		System.out.println(str + " ���� 5��° �ε����� ���� " + str.charAt(5)); 
		//System.out.println(str + " ���� 15��° �ε����� ���� " + str.charAt(15)); ���� �߻�
		//AbcdEfdG 
		// ���� ������ ���ڿ� ���ڿ� �� ��ȣ�� ���� ���� ������ ���ε��� + 1 �� ����� �Ѵ�.
		System.out.println(str + " ���� 2 ~ 4 ������ ���ڿ� " + str.substring(2,5)); 
		String temp="����� ���빮�� ���ﵿ";
		System.out.println(temp + " ��(��)  " + (temp.startsWith("����")?"Ư����":"�Ϲݵ���")); 
		temp="��⵵ �����ν�";
		System.out.println(temp + " ��(��)  " + (temp.startsWith("����")?"Ư����":"�Ϲݵ���")); 
		temp="������ ���ﵿ";
		System.out.println(temp + " ��(��)  " + (temp.endsWith("��")?"����":"�ð�")); 
		temp="����� ������";
		System.out.println(temp + " ��(��)  " + (temp.endsWith("��")?"����":"�ð�")); 
		temp="java,oracle,JSP,MyBatis,Spring";
		System.out.println(temp + " ���� 'a'�� ''Test'�� ��ȯ " + temp.replace("a","Test"));
		System.out.println(temp + " ���� 'a'�� ''Test'�� ��ȯ " + temp.replaceAll("a","Test"));
		temp= "   A AA   ";
		System.out.println("[" + temp + "]�� �յڰ��� ���� [" + temp.trim()+"]");
		System.out.println("[" + temp + "]�� ������ ���� [" + temp.replace(" ", "")+"]");
		
	} // UseStringTest
	
	public static void main(String[] args) {
		
		 // ��ü���� �� ��ü������ ����,method�� ������� �ʴ� ��� ��üȭ.
		new UseStringTest();
		// ��ü���� �� ��ü������ ����,method�� ����ϴ� ��� ��üȭ.
		// Ŭ������ ��ü�� = new ������();
		
	}//main
	
}//class
