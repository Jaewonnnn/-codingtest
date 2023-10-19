class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a와 b의 대소관계에 상관없이 두 수를 비교하여 start와 end 값을 결정합니다.
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // start부터 end까지의 모든 정수를 더합니다.
        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
}
