import colleague.Colleague;
import colleague.impl.CDDevice;
import colleague.impl.CPU;
import colleague.impl.GraphicsCard;
import colleague.impl.SoundCard;
import mediator.Mediator;
import mediator.impl.MainBoard;

public class Client {
	public static void main(String[] args) {
		//�����������
		MainBoard mainBoard = new MainBoard();
		
		//�ֱ�������㲿��
		CDDevice cd = new CDDevice(mainBoard);
		CPU cpu = new CPU(mainBoard);
		GraphicsCard graphic = new GraphicsCard(mainBoard);
		SoundCard sound = new SoundCard(mainBoard);
		
		//�������㲿����װ������
		mainBoard.setCpu(cpu);
		mainBoard.setCdDevice(cd);
		mainBoard.setGraphicsCard(graphic);
		mainBoard.setSoundCard(sound);
		
		//��Ƭ
		cd.load();
	}
}
