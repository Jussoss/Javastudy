package AcademicManagement;

import java.util.Scanner;

// 사용자에게 명령어를 받는 MainController 클래스
public class AcademicManagementMainController {

	public static Scanner scanner = new Scanner(System.in);

	// 메인메뉴 메서드
	public void mainMenu() {
		int i = 0;
		System.out.println("---------------- 메인 메뉴입니다.----------------");
		printLine();
		System.out.println("1. 교수 | 2. 학생 | 3. 강의목록조회 | 0. 종료");
		printLine();
		System.out.print(" >> 진행하고자 하는 번호를 선택해주세요 : ");
		i = scanner.nextInt();
		if (i == 1 || i == 2 || i == 3)
			AcademicManagementSubController.loginByType(i);
		else if (i == 0) {
			System.out.println("종료되었습니다.");
			System.exit(0);
		}
	}



	// 교수 메뉴 메서드
	public static void menuTeacher(TeacherVO t) {
		int i = 0;
		boolean b = false;

		while (!b) {
			printLine();
			System.out.println(" 1.강의 추가 | 2.강의 제거 | 0. 종료");
			printLine();
			System.out.print(" >> 진행하고자 하는 번호를 선택해주세요 : ");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = false;
				return;
			}
			AcademicManagementSubController.teacherSelectNum(i, t);
		}
	}

	// 학생 메뉴 메서드
	public static void menuStudent(StudentVO s) {
		int i = 0;
		boolean b = false;

		while (!b) {
			printLine();
			System.out.println(" 1.강의 추가 | 2.강의 제거 | 3. 신청한 강의목록 조회 | 0. 이전");
			printLine();
			System.out.print(" >> 진행하고자 하는 번호를 선택해주세요 : ");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = false;
				return;
			}
			AcademicManagementSubController.studentSelectNum(i, s);
		}
	}

	// 강의 전체 조회 메서드
	public void courseMenu() {
		ReadByMemberFile mf = new ReadByMemberFile();
		mf.getCourse();
		mf.printCourseList();
		/*
		 * CourseVO c = new CourseVO(); c.PrintCourseInfo();
		 */
	}

	// 라인 출력 메서드
	public static void printLine() {
		System.out.println("==============================================================================");
	}

}
