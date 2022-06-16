package AcademicManagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("수강신청 테스트")
class AcademicManagementTest {
	/*
	 * @Test
	 * 
	 * @DisplayName("멤버 전체 정보 가져오기") void allMember() { ReadByMemberFile rmf = new
	 * ReadByMemberFile(); rmf.getTeacher(); rmf.printTeacherList();
	 * 
	 * rmf.getStudent(); rmf.printStudentList();
	 * 
	 * rmf.getCourse(); rmf.printCourseList(); }
	 */

	@Test

	@DisplayName("수강신청 테스트")
	void test1() {
		AcademicManagementMainController am = new AcademicManagementMainController();

		am.mainMenu();

	}

	/*
	 * @Test
	 * 
	 * @DisplayName("교수의 강의 추가") void test2() {
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("교수의 강의 제거") void test3() {
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("학생의 강의 추가") void test4() {
	 * 
	 * @Test
	 * 
	 * @DisplayName("학생의 강의 제거") void test5() {
	 * 
	 * }
	 */
}
