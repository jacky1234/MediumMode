package colleague;
import mediator.Mediator;

public abstract class Colleague {
	protected Mediator mediator;//ÿ��ͬ�¶�Ӧ��֪�����н���
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
