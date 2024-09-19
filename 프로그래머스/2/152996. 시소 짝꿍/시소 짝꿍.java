import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights); // 오름차순 정렬
        int len = weights.length;
        
        // 각 무게에 대해 개수를 세는 맵
        Map<Double, Integer> weightCount = new HashMap<>();
        
        // 각 무게를 배수로 변환해 저장
        for (int i = 0; i < len; i++) {
            double w = weights[i];
            
            // 동일한 비율을 가질 수 있는 경우의 수 추가
            answer += weightCount.getOrDefault(w, 0);       // 1:1 비율
            answer += weightCount.getOrDefault(w * 2.0 / 3, 0); // 2:3 비율
            answer += weightCount.getOrDefault(w * 3.0 / 4, 0); // 3:4 비율
            answer += weightCount.getOrDefault(w * 0.5, 0);     // 2:4 비율

            // 현재 무게의 배수 추가
            weightCount.put(w, weightCount.getOrDefault(w, 0) + 1);
        }

        return answer;
    }
}

