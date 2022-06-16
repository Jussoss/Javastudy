package AcademicManagement;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * controller -사용자 명령어 받기
 * service - 기능 모음
 * repository - 데이터처리
 * model - Teacher, Course, Student 등의 vo 객체
 */
// 사용자에게 명령어를 받는 SubController 클래스
public class AcademicManagementSubController {
	public AcademicManagementSubController() {

	}

	static ArrayList<TeacherVO> teacherlist = new ArrayList<TeacherVO>();
	static ArrayList<StudentVO> studentlist = new ArrayList<StudentVO>();
	static ArrayList<CourseVO> courselist = new ArrayList<CourseVO>();

	// 타입별로 로그인 하는 메서드
	public static void loginByType(int i) {
		String strId = ""; // 로그인시 필요한 번호 입력받기

		switch (i) {
		case 1: // 교수
			System.out.print(" >> 교번을 입력해주세요 : ");
			strId = AcademicManagementMainController.scanner.next();
			if (!returnMenu(strId.trim())) { // 0을 누르면 이전으로 감
				return;
			}
			checkTeacherId(findTeacher(strId));
			// menuTeacher 추가하기
			break;
		case 2: // 학생
			System.out.print(" >> 학번을 입력해주세요 : ");
			strId = AcademicManagementMainController.scanner.next();
			if (!returnMenu(strId.trim())) {
				return;
			}
			checkStudentId(findStudent(strId));
			break;
		case 3: // 강의 전체 목록조회
			System.out.println("현재 개설된 강의목록 입니다.");
			AcademicManagementMainController am = new AcademicManagementMainController();
			if (!returnMenu(strId.trim())) {
				return;
			}
			am.courseMenu();
			break;
		default:
			System.out.print("잘못 입력 하셨습니다. 번호를 다시 확인해주세요.");
			break;
		}
	}

	// 교수 아이디 체크 메서드
	private static void checkTeacherId(TeacherVO t) {
		// t에 teacherlist 값 넣기

		if (t == null) {
			AcademicManagementMainController.printLine();
			System.out.println("t가 null입니다.\n번호를 다시 확인해주세요.");
			loginByType(1); // 일치하지않으면교번을 다시 입력받음
		} else if (t.getTeacherId() == null) {
			AcademicManagementMainController.printLine();
			System.out.println("일치하는 교번이 없습니다.\n번호를 다시 확인해주세요.");
			loginByType(1);
		} else {
			AcademicManagementMainController.printLine();
			System.out.println(t.getTeacherName() + "님 로그인되셨습니다.");
		}
	}

	// teacherId가 일치하는 클래스가 있을 경우, 해당 클래스를 리턴하는 메서드
	public static TeacherVO findTeacher(String teacherId) {
		Iterator<TeacherVO> itert = ReadByMemberFile.teacherlist.iterator();
		TeacherVO t;
		while (itert.hasNext()) {
			t = itert.next();
			if ((t.getTeacherId().equals(teacherId))) {
				return t;
			}
		}
		return null;
	}

	// teacher 메뉴에서 번호를 선택하는 메서드
	static void teacherSelectNum(int i, TeacherVO t) {
		TeacherVO tl = findTeacherList(t); // 해당 교수관련 정보 출력
		MemberService ci = new MemberService();

		switch (i) {
		case 1:
			ci.teacherAddCourse(tl); // 강의 추가
			break;
		case 2:
			ci.teacherRemoveCourse(tl); // 강의 제거
			break;
		default:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
			break;
		}

	}

	// 로그인 한 해당 교수의 리스트를 출력하는 메서드
	private static TeacherVO findTeacherList(TeacherVO t) {
		if (t != null) {
			for (int i = 0; i < ReadByMemberFile.teacherlist.size(); i++)
				if (ReadByMemberFile.teacherlist.get(i).getTeacherId().equals(t.getTeacherId()))
					return ReadByMemberFile.teacherlist.get(i);
		} else if (t == null) {
			return null;
		}
		return t;
	}

	// 학생 아이디 체크 메서드
	private static void checkStudentId(StudentVO s) {
		if (s == null) {
			AcademicManagementMainController.printLine();
			System.out.println("s가 null입니다.\n번호를 다시 확인해주세요.");
		}
		if (s.getStuId() == null) {
			AcademicManagementMainController.printLine();
			System.out.println("일치하는 학번이 없습니다.\n번호를 다시 확인해주세요.");
		} else {
			AcademicManagementMainController.printLine();
			System.out.println(s.getStuName() + "님 로그인되셨습니다.");
		}
	}

	// stuId가 일치하는 클래스가 있을 경우, 해당 클래스를 리턴하는 메서드
	public static StudentVO findStudent(String stuId) {
		Iterator<StudentVO> iters = ReadByMemberFile.studentlist.iterator();
		StudentVO s;
		while (iters.hasNext()) {
			s = iters.next();
			if ((s.getStuId().equals(stuId))) {
				return s;
			}
		}
		return null;
	}

	// 학생이 강의를 추가, 제거 하는 메서드
	static void studentSelectNum(int i, StudentVO s) {
		StudentVO s2 = findStudentList(s);
		MemberService ci = new MemberService();

		switch (i) {
		case 1:
			ci.studentAddCourse(s2); // 강의 추가
			break;
		case 2:
			ci.studentRemoveCourse(s2); // 강의 제거
			break;
		case 3:
			ci.studentCourseList(s2); // 학생의 수강목록 리스트 조회
			break;
		default:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
			break;
		}
	}

	// 로그인 한 해당 학생의 리스트를 출력하는 메서드
	private static StudentVO findStudentList(StudentVO s) {
		if (s != null) {
			for (int i = 0; i < ReadByMemberFile.studentlist.size(); i++)
				if (ReadByMemberFile.studentlist.get(i).getStuId().equals(s.getStuId()))
					return ReadByMemberFile.studentlist.get(i);
		}
		return null;
	}

	// 0번을 누를경우, 메뉴로 돌아가는 메서드
	private static boolean returnMenu(String str) {
		if (str.equals("0"))
			return false;
		else
			return true;
	}

}
