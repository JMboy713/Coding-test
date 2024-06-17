import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();
        char[]  arr = s.toCharArray();
        for(char a : arr){
            if(a=='('){
                stack.add(a);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                stack.pollLast();
            }
        }
        return stack.isEmpty() ? true : false;
             
        
        
    }
}