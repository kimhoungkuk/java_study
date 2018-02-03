package day0928;

/**
 *	사람의 공통특징을 정의하여 만든 부모 클래스<br>
 *	명사적 : 눈,코,입,이름<br>
 *	동사적 : 먹는일<br>
 *	사용법 ) 기본생성자를 사용한 객체화 후 사용<br>
 *			예) Person 객체명=new Person();<br>
 * @author 박줄기
 */
public class Person {
	private int eye,nose,mouth;
	private String name;
	
	
	/**
	 * 사람의 기본 생성자 <br>
	 * 	눈 2개, 코 1개, 입 1개 인 사람 객체 생성
	 */
	public Person() {
		this(2,1,1);
//		eye=2;
//		nose=1;
//		mouth=1;
	}//Person
	
	/**
	 * 인자있는 생성자<br>
	 * 입력되는 눈, 코, 입의 갯수를 가지고 사람 객체를 생성한다.
	 * @param eye	눈의 수
	 * @param nose  코의 수
	 * @param mouth 입의 수
	 */
	public Person(int eye,int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}
	/**
	 * 생성된 사람 객체의 눈을 설정하는 일
	 * @param eye 설정할 눈의 수
	 */
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	/**
	 * 생성된 사람 객체의 코를 설정하는 일
	 * @param nose 설정할 코의 수
	 */
	public void setNose(int nose){
		this.nose=nose;
	}//setNose
	
	/**
	 * 생성된 사람 객체의 입을 설정하는 일
	 * @param mouth 입의 수
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	
	/**
	 * 생성된 사람 객체의 이름을 설정하는 일
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name=name;
	}//setName
	
	/**
	 * 생성된 사람 객체의 설정된 눈 갯수를 반환하는 일
	 * @return 눈의 갯수
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	/**
	 * 	생성된 사람 객체의 설정된 코 갯수를 반환하는 일
	 * @return 코의 갯수
	 */
	public int getNose(){
		return nose;
	}//getNose
	
	
	/**
	 * 생성된 사람 객체의 설정된 입 갯수를 반환하는 일
	 * @return 입의 수
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * 생성된 사람 객체의 설정된 이름을 반환하는 일
	 * @return 설정된 이름
	 */
	public String getName() {
		return name;
	}//getName
	
	
	/**
	 * 생성된 사람 객체가 집에서 밥을 먹는일 
	 * @return 밥을 먹는 행동
	 */
	public String eat() {
		return name+"이(가) 집에서 밥을 먹는다.";
	}//eat
	
	/**
	 * 생성된 사람 객체가 식당에서 밥을 먹는 일
	 * @param menu 음식종류
	 * @param price	음식가격
	 * @return	식당에서 먹는 일
	 */
	public String eat(String menu,int price) {
		return name+"이(가) 식당에서 " + menu+"인 음식을 "+
				price+"원 내고 사먹는다.";
	}//eat
	
}//class




