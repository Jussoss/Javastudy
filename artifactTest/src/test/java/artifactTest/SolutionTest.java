package artifactTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	@DisplayName("13부터 17까지")
	void FromToTest1() {
		
		Solution s = new Solution();
		assertEquals(43, s.solution(13, 17));
		// 43
	}

	@Test
	@DisplayName("24부터 27까지")
	void FromToTest2() {

		Solution s = new Solution();
		assertEquals(52, s.solution(24, 27));
		// 52
	}

}
