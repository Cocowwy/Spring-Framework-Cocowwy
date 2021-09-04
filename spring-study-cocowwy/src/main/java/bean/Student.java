package bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author Cocowwy
 * @create 2021-08-08-13:38
 */
public class Student implements BeanNameAware, EnvironmentAware {
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
		System.out.println("对name属性进行赋值");
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		System.out.println("对studentNo属性进行赋值");
		this.studentNo = studentNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		System.out.println("对sex属性进行赋值");
		this.sex = sex;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("执行Student类的BeanNameAware接口方法");
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("执行Student类的EnvironmentAware接口方法");
	}

}
