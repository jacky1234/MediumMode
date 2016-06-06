package colleague;
import mediator.Mediator;

public abstract class Colleague {
	protected Mediator mediator;//每个同事都应该知道其中介者
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
