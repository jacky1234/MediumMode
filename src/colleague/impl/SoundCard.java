package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

/**
 * Éù¿¨Í¬ÊÂ
 * @author jack
 *
 */
public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void soundPlay(String data) {
		System.out.println("²¥·ÅÒôÆµ£º" + data);
	}
}
