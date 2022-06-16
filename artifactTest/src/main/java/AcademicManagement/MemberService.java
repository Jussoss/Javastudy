package AcademicManagement;

// ������� ����� �����ϴ� Ŭ����
public class MemberService {
	
	public MemberService() {

	}

	// ������ ���� ���� �޼���
	public void teacherAddCourse(TeacherVO t) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			viewCourseList(); // ���� ��ü ����Ʈ ȣ��
			AcademicManagementMainController.printLine();
			System.out.print("�޴��� ���ư����� 0���� �����ּ���.\n >> �����ϰ��� �ϴ� ���� ��ȣ�� �����ּ���.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("�߸� �����̽��ϴ�. �ٽ� �������ּ���.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.teacherlist.indexOf(t);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "�����Ͻ� ���Ǵ� " + ReadByMemberFile.courselist.get(i).getCourseName()
							+ "�Դϴ�. \n�ش� ������ ������ " + ReadByMemberFile.courselist.get(i).getCredit()
							+ "�Դϴ�.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// ������ ���Ǹ� ���� ���� ����Ʈ�� �߰�
					ReadByMemberFile.teacherlist.get(index).addCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("�̹� �߰��� �����Դϴ�.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// ������ ���� ���� �޼���
	public void teacherRemoveCourse(TeacherVO t) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			teacherCourseList(t); // ������ �߰��� ���� ����Ʈ ȣ��
			AcademicManagementMainController.printLine();
			System.out.print("�޴��� ���ư����� 0���� �����ּ���.\n >> �����ϰ��� �ϴ� ���� ��ȣ�� �����ּ���.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("�߸� �����̽��ϴ�. �ٽ� �������ּ���.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.teacherlist.indexOf(t);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "�����Ͻ� ���Ǵ� " + ReadByMemberFile.courselist.get(i).getCourseName() + "�Դϴ�.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// ������ ���Ǹ� ���� ���� ����Ʈ���� ����
					ReadByMemberFile.teacherlist.get(index)
							.removeCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("���ǰ� ���ŵǾ����ϴ�.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// ������ ���Ǹ���� Ȯ���ϴ� �޼���
	private void teacherCourseList(TeacherVO t) {
		int index = ReadByMemberFile.teacherlist.indexOf(t);
		for (int i = 0; i < ReadByMemberFile.teacherlist.get(index).getCourse().size(); i++) {
			System.out.print("���ǹ�ȣ : " + ReadByMemberFile.teacherlist.get(index).getCourse().get(i).getCourseId()
					+ "\t���� : " + ReadByMemberFile.teacherlist.get(index).getCourse().get(i).getCourseName()
					+ "\t���� : " + ReadByMemberFile.teacherlist.get(index).getCourse().get(i).getCredit());
		}

	}

	// �л��� ������û �޼���
	public void studentAddCourse(StudentVO studentVO) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			viewCourseList(); // ���� ��ü ����Ʈ ȣ��
			AcademicManagementMainController.printLine();
			System.out.print("�޴��� ���ư����� 0���� �����ּ���.\n >> ��û�ϰ��� �ϴ� ���� ��ȣ�� �����ּ���.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("�߸� �����̽��ϴ�. �ٽ� �������ּ���.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.studentlist.indexOf(studentVO);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "�����Ͻ� ���Ǵ� " + ReadByMemberFile.courselist.get(i).getCourseName() + "�Դϴ�.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// ������ ���Ǹ� �л� ���� ����Ʈ�� �߰�
					ReadByMemberFile.teacherlist.get(index).addCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("�̹� �߰��� �����Դϴ�.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// �л��� ���� ������� �޼���
	public void studentRemoveCourse(StudentVO s) {
		int i = 0;
		String str = "";
		boolean b = false;
		while (!b) {
			studentCourseList(s); // �л��� �߰��� ���� ����Ʈ ȣ��
			AcademicManagementMainController.printLine();
			System.out.print("�޴��� ���ư����� 0���� �����ּ���.\n >> �����ϰ��� �ϴ� ���� ��ȣ�� �����ּ���.");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = true;
				return;
			}
			if (i > ReadByMemberFile.courselist.size()) {
				System.out.println("�߸� �����̽��ϴ�. �ٽ� �������ּ���.");
			} else {
				i -= 1;
				int index = ReadByMemberFile.studentlist.indexOf(s);
				if (!Overlap(ReadByMemberFile.courselist.get(i), index)) {
					str = "�����Ͻ� ���Ǵ� " + ReadByMemberFile.courselist.get(i).getCourseName() + "�Դϴ�.";
					AcademicManagementMainController.printLine();
					System.out.println(str);
					AcademicManagementMainController.printLine();
					// ������ ���Ǹ� �л� ���� ����Ʈ���� ����
					ReadByMemberFile.studentlist.get(index)
							.removeCourse(ReadByMemberFile.courselist.get(i));
				} else {
					AcademicManagementMainController.printLine();
					System.out.println("���ǰ� ���ŵǾ����ϴ�.");
					AcademicManagementMainController.printLine();
				}
			}
		}
	}

	// �л��� ���Ǹ���� Ȯ���ϴ� �޼���
	public void studentCourseList(StudentVO s) {
		System.out.println("��û�� ���� ����Դϴ�.");
		int index = ReadByMemberFile.studentlist.indexOf(s);
		for (int i = 0; i < ReadByMemberFile.studentlist.get(index).getCourse().size(); i++) {
			System.out.print("���ǹ�ȣ : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCourseId()
					+ "\t���� : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCourseName()
					+ "\t���� : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCourseTeacher()
					+ "\t���� : " + ReadByMemberFile.studentlist.get(index).getCourse().get(i).getCredit());
		}
	}

	// �ߺ��� ���� ��� ��, return true �ϴ� �޼���
	private boolean Overlap(CourseVO courseVO, int index) {
		if (ReadByMemberFile.studentlist.get(index).getCourse().contains(courseVO))
			return true;
		else
			return false;
	}

	// ���� ��ϵǾ� �ִ� ���� ��ü ����Ʈ ȣ��
	private void viewCourseList() {
		for (int i = 0; i < ReadByMemberFile.courselist.size(); i++) {
			System.out.print((i + 1) + "�� > ");
			ReadByMemberFile.courselist.get(i).PrintCourseInfo();
		}
	}

}
