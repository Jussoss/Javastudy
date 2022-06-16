package AcademicManagement;
// �л��� ������ �� �ְ� ���� ����� ��  ����.

import java.util.ArrayList;

// ������ ������ �߰��ϰų� ������ �� ����.
// �������� ���縦 �����ϰų� ������ �� �ְ� �л��� �߰��ϰų� �� �� ����.
// ���â���� �л�, ����, ������ �߰��ϰų� ������ �� �ְ� ���� ��ɵ鵵 ���â���� �����ؾ� ��.
// �л�, ����, ������ ����� ����� �� �ְ� ������ �� ���뵵 ��� �� �� �־�� ��.

// ���� ���� Ŭ����
public class TeacherVO {
	private String teacherId = ""; // ������ȣ
	private String teacherName = ""; // �����̸�
	private ArrayList<CourseVO> courses = new ArrayList<>(); // ����ĥ���ǵ�
	private static ArrayList<TeacherVO> teachers = new ArrayList<>();

	// ������ �޼���
	public TeacherVO() {
	}

	// super() : �ڽ� Ŭ�������� �θ� Ŭ���� ��ü�� �������µ� ����ϴ� ���� ����
	// this() : ���� Ŭ���� ���� ��ü�� �������� ���� ����
	public TeacherVO(String teacherId, String teacherName) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.setCourse(courses);
	}

	// get, set
	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	// courses get, set
	public ArrayList<CourseVO> getCourse() {
		return this.courses;
	}

	public void setCourse(ArrayList<CourseVO> courses) {
		this.courses = courses;
	}

	// ���� �߰�, ����
	public void addCourse(CourseVO course) {
		this.courses.add(course);
	}

	public void removeCourse(CourseVO course) {
		this.courses.remove(course);
	}

	// teachers get, set
	public ArrayList<TeacherVO> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<TeacherVO> teachers) {
		this.teachers = teachers;
	}

	// toString override �θ� Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������
	// Teacher �ν��Ͻ��� ���ڿ��� ��ȯ
	@Override
	public String toString() {
		return "������ȣ : " + getTeacherId() + " �����̸� : " + getTeacherName() + "\t������ ���� : " + getCourse();
	}

} // class Teacher
