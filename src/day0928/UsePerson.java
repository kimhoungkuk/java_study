package day0928;

public class UsePerson {

	public static void main(String[] args) {

		HongGilDong gildong=new HongGilDong();
		Clark superman=new Clark();
		
		gildong.setName("홍길동");
		superman.setName("클락 켄트");
		
		System.out.println( gildong.getName()+"은 눈 "+ 
		 gildong.getEye()+"개 코 "+ gildong.getNose()+"개 입 "+
				gildong.getMouth());
		System.out.println( superman.getName()+"는 눈 "+ 
				superman.getEye()+"개 코 "+ superman.getNose()+"개 입 "+
				superman.getMouth());
		
		System.out.println(gildong.fight(5));//6->7
		System.out.println(gildong.fight(6));//7->8
		System.out.println(gildong.fight(8));//8
		System.out.println(gildong.fight(9));//8->7
		
		System.out.println(superman.power("짱돌")+"/ "+superman.power);
		System.out.println(superman.power("크립토나이트")+"/ "+superman.power);
		System.out.println(superman.power("다이아몬드")+"/ "+superman.power);
		
		System.out.println( gildong.eat() );
		System.out.println( gildong.eat("국밥",1) ); //Override
		System.out.println( superman.eat() );//Override
		System.out.println( superman.eat("스테이크",10) );//Override
		
		
	}//main

}//class
