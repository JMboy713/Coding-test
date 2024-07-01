import java.util.*;

class Solution {
    public int solution(String s) {
        int x = s.length();
        int answer = 0;
        ArrayDeque<Character> arr = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        for(char i : ch){
            arr.add(i);
        }
        // System.out.println(arr);
        
        for(char i : ch){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(char j : arr){
                if(stack.size()==0){
                    stack.add(j);
                }else{
                    if(stack.peekLast()=='[' && j==']'){
                        stack.pollLast();
                    }else if(stack.peekLast()=='(' && j==')'){
                        stack.pollLast();
                    }else if(stack.peekLast()=='{' && j=='}'){
                        stack.pollLast();
                    }else{
                        stack.add(j);
                    }
                }
                
            }if(stack.size()==0){
                answer+=1;
            }
            arr.add(arr.poll());
        }
        
        
        
        return answer;
    }
}