package day0928;

public class TestChild extends TestParent{
	
	int ii;
	int i; //�θ�� �̸��� ����.
	public TestChild() {
		System.out.println(" �ڽ��� ������");
	}//TestChild
	
	public void cMethod() {
		super.i=2017; //�θ�Ŭ������ ���� ���.
		System.out.println("�ڽ��� method �θ� i="+ super.i
				+", �ڽ� i ="+ this.i );
	}//cMethod

	@Override
	public void pMethod() {
		System.out.println(" Overriding �� �޼ҵ�");
		super.pMethod(); //�θ�Ŭ������ method ȣ�� ���.
	}//pMethod

	public static void main(String[] args) {
		//�ڽ�Ŭ������ ��üȭ 
		//��� ���� : �θ� (j, pMethod), �ڽ��� ��� �ڿ�
		// �θ���  i�� �ڽĿ� ���� ������ �����ϹǷ� �̸����� �����ϴ� �ڹٿ����� ����� �� ����.
		TestChild tc=new TestChild();
		tc.i=100;//�ڽ�
		tc.ii=1000;//�ڽ�
		tc.j=10000;//�θ�
		tc.pMethod();//�θ�, Override�ϸ� �ڽ��� method�� ȣ��
		tc.cMethod();//�ڽ�
		 System.out.println("--------------------------------------------");
		 // is a ������ ��üȭ (��Ӱ����� ��üȭ)
		 // �θ�Ŭ������ ��ü��=new �ڽĻ�����();
		 //��밡�� : �θ�(i,j,pMethod)
		 
		  TestParent tp=new TestChild();
		  tp.i=200; //�θ�
		  tp.j=2000;//�θ�
		  tp.pMethod();//�θ�, Override�� �ϸ� �ڽ���  method�� ȣ�� 
		
		  //�ڽ�Ŭ������ ������������ ���Ǹ� �θ�Ŭ�����δ� ��ü��
		  //������ �� ����.
//		  TestChild tc1=new TestParent();
		

	}//main

}//class
