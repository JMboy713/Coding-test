import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < number.length(); i++) {
            char num = number.charAt(i);
            // 스택이 비어있지 않거나, 스택의 가장 뒤의 숫자가 num 보다 작고, k개의 수가 안빠졌을때
            while (!stack.isEmpty() && stack.peek() < num && k > 0) {
                stack.pop();// 스택에서 제거 (맨 앞자리의 숫자가 변경)
                k--;// 숫자 갈아끼우기
            }
            stack.push(num);// 숫자 넣기.
        }
        
        
        
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }
}
