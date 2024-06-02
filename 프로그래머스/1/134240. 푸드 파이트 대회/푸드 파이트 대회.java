import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1;i<food.length;i++){
            int count = food[i]/2;
            for(int j=0;j<count;j++){
                answer+=i;
                deque.offerFirst(i);
            }
        }
        answer+=0;
        for(int num : deque){
            answer+=num;
        }
        return answer;
    }
}