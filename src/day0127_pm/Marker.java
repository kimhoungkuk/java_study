package day0127_pm;

/**
 * ��ī���� ������� �ۼ��� Ŭ����<br>
 * �����Ư¡ : �Ѳ�,��ü,�� - ������(����)<br>
 * ������Ư¡ : ���� - ����(method)<br>
 * �Ϲ����� ������ �����ϱ� ���� ����ϴ� �Ϲ�Ŭ���� �������� �ۼ�  <br>
 * ���) <br>
 * ��üȭ : Maker maker = new Maker(); <br>
 * 
 * @author kimhk0
 *
 */
public class Marker {	
	
	private int cap,body;
	private String color;
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ����� ��ȯ�ϴ� ��
	 * @return �Ѳ���
	 */
	public int getCap() {
		return cap;
	}
	
	/**
	 * ������ ��ī�� ��ü �Ѳ������� �����ϴ� ��
	 * @param cap ������ �Ѳ��� ��
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ ��ȯ�ϴ� ��
	 * @return ��ü ����
	 */
	public int getBody() {
		return body;
	}
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ �����ϴ� ��
	 * @param body ������ ��ü ����
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
	 * ��ī���� �������� Ư¡ ������ method <br>
	 * parameter�� �Էµ� �޼����� ������ ������ ĥ�ǿ� ������ ����
	 * @param msg �������ϴ� �޼���
	 * @return ���� ������ �޼��� ��ϰ��
	 */
	public String write(String msg) {
		return "ĥ�ǿ� " + color + " ���� ��ī������ \"" + msg + "\" �� ����.";
	}

} //class
