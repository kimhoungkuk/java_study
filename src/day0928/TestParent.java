package day0928;

public class TestParent {
	public int i;
	int j;
	private int k;
	
	public TestParent() {
		System.out.println("부모의 생성자");
	}//TestParent
	
	public void pMethod() {
		System.out.println("부모의 method i ="+i+", j= "+ j+", k= "+k);
	}//pMethod
}
