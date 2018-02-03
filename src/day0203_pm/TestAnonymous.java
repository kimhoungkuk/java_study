package day0203_pm;

/**
 *	�͸� Ŭ����
 * @author owner
 */
public class TestAnonymous {
	public void test(TestInter ti) {
//		if( ti instanceof InterImpl ) {
//			System.out.println("InterImpl�� ������ ��ü");
//		}else {
//			System.out.println("InterImpl�� �ƴ� ��ü");
//		}//end else
		//�Էµ� ��ü�� InterImpl1�϶����� msg() ȣ��
		if( ti instanceof InterImpl1 ) {
			InterImpl1 ii1=(InterImpl1)ti;
			System.out.println(ii1.msg());
		}//end if
		ti.test();
		ti.test1();
	}//test

	public static void main(String[] args) {
		//1.Ŭ���� ��üȭ
		TestAnonymous ta=new TestAnonymous();
		//2. �Ű������� is a ���踦 ���� Ŭ������ �ۼ����� ��ü ����
		InterImpl ii=new InterImpl();
		//3. method ȣ���� �� is a������ ��ü�� arguments�� �Է�
		ta.test(ii);
		System.out.println("--------------------------------------------------");
		//anonymous inner class�� ó�� : is a ������ Ŭ������ �ۼ��� �ʿ����
		ta.test(new TestInter() {
			@Override
			public void test1() {
				System.out.println("anonymous test1");
			}
			@Override
			public void test() {
				System.out.println("anonymous test");
			}
		});
		System.out.println("------------------------------------------------");
		InterImpl1 ii1=new InterImpl1();
		ta.test(ii1);
	}//main

}//class



