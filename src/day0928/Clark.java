package day0928;

/**
 *	사람의 공통기능은 부모에서 가져다 사용하고 자신만의 특징을 정의한
 *  자식 클래스<br>
 *  슈퍼맨은 힘이 쎄다.<br>
 *  클래스의 접근 지정자가 final인 경우 상속되지 않는다.<br>
 *  final은 abstract과 상충되는 키워드로 같이 사용할 수 없다. 
 * @author owner
 */
public final class Clark extends Person{
	public int power;
	
	public Clark() {
		super(3,1,1);//부모의 인자있는 생성자
		power=8;
	}//Clark
	
	public String power(String stone) {
		String result="";
			if( stone.equals("크립토나이트") ) {
				power=0;
				result="힘이 빠짐. ~(_-_)~";
			}else if(stone.equals("다이아몬드")) {
				power=10;
				result="감사합니다. ^o^";
			}else{
				power=11;
				result="던지지 마세요. ㅡㅡ+";				
			}//end else 
		return result;
	}//power
	
	@Override
	public String eat() {
		return getName()+"가 집에서 빵을 먹는다.";
	}//eat
	
	@Override
	public String eat(String menu,int price) {
		return getName()+"가 레스토랑에서 "+ menu+"인 음식을 "
				+price+"$를 지불하고 사먹는다.";
	}//eat
	
}//class








