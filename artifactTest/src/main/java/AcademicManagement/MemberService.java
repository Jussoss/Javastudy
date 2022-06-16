package AcademicManagement;

// 멤버별로 기능을 구현하는 클래스
public class MemberService {
	
	public MemberService() {

	}

	// 교수의 강의 개설 메서드
	public void teacherAddCourse(TeacherVO t) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			viewCourseList(); // 강의 전체 리스트 호출
			AcademicManagementMainController.printLine();
			System.out.print("메뉴로 돌아가려면 0번을 눌러주세요.\n >> 개설하고자 하는 강의 번호를 눌러주세요.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.teacherlist.indexOf(t);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "선택하신 강의는 " + ReadByMemberFile.courselist.get(i).getCourseName()
							+ "입니다. \n해당 강의의 학점은 " + ReadByMemberFile.courselist.get(i).getCredit()
							+ "입니다.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// 선택한 강의를 교수 강의 리스트에 추가
					ReadByMemberFile.teacherlist.get(index).addCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("이미 추가된 강의입니다.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// 교수의 강의 제거 메서드
	public void teacherRemoveCourse(TeacherVO t) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			teacherCourseList(t); // 교수의 추가된 강의 리스트 호출
			AcademicManagementMainController.printLine();
			System.out.print("메뉴로 돌아가려면 0번을 눌러주세요.\n >> 제거하고자 하는 강의 번호를 눌러주세요.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.teacherlist.indexOf(t);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "선택하신 강의는 " + ReadByMemberFile.courselist.get(i).getCourseName() + "입니다.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// 선택한 강의를 교수 강의 리스트에서 제거
					ReadByMemberFile.teacherlist.get(index)
							.removeCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("강의가 제거되었습니다.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// 교수의 강의목록을 확인하는 메서드
	private void teacherCourseList(TeacherVO t) {
		int index = ReadByMemberFile.teacherlist.indexOf(t);
		for (int i = 0; i < ReadByMemberFile.teacherlist.get(index).getCourse().size(); i++) {
			System.out.print("강의번호 : " + ReadByMemberFile.teacherlist.get(index).getCourse().get(i).getCourseId()
					+ "\t강의 : " + ReadByMemberFile.teacherlist.get(index).getCourse().get(i).getCourseName()
					+ "\t학점 : " + ReadByMemberFile.teacherlist.get(index).getCourse().get(i).getCredit());
		}

	}

	// 학생의 수강신청 메서드
	public void studentAddCourse(StudentVO studentVO) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			viewCourseList(); // 강의 전체 리스트 호출
			AcademicManagementMainController.printLine();
			System.out.print("메뉴로 돌아가려면 0번을 눌러주세요.\n >> 신청하고자 하는 강의 번호를 눌러주세요.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.studentlist.indexOf(studentVO);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "선택하신 강의는 " + ReadByMemberFile.courselist.get(i).getCourseName() + "입니다.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// 선택한 강의를 학생 강의 리스트에 추가
					ReadByMemberFile.teacherlist.get(index).addCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("이미 추가된 강의입니다.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// 학생의 강의 수강취소 메서드
	public void studentRemoveCourse(StudentVO s) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			studentCourseList(s); // 학생의 추가된 강의 리스트 호출
			AcademicManagementMainController.printLine();
			System.out.print("메뉴로 돌아가려면 0번을 눌러주세요.\n >> 제거하고자 하는 강의 번호를 눌러주세요.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.studentlist.indexOf(s);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "선택하신 강의는 " + ReadByMemberFile.courselist.get(i).getCourseName() + "입니다.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// 선택한 강의를 학생 강의 리스트에서 제거
					ReadByMemberFile.studentlist.get(index)
							.removeCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("강의가 제거되었습니다.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// 학생의 강의목록을 확인하는 메서드
	public void studentCourseList(StudentVO s) {
		System.out.println("신청한 강의 목록입니다.");
		int index = ReadByMemberFile.studentlist.indexOf(s);
		for (int i = 0; i < ReadByMemberFile.studentlist.get(index).getCourse().size(); i++) {
			System.out.print("강의번호 : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCourseId()
					+ "\t강의 : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCourseName()
					+ "\t교수 : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCourseTeacher()
					+ "\t학점 : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCredit());
		}
	}

	// 중복된 수업 등록 시, return true 하는 메서드
	private boolean Overlap(CourseVO courseVO, int index) {
		if (ReadByMemberFile.studentlist.get(index).getCourse().contains(courseVO))
			return true;
		else
			return false;
	}

	// 현재 등록되어 있는 강의 전체 리스트 호출
	private void viewCourseList() {
		for (int i = 0; i < ReadByMemberFile.courselist.size(); i++) {
			System.out.print((i + 1) + "번 > ");
			ReadByMemberFile.courselist.get(i).PrintCourseInfo();
		}
	}

}
