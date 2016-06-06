package mediator;
import colleague.Colleague;

/**
 * 抽象中介者
 * @author jack
 *
 */
public abstract class Mediator {
	/**
	 * 同事对象改变时通知中介者的方法
	 * 在同事对象改变时有中介者去通知其他的对象同事
	 * 
	 * @param colleague
	 */
	public abstract void changed(Colleague colleague);
}
