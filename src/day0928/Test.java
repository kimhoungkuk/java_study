package day0928;

import java.awt.Dialog;
import java.awt.Frame;

// �θ�Ŭ������ �⺻ �����ڰ� ���ٸ� �ڽ� Ŭ������ 
// �ۼ����ڸ��� �ٷ� ������ �߻� 
public class Test extends Dialog{
	//�ڽ�Ŭ������ �����ڸ� �����ϰ� �θ�Ŭ������ 
	//�⺻�����ڸ� ȣ������ �ʵ��� super()�� �����Ѵ�. 
	public Test() {
		super(new Frame());
	}
}
