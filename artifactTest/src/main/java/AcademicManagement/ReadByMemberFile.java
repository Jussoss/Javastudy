package AcademicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 멤버별로 파일을 읽어오는 클래스
public class ReadByMemberFile {
	private BufferedReader br;
	private BufferedReader br2;
	private BufferedReader br3;
	
	// 타입별로 담을 수 있는 arrayList 객체 생성
	static ArrayList<TeacherVO> teacherlist = new ArrayList<TeacherVO>();
	static ArrayList<StudentVO> studentlist = new ArrayList<StudentVO>();
	static ArrayList<CourseVO> courselist = new ArrayList<CourseVO>();
	static File tf = new File("C:\\Users\\lsz12\\project\\Javastudy\\Java\\Teacher.txt");
	static File sf = new File("C:\\Users\\lsz12\\project\\Javastudy\\Java\\Student.txt");
	static File cf = new File("C:\\Users\\lsz12\\project\\Javastudy\\Java\\Course.txt");

	public ArrayList<TeacherVO> getTeacher() {
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(tf), "UTF-8"));
			String str = br.readLine();

			while (str != null) {
				str = br.readLine(); // 한 줄 씩 읽어오기
				String[] strArray = str.split("\t"); // 데이터 자르기
				// arrayList 형식의 teacherList 변수에 넣기 위해 add 함수 사용
				teacherlist.add(new TeacherVO(strArray[0], strArray[1]));
			}

		} catch (NullPointerException e) { // null이 있을 경우
			e.getStackTrace();
		} catch (FileNotFoundException e) { // 파일을 찾을 수 없는 경우
			e.getStackTrace();
		} catch (IOException e) { // 파일 읽기 중 에러가 발생한 경우
			e.getStackTrace();
		}
		return teacherlist;
	} // getTeacher()

	// TeacherList 내용 출력하기
	public void printTeacherList() {
		// 향상된 for문 (자료형 변수명 : 배열명)
		for (TeacherVO teacherVO : teacherlist) {
			System.out.println(teacherVO);
		}
	} // printItemList


	// Student 파일 읽어오는 메서드
	public ArrayList<StudentVO> getStudent() {
		try {
			br2 = new BufferedReader(new InputStreamReader(new FileInputStream(sf), "UTF-8"));
			String str = br2.readLine();

			while (str != null) {
				str = br2.readLine(); // 한 줄 씩 읽어오기
				String[] strArray = str.split("\t"); // 데이터 자르기
				// arrayList 형식의 teacherList 변수에 넣기 위해 add 함수 사용
				studentlist.add(new StudentVO(strArray[0], strArray[1], strArray[2]));
			}

		} catch (NullPointerException e) { // null이 있을 경우
			e.getStackTrace();
		} catch (FileNotFoundException e) { // 파일을 찾을 수 없는 경우
			e.getStackTrace();
		} catch (IOException e) { // 파일 읽기 중 에러가 발생한 경우
			e.getStackTrace();
		}
		return studentlist;
	} // getStudent()

	// StudentList 내용 출력하기
	public void printStudentList() {
		// 향상된 for문 (자료형 변수명 : 배열명)
		for (StudentVO studentVO : studentlist) {
			System.out.println(studentVO);
		}
	} // printItemList


	// Course 파일 읽어오는 메서드
	public ArrayList<CourseVO> getCourse() {
		try {
			br3 = new BufferedReader(new InputStreamReader(new FileInputStream(cf), "UTF-8"));
			String str = br3.readLine();

			while (str != null) {
				str = br3.readLine(); // 한 줄 씩 읽어오기
				String[] strArray = str.split("\t"); // 데이터 자르기
				// arrayList 형식의 teacherList 변수에 넣기 위해 add 함수 사용
				courselist.add(new CourseVO(strArray[0], strArray[1], strArray[2], strArray[3]));
			}

		} catch (NullPointerException e) { // null이 있을 경우
			e.getStackTrace();
		} catch (FileNotFoundException e) { // 파일을 찾을 수 없는 경우
			e.getStackTrace();
		} catch (IOException e) { // 파일 읽기 중 에러가 발생한 경우
			e.getStackTrace();
		}
		return courselist;
	} // getCourse()

	// CourseList 내용 출력하기
	public void printCourseList() {
		// 향상된 for문 (자료형 변수명 : 배열명)
		for (CourseVO courseVO : courselist) {
			System.out.println(courseVO);
		}
	} // printCourseList
} // class TeacherFileReader
