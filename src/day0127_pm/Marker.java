package day0127_pm;

/**
 * 마카펜을 대상으로 작성한 클래스<br>
 * 명사적특징 : 뚜껑,몸체,색 - 데이터(변수)<br>
 * 동사적특징 : 쓴다 - 동작(method)<br>
 * 일반적인 업무를 구형하기 위해 사용하는 일반클래스 형식으로 작성  <br>
 * 사용) <br>
 * 객체화 : Maker maker = new Maker(); <br>
 * 
 * @author kimhk0
 *
 */
public class Marker {	
	
	private int cap,body;
	private String color;
	
	/**
	 * 생성된 마카펜 객체의 뚜껑갯수 반환하는 일
	 * @return 뚜껑수
	 */
	public int getCap() {
		return cap;
	}
	
	/**
	 * 생성된 마카펜 객체 뚜껑갯수를 설정하는 일
	 * @param cap 설정할 뚜껑의 수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}
	
	/**
	 * 생성된 마카펜 객체의 몸체 갯수를 반환하는 일
	 * @return 몸체 갯수
	 */
	public int getBody() {
		return body;
	}
	
	/**
	 * 생성된 마카펜 객체의 몸체 갯수를 설정하는 일
	 * @param body 설정할 몸체 갯수
	 */
	public void setBody(int body) {
		this.body = body;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 마카펜의 동사적인 특징 구현한 method <br>
	 * parameter로 입력된 메세지를 생성된 색으로 칠판에 쓰는일 구현
	 * @param msg 쓰고자하는 메세지
	 * @return 색을 가지고 메세지 기록결과
	 */
	public String write(String msg) {
		return "칠판에 " + color + " 색인 마카펜으로 \"" + msg + "\" 를 쓴다.";
	}

} //class
