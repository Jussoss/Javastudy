package AcademicManagement;

import java.util.ArrayList;

// �л� ���� Ŭ����
public class StudentVO {
	private String stuId = ""; // �л���ȣ
	private String stuName = ""; // �л��̸�
	private String major = ""; // ����
	private ArrayList<CourseVO> courses = new ArrayList<>(); // �������ǵ�

	// ������ �޼���
	public StudentVO(String stuId, String stuName, String major, int type) {
	}

	// �й�, �̸�, ����
	public StudentVO(String stuId, String stuName, String major) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.major = major;
		this.setCourseList(courses);
	}

//  id, name, major
	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// courses get, set
	public ArrayList<CourseVO> getCourse() {
		return this.courses;
	}

	public void setCourseList(ArrayList<CourseVO> courses) {
		this.courses = courses;
	}

	// ���� �߰�, ����
	public void addCourse(CourseVO course) {
		this.courses.add(course);
	}

	public void removeCourse(CourseVO course) {
		this.courses.remove(course);
	}

	@Override
	public String toString() {
		return "�л���ȣ : " + getStuId() + " �л��̸� : " + getStuName() + " ���� : " + getMajor() + "\t������ ���� : " + getCourse();
	}

} // class Student
