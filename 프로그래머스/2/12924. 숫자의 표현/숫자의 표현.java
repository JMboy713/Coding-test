class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1; // 연속된 숫자의 시작점

        while (start <= n) {
            int sum = 0;
            for (int i = start; sum < n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                }
            }
            start++;
        }

        return answer;
    }
}
