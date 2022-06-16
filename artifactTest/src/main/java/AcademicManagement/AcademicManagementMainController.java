package AcademicManagement;

import java.util.Scanner;

// ����ڿ��� ��ɾ �޴� MainController Ŭ����
public class AcademicManagementMainController {

	public static Scanner scanner = new Scanner(System.in);

	// ���θ޴� �޼���
	public void mainMenu() {
		int i = 0;
		System.out.println("---------------- ���� �޴��Դϴ�.----------------");
		printLine();
		System.out.println("1. ���� | 2. �л� | 3. ���Ǹ����ȸ | 0. ����");
		printLine();
		System.out.print(" >> �����ϰ��� �ϴ� ��ȣ�� �������ּ��� : ");
		i = scanner.nextInt();
		if (i == 1 || i == 2 || i == 3)
			AcademicManagementSubController.loginByType(i);
		else if (i == 0) {
			System.out.println("����Ǿ����ϴ�.");
			System.exit(0);
		}
	}



	// ���� �޴� �޼���
	public static void menuTeacher(TeacherVO t) {
		int i = 0;
		boolean b = false;

		while (!b) {
			printLine();
			System.out.println(" 1.���� �߰� | 2.���� ���� | 0. ����");
			printLine();
			System.out.print(" >> �����ϰ��� �ϴ� ��ȣ�� �������ּ��� : ");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = false;
				return;
			}
			AcademicManagementSubController.teacherSelectNum(i, t);
		}
	}

	// �л� �޴� �޼���
	public static void menuStudent(StudentVO s) {
		int i = 0;
		boolean b = false;

		while (!b) {
			printLine();
			System.out.println(" 1.���� �߰� | 2.���� ���� | 3. ��û�� ���Ǹ�� ��ȸ | 0. ����");
			printLine();
			System.out.print(" >> �����ϰ��� �ϴ� ��ȣ�� �������ּ��� : ");
			i = AcademicManagementMainController.scanner.nextInt();
			if (i == 0) {
				b = false;
				return;
			}
			AcademicManagementSubController.studentSelectNum(i, s);
		}
	}

	// ���� ��ü ��ȸ �޼���
	public void courseMenu() {
		ReadByMemberFile mf = new ReadByMemberFile();
		mf.getCourse();
		mf.printCourseList();
		/*
		 * CourseVO c = new CourseVO(); c.PrintCourseInfo();
		 */
	}

	// ���� ��� �޼���
	public static void printLine() {
		System.out.println("==============================================================================");
	}

}
