package day0928;

/**
 *	Person 을 부모 클래스로 설정한 HongGilDong 클래스<br>
 * 홍길동은 눈,코,입,이름, 먹는일은 부모의 자원을 사용하용하고
 *  자신만의 특징인 싸움에 관련된 일을 넣는다. 
 * @author owner
 */
public class HongGilDong extends Person {
	private int level;
	
	/**
	 * 홍길동을 생성할 때 사용하는 기본 생성자 싸움 레벨이 6으로 설정
	 */
	public HongGilDong() {
		super(); //부모의 기본생성자
		level=6;
	}//HongGilDong
	
	/**
	 * 싸움하는 일<br>
	 * 이기거나, 비기거나, 지거나의 싸움 결과를 반환
	 * @param yourLevel 상대방 레벨
	 * @return
	 */
	public String fight(int yourLevel) {
		String result="";
		
		if(level > yourLevel) { //이긴 경우
			result="이겼음.  s('. ^)V";
			level++;
			if(level > 10) {
				level=10;
			}//end if
		}else if( level < yourLevel ) {// 진 경우
			result="졌다. OTL";
			level--;
			if(level < 0) {
				level=0;
			}//end if
		}else {//비긴 경우
			result="비겼음. ㅡㅡ+";
		}//end else 
		
		return result;
	}//end fight
	
	@Override
	public String eat(String menu,int price) {
		return getName()+"이(가) 주막에서 " + menu+"인 음식을 "+
				price+"냥 내고 사먹는다.";
	}//eat
}//class






