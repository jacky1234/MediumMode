package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

public class CDDevice extends Colleague {
	private String data;	//����Ƶ����

	public CDDevice(Mediator mediator) {
		super(mediator);
	}
	
	public String getData() {
		return data;
	}



	public void load(){
		data = "��Ƶ����,��Ƶ����";
		
		//�����н���״̬�ı�
		mediator.changed(this);
	}
}
