package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

/**
 * �Կ�ͬ��
 * 
 * @author jack
 *
 */
public class GraphicsCard extends Colleague {

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String data) {
		System.out.println("������Ƶ��" + data);
	}
}
