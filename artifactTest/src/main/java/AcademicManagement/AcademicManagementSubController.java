package AcademicManagement;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * controller -����� ��ɾ� �ޱ�
 * service - ��� ����
 * repository - ������ó��
 * model - Teacher, Course, Student ���� vo ��ü
 */
// ����ڿ��� ��ɾ �޴� SubController Ŭ����
public class AcademicManagementSubController {
	public AcademicManagementSubController() {

	}

	static ArrayList<TeacherVO> teacherlist = new ArrayList<TeacherVO>();
	static ArrayList<StudentVO> studentlist = new ArrayList<StudentVO>();
	static ArrayList<CourseVO> courselist = new ArrayList<CourseVO>();

	// Ÿ�Ժ��� �α��� �ϴ� �޼���
	public static void loginByType(int i) {
		String strId = ""; // �α��ν� �ʿ��� ��ȣ �Է¹ޱ�

		switch (i) {
		case 1: // ����
			System.out.print(" >> ������ �Է����ּ��� : ");
			strId = AcademicManagementMainController.scanner.next();
			if (!returnMenu(strId.trim())) { // 0�� ������ �������� ��
				return;
			}
			checkTeacherId(findTeacher(strId));
			// menuTeacher �߰��ϱ�
			break;
		case 2: // �л�
			System.out.print(" >> �й��� �Է����ּ��� : ");
			strId = AcademicManagementMainController.scanner.next();
			if (!returnMenu(strId.trim())) {
				return;
			}
			checkStudentId(findStudent(strId));
			break;
		case 3: // ���� ��ü �����ȸ
			System.out.println("���� ������ ���Ǹ�� �Դϴ�.");
			AcademicManagementMainController am = new AcademicManagementMainController();
			if (!returnMenu(strId.trim())) {
				return;
			}
			am.courseMenu();
			break;
		default:
			System.out.print("�߸� �Է� �ϼ̽��ϴ�. ��ȣ�� �ٽ� Ȯ�����ּ���.");
			break;
		}
	}

	// ���� ���̵� üũ �޼���
	private static void checkTeacherId(TeacherVO t) {
		// t�� teacherlist �� �ֱ�

		if (t == null) {
			AcademicManagementMainController.printLine();
			System.out.println("t�� null�Դϴ�.\n��ȣ�� �ٽ� Ȯ�����ּ���.");
			loginByType(1); // ��ġ���������鱳���� �ٽ� �Է¹���
		} else if (t.getTeacherId() == null) {
			AcademicManagementMainController.printLine();
			System.out.println("��ġ�ϴ� ������ �����ϴ�.\n��ȣ�� �ٽ� Ȯ�����ּ���.");
			loginByType(1);
		} else {
			AcademicManagementMainController.printLine();
			System.out.println(t.getTeacherName() + "�� �α��εǼ̽��ϴ�.");
		}
	}

	// teacherId�� ��ġ�ϴ� Ŭ������ ���� ���, �ش� Ŭ������ �����ϴ� �޼���
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

	// teacher �޴����� ��ȣ�� �����ϴ� �޼���
	static void teacherSelectNum(int i, TeacherVO t) {
		TeacherVO tl = findTeacherList(t); // �ش� �������� ���� ���
		MemberService ci = new MemberService();

		switch (i) {
		case 1:
			ci.teacherAddCourse(tl); // ���� �߰�
			break;
		case 2:
			ci.teacherRemoveCourse(tl); // ���� ����
			break;
		default:
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			System.exit(0);
			break;
		}

	}

	// �α��� �� �ش� ������ ����Ʈ�� ����ϴ� �޼���
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

	// �л� ���̵� üũ �޼���
	private static void checkStudentId(StudentVO s) {
		if (s == null) {
			AcademicManagementMainController.printLine();
			System.out.println("s�� null�Դϴ�.\n��ȣ�� �ٽ� Ȯ�����ּ���.");
		}
		if (s.getStuId() == null) {
			AcademicManagementMainController.printLine();
			System.out.println("��ġ�ϴ� �й��� �����ϴ�.\n��ȣ�� �ٽ� Ȯ�����ּ���.");
		} else {
			AcademicManagementMainController.printLine();
			System.out.println(s.getStuName() + "�� �α��εǼ̽��ϴ�.");
		}
	}

	// stuId�� ��ġ�ϴ� Ŭ������ ���� ���, �ش� Ŭ������ �����ϴ� �޼���
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

	// �л��� ���Ǹ� �߰�, ���� �ϴ� �޼���
	static void studentSelectNum(int i, StudentVO s) {
		StudentVO s2 = findStudentList(s);
		MemberService ci = new MemberService();

		switch (i) {
		case 1:
			ci.studentAddCourse(s2); // ���� �߰�
			break;
		case 2:
			ci.studentRemoveCourse(s2); // ���� ����
			break;
		case 3:
			ci.studentCourseList(s2); // �л��� ������� ����Ʈ ��ȸ
			break;
		default:
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			System.exit(0);
			break;
		}
	}

	// �α��� �� �ش� �л��� ����Ʈ�� ����ϴ� �޼���
	private static StudentVO findStudentList(StudentVO s) {
		if (s != null) {
			for (int i = 0; i < ReadByMemberFile.studentlist.size(); i++)
				if (ReadByMemberFile.studentlist.get(i).getStuId().equals(s.getStuId()))
					return ReadByMemberFile.studentlist.get(i);
		}
		return null;
	}

	// 0���� �������, �޴��� ���ư��� �޼���
	private static boolean returnMenu(String str) {
		if (str.equals("0"))
			return false;
		else
			return true;
	}

}
