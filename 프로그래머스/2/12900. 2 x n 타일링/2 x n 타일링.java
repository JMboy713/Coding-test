class Solution {
    public int solution(int n) {
        int answer = 0;
        int count1 = 1;
        int count2 = 2;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            for (int i = 2; i < n; i++) {
                int temp = count2;
                count2 = (count1 + count2) % 1000000007;
                count1 = temp;
            }
            answer = count2;
        }
        return answer;
    }
}
