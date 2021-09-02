package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author Cocowwy
 * @create 2021-08-08-15:07
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor , Ordered {
	/**
	 * 对象实例化之前调用，返回回值是Object类型
	 * 由于这个时候目标对象还未实例化，所以这个返回值可以用来代替原本该生成对象的目标对象的实例(比如代理对象)。
	 * 如果该方法的返回值代替原本该生成的目标对象，
	 * 后续只有postProcessAfterInstantiation方法会调用，其他方法不调用；否则按照正常的流程走
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(beanName + "执行实例化之前的方法【InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation】");
		return null;
	}

	/**
	 * 对象实例化之后调用，此时对象的属性值都是null。
	 * 返回值是决定要不要调用postProcessPropertyValues方法中的一个因素(因为还有一个因素是mbd.getDependencyCheck());
	 * 如果该方法返回false，并且不需要check，那么postProcessPropertyValues就会被忽略不执行；
	 * 如果返回true，postProcessPropertyValues就会被执行
	 * @param bean the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "执行实例化之后的方法【InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation】");
		return true;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
