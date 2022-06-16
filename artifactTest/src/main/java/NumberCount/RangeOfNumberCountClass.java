package NumberCount;

/*
 * ���� ��(���Ԥ�), �� ��(����x), ��ȸ ��� ���� �Է� �޾Ƽ� ���� �� ���� �� �� ������ �������� 
 * ��ȸ ��� ���� �� �� �������� count �ؼ� return �ϴ� �Լ� �ۼ��ϱ�
 * 
 * junit ��� �ʼ�
 * String, ArrayList, list, util ��� ����. ���ڵ��ϱ�.
 */

// ������ ���ڸ� count�ϴ� Ŭ����
public class RangeOfNumberCountClass {
	/*
	 * ������ ���ڰ� 8�ڸ��� �� ��ȸ ��� ���� 2�ڸ��̸�, ã�� ����� ���� 7�� / ex. 15421542 8�ڸ��� ���� ���� ��, 54��
	 * ã�´�. ���ڸ����� ��. �� 7�� ��
	 */

	// ���� ������ �� �������� ���ڸ� ���� count�� targetNumber�� ������ ��� ���ؼ� ��ȯ�ϴ� �޼���
	static int countNumber(int startNum, int endNum, int targetNum) {
		int totalCount = 0;

		for (int i = startNum; i < endNum; i++) {
			totalCount += countTargetNumber(i, targetNum);
		}
		return totalCount;
	}

	// ���� �� �Է� ���� �������� ���ϰ� Ÿ���� ������ ���� �޼���
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

	// ��ȸ ��� ���� �ڸ����� ��ȯ�ϴ� �޼���
	static int getDigitNumber(int targetNum) {
		int digitNum = 0;
		while (targetNum > 0) {
			targetNum /= 10;
			digitNum++;
		}
		return digitNum;
	}

	// �ڸ����� �������� ���ϱ� ���� �ڸ��� *10�� ���ְ� ��ȯ�ϴ� �޼���
	static int getPowerOfTen(int digitNumber) {
		int ten = 1;

		for (int i = 0; i < digitNumber; i++) {
			ten *= 10;
		}
		return ten;
	}

	// ���� ���� �ڸ����� ��ȯ�ϴ� �޼���
	public int digitCountStartNum(int startNum) {
		int digitCountStartNum = 0;

		while (startNum > 0) {
			startNum /= 10;
			digitCountStartNum++;
		}
		return digitCountStartNum;
	}

	// �� ���� �ڸ����� ��ȯ�ϴ� �޼���
	public int digitCountEndNum(int endNum) {
		int digitCountEndNum = 0;

		while (endNum > 0) {
			endNum /= 10;
			digitCountEndNum++;
		}
		return digitCountEndNum;
	}

	// ��ȸ�� ���� �ڸ����� ��ȯ�ϴ� �޼���
	public int digitCountTargetNum(int targetNum) {
		int digitCountTargetNum = 0;

		while (targetNum > 0) {
			targetNum /= 10;
			digitCountTargetNum++;
		}
		return digitCountTargetNum;
	}
}