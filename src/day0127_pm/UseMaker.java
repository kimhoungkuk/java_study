package day0127_pm;

/**
 * ��ī�� Ŭ������ ��ü�� ����� ����ϴ� Ŭ����
 * @author kimhk0
 *
 */
public class UseMaker {
	
	/**
	 * Java Application�� ����� ���� �����ϴ� method(�ܵ�����) <br>
	 * VM Arguments - java.exe�� ������ ,<br>
	 *                        ����Ǵ� JVM�� �޸� ũ�� ����<br>
	 *                        java -Xms512 -Xmx1024<br>
	 * Program Arguments - ����Ǵ� Java class�� �Է��ϴ� ��<br>
	 * java UseMaker �ȳ� �ϼ���? 1��27
	 * java UseMaker �� �� �� .......
	 * @param args Program Arguments - ����� �Է��ϴ� ��
	 */
	public static void main(String[] args) {
		// ���� : instance ������ �ʱ�ȭ : �⺻�� ������ = 0,
		// �Ǽ��� : 0.0 , �Ҹ� : false, ������ : \u0000,
		// ������ : class, String, Array : null 
		Marker black /*��ü:��������������*/ = new Marker();
		System.out.println("heap�� �ּ� : "+black);
		System.out.println(black.getCap() + " " + black.getBody() + " " + black.getColor());
		
		// setter method �� ������ ��ü�� �� ����
		black.setCap(1);
		black.setBody(1);
		black.setColor("����");
		
		//getter method �� ������ ��ü�� ������ �� ���
		System.out.println(black.getCap() + " " + black.getBody() + " " + black.getColor());		
		
		//������ Ư¡ ��� (����)
		System.out.println(black.write("�ȳ��ϼ���"));
		
	} // main

} // class
