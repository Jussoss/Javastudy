package artifactTest;

// 문제 설명 : 두 정수 left와 right가 매개변수로 주어집니다. 
// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
// 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

public class Solution {

	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) { // i는 left~right까지 순회
			int count = 0;

			for (int j = 1; j <= i; j++) { // j는 1~i까지 순회
				if (i % j == 0) // i를 j로 나누어 떨어지는 수를 증가
					count++;
			}

			if (count % 2 == 0) // 홀수인지 짝수인지 구분
				answer += i; // true
			else
				answer -= i; // false
		}

		return answer;
	}

}
