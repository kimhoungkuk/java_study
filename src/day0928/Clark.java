package day0928;

/**
 *	����� �������� �θ𿡼� ������ ����ϰ� �ڽŸ��� Ư¡�� ������
 *  �ڽ� Ŭ����<br>
 *  ���۸��� ���� ���.<br>
 *  Ŭ������ ���� �����ڰ� final�� ��� ��ӵ��� �ʴ´�.<br>
 *  final�� abstract�� ����Ǵ� Ű����� ���� ����� �� ����. 
 * @author owner
 */
public final class Clark extends Person{
	public int power;
	
	public Clark() {
		super(3,1,1);//�θ��� �����ִ� ������
		power=8;
	}//Clark
	
	public String power(String stone) {
		String result="";
			if( stone.equals("ũ���䳪��Ʈ") ) {
				power=0;
				result="���� ����. ~(_-_)~";
			}else if(stone.equals("���̾Ƹ��")) {
				power=10;
				result="�����մϴ�. ^o^";
			}else{
				power=11;
				result="������ ������. �Ѥ�+";				
			}//end else 
		return result;
	}//power
	
	@Override
	public String eat() {
		return getName()+"�� ������ ���� �Դ´�.";
	}//eat
	
	@Override
	public String eat(String menu,int price) {
		return getName()+"�� ����������� "+ menu+"�� ������ "
				+price+"$�� �����ϰ� ��Դ´�.";
	}//eat
	
}//class








