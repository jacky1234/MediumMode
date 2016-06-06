package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

/**
 * cpu同事
 * 
 * @author jack
 *
 */
public class CPU extends Colleague {
	private String dataVideo, dataSound;	//视频和音频数据

	public CPU(Mediator mediator) {
		super(mediator);
	}
	
	

	public String getDataVideo() {
		return dataVideo;
	}



	public String getDataSound() {
		return dataSound;
	}



	/**
	 * 解码数据
	 * 
	 * @param data
	 */
	public void decodeData(String data) {
		String tmp[] = data.split(",");
		
		dataVideo = tmp[0];
		dataSound = tmp[1];
		
		//告诉中介者状态改变
		mediator.changed(this);
	}
}
