package mediator;
import colleague.Colleague;

/**
 * �����н���
 * @author jack
 *
 */
public abstract class Mediator {
	/**
	 * ͬ�¶���ı�ʱ֪ͨ�н��ߵķ���
	 * ��ͬ�¶���ı�ʱ���н���ȥ֪ͨ�����Ķ���ͬ��
	 * 
	 * @param colleague
	 */
	public abstract void changed(Colleague colleague);
}
