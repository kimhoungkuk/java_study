package day0928;

public class UsePerson {

	public static void main(String[] args) {

		HongGilDong gildong=new HongGilDong();
		Clark superman=new Clark();
		
		gildong.setName("ȫ�浿");
		superman.setName("Ŭ�� ��Ʈ");
		
		System.out.println( gildong.getName()+"�� �� "+ 
		 gildong.getEye()+"�� �� "+ gildong.getNose()+"�� �� "+
				gildong.getMouth());
		System.out.println( superman.getName()+"�� �� "+ 
				superman.getEye()+"�� �� "+ superman.getNose()+"�� �� "+
				superman.getMouth());
		
		System.out.println(gildong.fight(5));//6->7
		System.out.println(gildong.fight(6));//7->8
		System.out.println(gildong.fight(8));//8
		System.out.println(gildong.fight(9));//8->7
		
		System.out.println(superman.power("¯��")+"/ "+superman.power);
		System.out.println(superman.power("ũ���䳪��Ʈ")+"/ "+superman.power);
		System.out.println(superman.power("���̾Ƹ��")+"/ "+superman.power);
		
		System.out.println( gildong.eat() );
		System.out.println( gildong.eat("����",1) ); //Override
		System.out.println( superman.eat() );//Override
		System.out.println( superman.eat("������ũ",10) );//Override
		
		
	}//main

}//class
