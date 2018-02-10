package day0210_pm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UseCollection {
	
	public UseCollection() {
		
		//List : �����Է�, �ߺ� �� �Է°���, �˻� ���
		List<String> list = new ArrayList<String>();
		
		//Set: ���� �Է� X, �ߺ� �� �ԷºҰ���, �˻� ����� ����.
		//�˻������ҷ��� Iterator ���
		Set<String> set = new HashSet<String>();
		
		//�� �߰�
		list.add("������");// 0
		list.add("�����");// 1
		list.add("�Դϴ�.");// 2
		list.add("^o^");// 3
		list.add("!!!");// 4
		
		//��ü�� ����ϸ� Object class�� toString() method �� ȣ�� �Ǿ� ��ü�� �ּҰ� �����ų� Override(Overring) �ߴٸ� �ּҰ� �ƴ� ���� ��ȯ�ȴ�.
		System.out.println(list); 
		
		set.add("������");// 0
		set.add("�����");// 1
		set.add("�Դϴ�.");// 2
		set.add("^o^");// 3
		set.add("!!!");// 4
		
		System.out.println(set); 		
		
		System.out.println("========== �ߺ� üũ =========="); 		
		
		list.add("�����");
		set.add("�����");
		
		System.out.println("list �ߺ����� X : " + list); 
		System.out.println("set �ߺ����� O : " + set); 		
				
		System.out.println("list ũ�� : " + list.size()); 
		System.out.println("set ũ�� : " + set.size()); 		

		System.out.println("========== �� ���� =========="); 		
		
		list.remove("�����"); //�ߺ����� ���� ������ ���ʿ��� ���������� �����ϸ鼭 ó�� ��ġ�ϴ� ���� ����
		set.remove("�����");
		
		System.out.println(list); 
		System.out.println(set); 		
				
		System.out.println("���� �� list ũ�� : " + list.size()); 
		System.out.println("���� �� set ũ�� : " + set.size()); 		
		
		System.out.println("========== List �� ��� =========="); 		
		
		//System.out.println(list.get(0)); 
		//System.out.println(set.get(0)); �� ��ȸ ��ɾ���
		for(int i=0;i < list.size();i++) {
			System.out.println(list.get(i));
		}// end for
		
		System.out.println("========== Set �� ��� =========="); 		
		
		//Iterator�� ����Ͽ� �� ���, hasNext() - ��Ұ� �ִ��� �Ǵ�, next() ���� ��Ҹ� ������ �� �� �����͸� ���� ��ҷ� �̵�
		Iterator<String> ita = set.iterator(); //Iterator�� ����� �̾� 
		while(ita.hasNext()) {//��Ұ� �����ϴ��� �Ǵ�
			System.out.println(ita.next()); //���� ��� ���� ������ �̵�
		}// end while
		
	}//UseCollection
	
	public static void main(String[] args) {
		new UseCollection();
	}// main
	
}// class
