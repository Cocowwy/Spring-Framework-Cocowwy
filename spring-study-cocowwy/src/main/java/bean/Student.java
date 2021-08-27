package bean;

/**
 * @author Cocowwy
 * @create 2021-08-08-13:38
 */
public class Student {
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
}
