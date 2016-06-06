package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

public class CDDevice extends Colleague {
	private String data;	//音视频数据

	public CDDevice(Mediator mediator) {
		super(mediator);
	}
	
	public String getData() {
		return data;
	}



	public void load(){
		data = "视频数据,音频数据";
		
		//告诉中介者状态改变
		mediator.changed(this);
	}
}
