package day0210_am;

import java.util.Calendar; // Ư�� ��Ű������ Ư�� Ŭ������ ����� ��.
import java.util.Date;
import kr.co.sist.service.Test;
//import java.util.*; // util ��Ű���� ��� byte code (Ŭ����,�������̽�)�� ����  - �ӵ��� �������� �������� ����
//JDK 1.5���� ���� �����ϴ� static import
import static java.lang.Integer.MAX_VALUE;
//method�� static import ���� ������ method ��ȣ()�� ������� �ʴ´�.
import static java.lang.Integer.parseInt;


/**
 * @author kimhk0
 *
 */
public class UseImport {
	
	public static void main(String[] args) {
		Date date = new Date();
		Calendar ca = null;
		
		//���ߵ� project�� �����ϱ� ���� x.jar�� �����Ͽ� �����Ǹ�
		//eclipse������ build path�� �����Ͽ� ����ϰ�
		//service�� ���� classpath�� �����Ͽ� ����Ѵ�.
		Test t = new Test();
		System.out.println(t.toDate());
		System.out.println(t.nowYear());

		//�ٸ� Ŭ������ Constant �� ��� : Ŭ������.�����
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);	
		
		System.out.println(MAX_VALUE);
		
		String today = "10";
		//���ڿ� => ���� Integer.parseInt(���ڿ�);
		int intToday = parseInt(today);
		System.out.println(intToday);
		
	} // main

}// class
