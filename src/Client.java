import colleague.Colleague;
import colleague.impl.CDDevice;
import colleague.impl.CPU;
import colleague.impl.GraphicsCard;
import colleague.impl.SoundCard;
import mediator.Mediator;
import mediator.impl.MainBoard;

public class Client {
	public static void main(String[] args) {
		//构造主板对象
		MainBoard mainBoard = new MainBoard();
		
		//分别构造各个零部件
		CDDevice cd = new CDDevice(mainBoard);
		CPU cpu = new CPU(mainBoard);
		GraphicsCard graphic = new GraphicsCard(mainBoard);
		SoundCard sound = new SoundCard(mainBoard);
		
		//将各个零部件安装到主板
		mainBoard.setCpu(cpu);
		mainBoard.setCdDevice(cd);
		mainBoard.setGraphicsCard(graphic);
		mainBoard.setSoundCard(sound);
		
		//放片
		cd.load();
	}
}
