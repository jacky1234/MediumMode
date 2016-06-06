package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

/**
 * ����ͬ��
 * @author jack
 *
 */
public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void soundPlay(String data) {
		System.out.println("������Ƶ��" + data);
	}
}
