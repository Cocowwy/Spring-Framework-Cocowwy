package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author Cocowwy
 * @create 2021-08-08-13:38
 */
public class Student implements BeanNameAware, EnvironmentAware,
		InstantiationAwareBeanPostProcessor, BeanPostProcessor {
	private String name;

	private String studentNo;

	private String sex;

	public Student() {
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", studentNo='" + studentNo + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("执行Student类的BeanNameAware接口方法，获取到的beanName为：" + name);
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("执行Student类的EnvironmentAware接口方法");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("Student实例化之前执行的方法，实现接口InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("Student实例化之后的方法，实现接口InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation");
		return true;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Student初始化之前执行的方法，实现接口BeanPostProcessor#postProcessBeforeInitialization" );
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Student初始化之后执行的方法，实现接口BeanPostProcessor#postProcessAfterInitialization");
		return bean;
	}
}
