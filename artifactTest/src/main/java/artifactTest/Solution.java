package artifactTest;

// ���� ���� : �� ���� left�� right�� �Ű������� �־����ϴ�. 
// left���� right������ ��� ���� �߿���, ����� ������ ¦���� ���� ���ϰ�, 
// ����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

public class Solution {

	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) { // i�� left~right���� ��ȸ
			int count = 0;

			for (int j = 1; j <= i; j++) { // j�� 1~i���� ��ȸ
				if (i % j == 0) // i�� j�� ������ �������� ���� ����
					count++;
			}

			if (count % 2 == 0) // Ȧ������ ¦������ ����
				answer += i; // true
			else
				answer -= i; // false
		}

		return answer;
	}

}
