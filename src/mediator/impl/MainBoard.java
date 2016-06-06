package mediator.impl;

import colleague.Colleague;
import colleague.impl.CDDevice;
import colleague.impl.CPU;
import colleague.impl.GraphicsCard;
import colleague.impl.SoundCard;
import mediator.Mediator;

/**
 * �����н���
 * @author jack
 *
 */
public class MainBoard extends Mediator {
	private CPU cpu;
	private CDDevice cdDevice;
	private GraphicsCard graphicsCard;
	private SoundCard soundCard;
	
	public void changed(Colleague colleague) {
		if (colleague == cdDevice) {
			handleCD();
		}
		
		if (colleague == cpu) {
			handleCPU();
		}
	}
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setCdDevice(CDDevice cdDevice) {
		this.cdDevice = cdDevice;
	}

	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}



	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}



	/*
	 *���� cpu �����������豸�Ľ��� 
	 */
	private void handleCPU() {
		graphicsCard.videoPlay(cpu.getDataVideo());
		soundCard.soundPlay(cpu.getDataSound());
	}

	/**
	 * ���������ȡ���ݺ��������豸�Ľ���
	 */
	private void handleCD() {
		cpu.decodeData(cdDevice.getData());
	}

}
