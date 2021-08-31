package life;

import bean.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author Cocowwy
 * @create 2021-08-08-15:10
 */
public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "执行初始化之前的方法【BeanPostProcessor#postProcessBeforeInitialization】");
		// 从源码可以知道这里就算返回null  spring底层还是能够取到bean对象
		// AbstractAutowireCapableBeanFactory#applyBeanPostProcessorsAfterInitialization
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "执行初始化之后的方法【BeanPostProcessor#postProcessAfterInitialization】");
		Student returnBean = (Student) bean;
		returnBean.setName("BeanPostProcessor#postProcessAfterInitialization");
		return returnBean;
	}

	// BeanPostProcessor 的执行顺序
	@Override
	public int getOrder() {
		return 0;
	}
}
