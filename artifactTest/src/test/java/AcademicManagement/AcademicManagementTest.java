package AcademicManagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("������û �׽�Ʈ")
class AcademicManagementTest {
	/*
	 * @Test
	 * 
	 * @DisplayName("��� ��ü ���� ��������") void allMember() { ReadByMemberFile rmf = new
	 * ReadByMemberFile(); rmf.getTeacher(); rmf.printTeacherList();
	 * 
	 * rmf.getStudent(); rmf.printStudentList();
	 * 
	 * rmf.getCourse(); rmf.printCourseList(); }
	 */

	@Test

	@DisplayName("������û �׽�Ʈ")
	void test1() {
		AcademicManagementMainController am = new AcademicManagementMainController();

		am.mainMenu();

	}

	/*
	 * @Test
	 * 
	 * @DisplayName("������ ���� �߰�") void test2() {
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("������ ���� ����") void test3() {
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("�л��� ���� �߰�") void test4() {
	 * 
	 * @Test
	 * 
	 * @DisplayName("�л��� ���� ����") void test5() {
	 * 
	 * }
	 */
}
