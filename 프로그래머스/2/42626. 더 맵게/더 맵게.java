import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : scoville) {
            minHeap.add(i);
        }
        int answer = 0;
        while(minHeap.peek() < K){
            if(minHeap.size() == 1){
                return -1;
            }
            int a = minHeap.poll();
            int b = minHeap.poll();
            int result = a + (b * 2);
            minHeap.add(result);
            answer++;
        }
        return answer;
    }
}