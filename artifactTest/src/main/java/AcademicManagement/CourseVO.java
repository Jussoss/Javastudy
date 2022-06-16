package AcademicManagement;

import java.util.ArrayList;

// 강의 정보 클래스
public class CourseVO {
	private String courseId = ""; // 강의번호
	private String courseName = ""; // 강의이름
	private String credit = ""; // 학점
	private String courseTeacher = ""; // 가르치는 교수
	private ArrayList<StudentVO> students = new ArrayList<>(); // 수강한 학생
	private ArrayList<CourseVO> courses = new ArrayList<>(); // txt에서 입력받은 course 데이터 
	ReadByMemberFile mf = new ReadByMemberFile();
	
	public ArrayList<CourseVO> getCourseData() {
		ArrayList<CourseVO> courses = mf.getCourse();
		return courses;
	}

	// 생성자 메서드
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

	// 강의를 듣는 학생들
	public ArrayList<StudentVO> getStudent() {
		return this.students;
	}

	public void setStudent(ArrayList<StudentVO> students) {
		this.students = students;
	}

	public String PrintCourseInfo() {
		String str = "강의번호 : " + this.courseId + "\t강의이름 : " + this.courseName + "\t교수명 : " + this.courseTeacher;
		return str;
	}
	
	// 강의 데이터 입력받기
	public ArrayList<CourseVO> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<CourseVO> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "강의번호 : " + getCourseId() + "\t강의이름 : " + getCourseName() + "\t학점 : " + getCredit() + "\t교수명 : "
				+ getCourseTeacher() + "\t수강학생 : " + getStudent();
	}


} // class Course
