package NumberCount;

/*
 * 시작 수(포함ㅇ), 끝 수(포함x), 조회 대상 수를 입력 받아서 시작 수 부터 끝 수 까지의 구간에서 
 * 조회 대상 수가 몇 번 나오는지 count 해서 return 하는 함수 작성하기
 * 
 * junit 사용 필수
 * String, ArrayList, list, util 사용 금지. 날코딩하기.
 */

// 범위의 숫자를 count하는 클래스
public class RangeOfNumberCountClass {
	/*
	 * 범위의 숫자가 8자리일 때 조회 대상 수가 2자리이면, 찾는 경우의 수는 7개 / ex. 15421542 8자리의 수가 있을 때, 54를
	 * 찾는다. 두자릿수씩 비교. 총 7번 비교
	 */

	// 시작 수부터 끝 수까지의 숫자를 세고 count된 targetNumber의 개수를 모두 더해서 반환하는 메서드
	static int countNumber(int startNum, int endNum, int targetNum) {
		int totalCount = 0;

		for (int i = startNum; i < endNum; i++) {
			totalCount += countTargetNumber(i, targetNum);
		}
		return totalCount;
	}

	// 시작 수 입력 값의 나머지를 구하고 타겟의 갯수를 세는 메서드
	static int countTargetNumber(int startNum, int targetNum) {
		int digitNumber = getDigitNumber(targetNum);
		int powerTen = getPowerOfTen(digitNumber);
		int countTarget = 0;

		while (startNum > 0) {
			if (startNum % powerTen == targetNum) {
				countTarget++;
			}
			startNum /= 10;
		}
		return countTarget;
	}

	// 조회 대상 수의 자릿수를 반환하는 메서드
	static int getDigitNumber(int targetNum) {
		int digitNum = 0;
		while (targetNum > 0) {
			targetNum /= 10;
			digitNum++;
		}
		return digitNum;
	}

	// 자릿수의 나머지를 구하기 위해 자릿수 *10을 해주고 반환하는 메서드
	static int getPowerOfTen(int digitNumber) {
		int ten = 1;

		for (int i = 0; i < digitNumber; i++) {
			ten *= 10;
		}
		return ten;
	}

	// 시작 수의 자릿수를 반환하는 메서드
	public int digitCountStartNum(int startNum) {
		int digitCountStartNum = 0;

		while (startNum > 0) {
			startNum /= 10;
			digitCountStartNum++;
		}
		return digitCountStartNum;
	}

	// 끝 수의 자릿수를 반환하는 메서드
	public int digitCountEndNum(int endNum) {
		int digitCountEndNum = 0;

		while (endNum > 0) {
			endNum /= 10;
			digitCountEndNum++;
		}
		return digitCountEndNum;
	}

	// 조회할 수의 자릿수를 반환하는 메서드
	public int digitCountTargetNum(int targetNum) {
		int digitCountTargetNum = 0;

		while (targetNum > 0) {
			targetNum /= 10;
			digitCountTargetNum++;
		}
		return digitCountTargetNum;
	}
}