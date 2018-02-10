package day0210_am;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;

public class UseClass {
	
	public UseClass() {
		//�� ���ڿ��� �ٷ궧
		StringBuilder sb = new StringBuilder();
		sb.append("�ȳ�").append("�ڹ�").append("!"); // String str="";str="�ȳ�";str+="�ڹ�";
		System.out.println(sb);
		
		//�����Լ� : MathŬ������ ��üȭ�Ͽ� ����ϴ� Ŭ������ �ƴ�. (�����ڰ� ���� - �������� ���� �����ڰ� private �̹Ƿ� �ܺο��� ������ �ʴ´�.)
		//Math m = new Math(); //��üȭ �� �� ����
		double randomNumber = Math.random(); //���� ��� 0.00000000 ~ 16 �������� 0.9999 ~ 16 ���� �߻�
		System.out.println(randomNumber);
		System.out.println("���� (10(0~9)���� ����)" + randomNumber*10); // �Ǽ�����
		System.out.println("���� (10(0~9)���� ����)" + (int)(randomNumber*10));//������ ���
		
		//���� ���
		Random r = new Random();//�پ��� ������ ������� ����ϴ� Ŭ����
		// nextXxx(); �پ��� ������ ������ ���� �� �ִ�.
		System.out.println("�Ҹ� : "+r.nextBoolean());
		System.out.println("���� : "+r.nextInt());
		System.out.println("���� ���� : "+r.nextInt(10));
		
		//��¥
		//�ý����� ��¥
		System.out.println(System.currentTimeMillis()); //���α׷�����ð��� ������ ���� ���
		
		Date date = new Date();
		//System.out.println(date.getYear() + 1900); 
		//��¥������ �����ϴ� ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss",Locale.US); // �ٸ� ������ ��¥ ���� : Locale.�����ڵ�
		System.out.println(sdf.format(date)); //��¥��ü�� �Է��Ͽ� ���� ���� ������ ��¥�� ��´�.
		
		//Calendar - �߻�Ŭ���� : ���� ��üȭ�� ���� �ʴ´�.
		//�ڽ�Ŭ������ ���ؼ� ��üȭ (GregorianCalendar)
		//Calendar cal = new Calendar();
		Calendar cal = new GregorianCalendar();
		//��ü(instance)�� ��� ���� �ϴ� method ȣ��
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal1);
		//API�� field�� Ȯ���Ҷ�(Field number for get and set indicating)�� �Ǿ��ִ� �͸� .get() �־� ���ϴ� ��¥�� ��´�.
		System.out.println(cal.get(Calendar.YEAR));
		//���� 0~11���� ���´�. +1�Ͽ� ����ϴ� ���� �����ϰ� �����.
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+1);
		
		int i = 1_111_111;
		System.out.println(i);//�ϱ� �����
		DecimalFormat df = new DecimalFormat("0,000,000,000"); 
		DecimalFormat df1 = new DecimalFormat("#,###,###,###"); 
		System.out.println(df.format(i)); //�ڸ��� ���� ���
		System.out.println(df1.format(i)); //�����͸� ���
		//# �ش� �ڸ��� �����Ͱ� ������ �ƹ��͵� ǥ������ ����.
		//0 �ش� �ڸ��� �����Ͱ� ������ 0�� ����Ѵ�.
		
		//������ ���� ���
		File file = new File("C:/week_dev/eclipas.bat");
		try {
			System.out.println("�Թ���� : " + file.getCanonicalPath());
			System.out.println("������ : " + file.getAbsolutePath());
			System.out.println("���� : " + file.getParent());
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("�����ѳ�¥ : " + file.lastModified());
			//�Է¹��� ��¥�� ��¥�� ����Ͽ� ��ü ����
			Date fileDate = new Date(file.lastModified());
			System.out.println(new SimpleDateFormat("MM-dd-yyyy EEEE a hh:mm:ss").format(fileDate));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//UseClass 
	
	public static void main(String[] args) {
		new UseClass();
	}// main
	
}// class
