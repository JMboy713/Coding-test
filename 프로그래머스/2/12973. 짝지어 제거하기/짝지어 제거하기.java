import java.util.*;

class Solution{
    public int solution(String s){
        Deque<Character> alphabet = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(!alphabet.isEmpty() && alphabet.peekLast()==(i)){
                alphabet.pollLast();
            }else{
                alphabet.addLast(i);
            }
        }
        return alphabet.isEmpty() ? 1 : 0;
    }
}