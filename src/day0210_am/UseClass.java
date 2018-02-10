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
		//긴 문자열을 다룰때
		StringBuilder sb = new StringBuilder();
		sb.append("안녕").append("자바").append("!"); // String str="";str="안녕";str+="자바";
		System.out.println(sb);
		
		//수학함수 : Math클래스는 객체화하여 사용하는 클래스가 아님. (생성자가 없음 - 생성자의 접근 지정자가 private 이므로 외부에서 보이지 않는다.)
		//Math m = new Math(); //객체화 할 수 없음
		double randomNumber = Math.random(); //난수 얻기 0.00000000 ~ 16 에서부터 0.9999 ~ 16 까지 발생
		System.out.println(randomNumber);
		System.out.println("범위 (10(0~9)개의 난수)" + randomNumber*10); // 실수존재
		System.out.println("범위 (10(0~9)개의 난수)" + (int)(randomNumber*10));//정수만 얻기
		
		//난수 얻기
		Random r = new Random();//다양한 난수를 얻기위해 사용하는 클래스
		// nextXxx(); 다양한 형태의 난수를 얻을 수 있다.
		System.out.println("불린 : "+r.nextBoolean());
		System.out.println("정수 : "+r.nextInt());
		System.out.println("범위 정수 : "+r.nextInt(10));
		
		//날짜
		//시스템의 날짜
		System.out.println(System.currentTimeMillis()); //프로그램실행시간을 측정할 때도 사용
		
		Date date = new Date();
		//System.out.println(date.getYear() + 1900); 
		//날짜형식을 설정하는 일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss",Locale.US); // 다른 나라의 날짜 형식 : Locale.국가코드
		System.out.println(sdf.format(date)); //날짜객체를 입력하여 보고 싶은 형식의 날짜를 얻는다.
		
		//Calendar - 추상클래스 : 직접 객체화가 되지 않는다.
		//자식클래스를 통해서 객체화 (GregorianCalendar)
		//Calendar cal = new Calendar();
		Calendar cal = new GregorianCalendar();
		//객체(instance)를 얻는 일을 하는 method 호출
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal1);
		//API에 field를 확인할때(Field number for get and set indicating)로 되어있는 것만 .get() 넣어 원하는 날짜를 얻는다.
		System.out.println(cal.get(Calendar.YEAR));
		//월은 0~11월이 나온다. +1하여 사용하는 월과 동일하게 만든다.
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+1);
		
		int i = 1_111_111;
		System.out.println(i);//일기 어려움
		DecimalFormat df = new DecimalFormat("0,000,000,000"); 
		DecimalFormat df1 = new DecimalFormat("#,###,###,###"); 
		System.out.println(df.format(i)); //자리를 맞춰 출력
		System.out.println(df1.format(i)); //데이터만 출력
		//# 해당 자리에 데이터가 없으면 아무것도 표현하지 않음.
		//0 해당 자리에 데이터가 없으면 0을 출력한다.
		
		//파일의 정보 얻기
		File file = new File("C:/week_dev/eclipas.bat");
		try {
			System.out.println("규범경로 : " + file.getCanonicalPath());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("폴더 : " + file.getParent());
			System.out.println("파일명 : " + file.getName());
			System.out.println("수정한날짜 : " + file.lastModified());
			//입력받은 날짜로 날짜를 계산하여 객체 생성
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
