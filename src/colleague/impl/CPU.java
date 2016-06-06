package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

/**
 * cpuͬ��
 * 
 * @author jack
 *
 */
public class CPU extends Colleague {
	private String dataVideo, dataSound;	//��Ƶ����Ƶ����

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
	 * ��������
	 * 
	 * @param data
	 */
	public void decodeData(String data) {
		String tmp[] = data.split(",");
		
		dataVideo = tmp[0];
		dataSound = tmp[1];
		
		//�����н���״̬�ı�
		mediator.changed(this);
	}
}
