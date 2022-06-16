package AcademicManagement;
// 학생은 수강할 수 있고 수강 취소할 수  있음.

import java.util.ArrayList;

// 선생은 과정을 추가하거나 삭제할 수 있음.
// 과정에는 교사를 셋팅하거나 제거할 수 있고 학생을 추가하거나 뺄 수 있음.
// 명령창에서 학생, 선생, 과정을 추가하거나 삭제할 수 있고 위의 기능들도 명령창에서 동작해야 함.
// 학생, 선생, 과정의 목록을 출력할 수 있고 각각의 상세 내용도 출력 할 수 있어야 함.

// 교수 정보 클래스
public class TeacherVO {
	private String teacherId = ""; // 교수번호
	private String teacherName = ""; // 교수이름
	private ArrayList<CourseVO> courses = new ArrayList<>(); // 가르칠강의들
	private static ArrayList<TeacherVO> teachers = new ArrayList<>();

	// 생성자 메서드
	public TeacherVO() {
	}

	// super() : 자식 클래스에서 부모 클래스 개체를 가져오는데 사용하는 참조 변수
	// this() : 현재 클래스 안의 개체를 가져오는 참조 변수
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

	// 강의 추가, 제거
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

	// toString override 부모 클래스에 있는 메소드를 자식 클래스에서 재정의
	// Teacher 인스턴스의 문자열을 반환
	@Override
	public String toString() {
		return "교수번호 : " + getTeacherId() + " 교수이름 : " + getTeacherName() + "\t개설한 강의 : " + getCourse();
	}

} // class Teacher
