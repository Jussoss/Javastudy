package NumberCount;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberCountTest {

	@Test
	@DisplayName("자릿수 갯수 테스트")
	void testGetDigitNumber() {
		assertEquals(2, RangeOfNumberCountClass.getDigitNumber(10));
		assertEquals(3, RangeOfNumberCountClass.getDigitNumber(100));
		assertEquals(4, RangeOfNumberCountClass.getDigitNumber(1000));
		assertEquals(5, RangeOfNumberCountClass.getDigitNumber(10000));
		assertEquals(6, RangeOfNumberCountClass.getDigitNumber(100000));
		assertEquals(7, RangeOfNumberCountClass.getDigitNumber(1000000));
		assertEquals(8, RangeOfNumberCountClass.getDigitNumber(10000000));
	}

	@Test
	@DisplayName("자릿수 테스트")
	void testGetPowerTen() {
		assertEquals(10, RangeOfNumberCountClass.getPowerOfTen(1));
		assertEquals(100, RangeOfNumberCountClass.getPowerOfTen(2));
		assertEquals(1000, RangeOfNumberCountClass.getPowerOfTen(3));
		assertEquals(10000, RangeOfNumberCountClass.getPowerOfTen(4));
	}

	@Test
	@DisplayName("조회 대상이 몇 개인지 테스트")
	void testCountTargetNumber() {
		assertEquals(3, RangeOfNumberCountClass.countTargetNumber(121212, 12));
		assertEquals(2, RangeOfNumberCountClass.countTargetNumber(100001, 1));
		assertEquals(2, RangeOfNumberCountClass.countTargetNumber(524321, 2));
		assertEquals(2, RangeOfNumberCountClass.countTargetNumber(33233223, 32));
	}

	@Test
	@DisplayName("시작 수, 끝 수, 조회 대상 수 테스트")
	void testCountNumber() {
		assertEquals(31, RangeOfNumberCountClass.countNumber(77770, 77780, 77));
	}
}
