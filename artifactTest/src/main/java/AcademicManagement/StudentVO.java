package AcademicManagement;

import java.util.ArrayList;

// 학생 정보 클래스
public class StudentVO {
	private String stuId = ""; // 학생번호
	private String stuName = ""; // 학생이름
	private String major = ""; // 전공
	private ArrayList<CourseVO> courses = new ArrayList<>(); // 들을강의들

	// 생성자 메서드
	public StudentVO(String stuId, String stuName, String major, int type) {
	}

	// 학번, 이름, 전공
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

	// 강의 추가, 제거
	public void addCourse(CourseVO course) {
		this.courses.add(course);
	}

	public void removeCourse(CourseVO course) {
		this.courses.remove(course);
	}

	@Override
	public String toString() {
		return "학생번호 : " + getStuId() + " 학생이름 : " + getStuName() + " 전공 : " + getMajor() + "\t수강한 강의 : " + getCourse();
	}

} // class Student
