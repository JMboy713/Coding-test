class Solution {
    public int solution(int storey) {
        int answer = 0;

        // storey를 자리수별로 처리
        while (storey > 0) {
            int current = storey % 10;  // 현재 자리수
            int next = (storey / 10) % 10;  // 다음 자리수
            
            if (current > 5 || (current == 5 && next >= 5)) {
                // 현재 자리가 5보다 크거나, 5인데 다음 자리가 5 이상이면 올림
                answer += (10 - current);
                storey = storey / 10 + 1;  // 올림 처리
            } else {
                // 5 이하이면 그대로 더하기
                answer += current;
                storey = storey / 10;  // 다음 자리로 이동
            }
        }

        return answer;
    }
}
