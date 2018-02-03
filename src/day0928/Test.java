package day0928;

import java.awt.Dialog;
import java.awt.Frame;

// 부모클래스의 기본 생성자가 없다면 자식 클래스를 
// 작성하자마자 바로 에러가 발생 
public class Test extends Dialog{
	//자식클래스의 생성자를 정의하고 부모클래스의 
	//기본생성자를 호출하지 않도록 super()를 변경한다. 
	public Test() {
		super(new Frame());
	}
}
