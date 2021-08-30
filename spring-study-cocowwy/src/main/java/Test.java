import bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cocowwy
 * @create 2021-08-08-17:28
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("=======spring容器开始==========");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
