import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        int result = 0;
        
        Arrays.sort(citations); // 오름차순 정렬 후
        int[] reversed = new int[len]; // 내림차순 배열 생성
        for (int i = 0; i < len; i++) {
            reversed[i] = citations[len - i - 1]; // 배열 뒤집기
        }

        for (int i = 0; i < len; i++) {
            result = Math.min(i + 1, reversed[i]);
            answer = Math.max(result, answer);
        }
        
        return answer;
    }
}
