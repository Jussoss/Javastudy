package AcademicManagement;

import java.util.ArrayList;

// ���� ���� Ŭ����
public class CourseVO {
	private String courseId = ""; // ���ǹ�ȣ
	private String courseName = ""; // �����̸�
	private String credit = ""; // ����
	private String courseTeacher = ""; // ����ġ�� ����
	private ArrayList<StudentVO> students = new ArrayList<>(); // ������ �л�
	private ArrayList<CourseVO> courses = new ArrayList<>(); // txt���� �Է¹��� course ������ 
	ReadByMemberFile mf = new ReadByMemberFile();
	
	public ArrayList<CourseVO> getCourseData() {
		ArrayList<CourseVO> courses = mf.getCourse();
		return courses;
	}

	// ������ �޼���
	public CourseVO() {
	}

	public CourseVO(String courseId, String courseName, String credit, String courseTeacher) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
		this.courseTeacher = courseTeacher;
		this.setStudent(students);
	}

	public CourseVO(String courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

//	id, name, credit, teacher
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String id) {
		this.courseId = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	// ���Ǹ� ��� �л���
	public ArrayList<StudentVO> getStudent() {
		return this.students;
	}

	public void setStudent(ArrayList<StudentVO> students) {
		this.students = students;
	}

	public String PrintCourseInfo() {
		String str = "���ǹ�ȣ : " + this.courseId + "\t�����̸� : " + this.courseName + "\t������ : " + this.courseTeacher;
		return str;
	}
	
	// ���� ������ �Է¹ޱ�
	public ArrayList<CourseVO> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<CourseVO> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "���ǹ�ȣ : " + getCourseId() + "\t�����̸� : " + getCourseName() + "\t���� : " + getCredit() + "\t������ : "
				+ getCourseTeacher() + "\t�����л� : " + getStudent();
	}


} // class Course
