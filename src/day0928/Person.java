package day0928;

/**
 *	����� ����Ư¡�� �����Ͽ� ���� �θ� Ŭ����<br>
 *	����� : ��,��,��,�̸�<br>
 *	������ : �Դ���<br>
 *	���� ) �⺻�����ڸ� ����� ��üȭ �� ���<br>
 *			��) Person ��ü��=new Person();<br>
 * @author ���ٱ�
 */
public class Person {
	private int eye,nose,mouth;
	private String name;
	
	
	/**
	 * ����� �⺻ ������ <br>
	 * 	�� 2��, �� 1��, �� 1�� �� ��� ��ü ����
	 */
	public Person() {
		this(2,1,1);
//		eye=2;
//		nose=1;
//		mouth=1;
	}//Person
	
	/**
	 * �����ִ� ������<br>
	 * �ԷµǴ� ��, ��, ���� ������ ������ ��� ��ü�� �����Ѵ�.
	 * @param eye	���� ��
	 * @param nose  ���� ��
	 * @param mouth ���� ��
	 */
	public Person(int eye,int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}
	/**
	 * ������ ��� ��ü�� ���� �����ϴ� ��
	 * @param eye ������ ���� ��
	 */
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	/**
	 * ������ ��� ��ü�� �ڸ� �����ϴ� ��
	 * @param nose ������ ���� ��
	 */
	public void setNose(int nose){
		this.nose=nose;
	}//setNose
	
	/**
	 * ������ ��� ��ü�� ���� �����ϴ� ��
	 * @param mouth ���� ��
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	
	/**
	 * ������ ��� ��ü�� �̸��� �����ϴ� ��
	 * @param name ������ �̸�
	 */
	public void setName(String name) {
		this.name=name;
	}//setName
	
	/**
	 * ������ ��� ��ü�� ������ �� ������ ��ȯ�ϴ� ��
	 * @return ���� ����
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	/**
	 * 	������ ��� ��ü�� ������ �� ������ ��ȯ�ϴ� ��
	 * @return ���� ����
	 */
	public int getNose(){
		return nose;
	}//getNose
	
	
	/**
	 * ������ ��� ��ü�� ������ �� ������ ��ȯ�ϴ� ��
	 * @return ���� ��
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * ������ ��� ��ü�� ������ �̸��� ��ȯ�ϴ� ��
	 * @return ������ �̸�
	 */
	public String getName() {
		return name;
	}//getName
	
	
	/**
	 * ������ ��� ��ü�� ������ ���� �Դ��� 
	 * @return ���� �Դ� �ൿ
	 */
	public String eat() {
		return name+"��(��) ������ ���� �Դ´�.";
	}//eat
	
	/**
	 * ������ ��� ��ü�� �Ĵ翡�� ���� �Դ� ��
	 * @param menu ��������
	 * @param price	���İ���
	 * @return	�Ĵ翡�� �Դ� ��
	 */
	public String eat(String menu,int price) {
		return name+"��(��) �Ĵ翡�� " + menu+"�� ������ "+
				price+"�� ���� ��Դ´�.";
	}//eat
	
}//class




