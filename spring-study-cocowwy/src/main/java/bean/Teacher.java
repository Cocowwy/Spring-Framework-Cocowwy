package bean;

import java.util.List;

/**
 * @author Cocowwy
 * @create 2021-08-08-18:29
 */
public class Teacher {
	private String name;

	private List<Student> students;

	private String teacherNo;

	public Teacher() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
}
