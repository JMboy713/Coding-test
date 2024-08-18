import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고, 현재 가격이 스택에 있는 인덱스의 가격보다 낮을 때
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        
        // 끝까지 가격이 떨어지지 않은 경우 처리
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices.length - idx - 1;
        }
        
        return answer;
    
    }
}