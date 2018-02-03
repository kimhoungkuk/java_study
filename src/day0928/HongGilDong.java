package day0928;

/**
 *	Person �� �θ� Ŭ������ ������ HongGilDong Ŭ����<br>
 * ȫ�浿�� ��,��,��,�̸�, �Դ����� �θ��� �ڿ��� ����Ͽ��ϰ�
 *  �ڽŸ��� Ư¡�� �ο� ���õ� ���� �ִ´�. 
 * @author owner
 */
public class HongGilDong extends Person {
	private int level;
	
	/**
	 * ȫ�浿�� ������ �� ����ϴ� �⺻ ������ �ο� ������ 6���� ����
	 */
	public HongGilDong() {
		super(); //�θ��� �⺻������
		level=6;
	}//HongGilDong
	
	/**
	 * �ο��ϴ� ��<br>
	 * �̱�ų�, ���ų�, ���ų��� �ο� ����� ��ȯ
	 * @param yourLevel ���� ����
	 * @return
	 */
	public String fight(int yourLevel) {
		String result="";
		
		if(level > yourLevel) { //�̱� ���
			result="�̰���.  s('. ^)V";
			level++;
			if(level > 10) {
				level=10;
			}//end if
		}else if( level < yourLevel ) {// �� ���
			result="����. OTL";
			level--;
			if(level < 0) {
				level=0;
			}//end if
		}else {//��� ���
			result="�����. �Ѥ�+";
		}//end else 
		
		return result;
	}//end fight
	
	@Override
	public String eat(String menu,int price) {
		return getName()+"��(��) �ָ����� " + menu+"�� ������ "+
				price+"�� ���� ��Դ´�.";
	}//eat
}//class






