package day0203_pm;

public class InterImpl1 implements TestInter {
	@Override
	public void test() {
		System.out.println("InterImpl1 이 구현한 test");
	}
	@Override
	public void test1() {
		System.out.println("InterImpl1 이 구현한 test1");
	}
	public String msg() {
		return "오늘은 화요일 ";
	}
}//class





