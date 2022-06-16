package AcademicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// ������� ������ �о���� Ŭ����
public class ReadByMemberFile {
	private BufferedReader br;
	private BufferedReader br2;
	private BufferedReader br3;
	
	// Ÿ�Ժ��� ���� �� �ִ� arrayList ��ü ����
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
				str = br.readLine(); // �� �� �� �о����
				String[] strArray = str.split("\t"); // ������ �ڸ���
				// arrayList ������ teacherList ������ �ֱ� ���� add �Լ� ���
				teacherlist.add(new TeacherVO(strArray[0], strArray[1]));
			}

		} catch (NullPointerException e) { // null�� ���� ���
			e.getStackTrace();
		} catch (FileNotFoundException e) { // ������ ã�� �� ���� ���
			e.getStackTrace();
		} catch (IOException e) { // ���� �б� �� ������ �߻��� ���
			e.getStackTrace();
		}
		return teacherlist;
	} // getTeacher()

	// TeacherList ���� ����ϱ�
	public void printTeacherList() {
		// ���� for�� (�ڷ��� ������ : �迭��)
		for (TeacherVO teacherVO : teacherlist) {
			System.out.println(teacherVO);
		}
	} // printItemList


	// Student ���� �о���� �޼���
	public ArrayList<StudentVO> getStudent() {
		try {
			br2 = new BufferedReader(new InputStreamReader(new FileInputStream(sf), "UTF-8"));
			String str = br2.readLine();

			while (str != null) {
				str = br2.readLine(); // �� �� �� �о����
				String[] strArray = str.split("\t"); // ������ �ڸ���
				// arrayList ������ teacherList ������ �ֱ� ���� add �Լ� ���
				studentlist.add(new StudentVO(strArray[0], strArray[1], strArray[2]));
			}

		} catch (NullPointerException e) { // null�� ���� ���
			e.getStackTrace();
		} catch (FileNotFoundException e) { // ������ ã�� �� ���� ���
			e.getStackTrace();
		} catch (IOException e) { // ���� �б� �� ������ �߻��� ���
			e.getStackTrace();
		}
		return studentlist;
	} // getStudent()

	// StudentList ���� ����ϱ�
	public void printStudentList() {
		// ���� for�� (�ڷ��� ������ : �迭��)
		for (StudentVO studentVO : studentlist) {
			System.out.println(studentVO);
		}
	} // printItemList


	// Course ���� �о���� �޼���
	public ArrayList<CourseVO> getCourse() {
		try {
			br3 = new BufferedReader(new InputStreamReader(new FileInputStream(cf), "UTF-8"));
			String str = br3.readLine();

			while (str != null) {
				str = br3.readLine(); // �� �� �� �о����
				String[] strArray = str.split("\t"); // ������ �ڸ���
				// arrayList ������ teacherList ������ �ֱ� ���� add �Լ� ���
				courselist.add(new CourseVO(strArray[0], strArray[1], strArray[2], strArray[3]));
			}

		} catch (NullPointerException e) { // null�� ���� ���
			e.getStackTrace();
		} catch (FileNotFoundException e) { // ������ ã�� �� ���� ���
			e.getStackTrace();
		} catch (IOException e) { // ���� �б� �� ������ �߻��� ���
			e.getStackTrace();
		}
		return courselist;
	} // getCourse()

	// CourseList ���� ����ϱ�
	public void printCourseList() {
		// ���� for�� (�ڷ��� ������ : �迭��)
		for (CourseVO courseVO : courselist) {
			System.out.println(courseVO);
		}
	} // printCourseList
} // class TeacherFileReader
