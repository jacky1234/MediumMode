package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

/**
 * 显卡同事
 * 
 * @author jack
 *
 */
public class GraphicsCard extends Colleague {

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String data) {
		System.out.println("播放视频：" + data);
	}
}
