import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer =0;
        int[] left = new int[topping.length];
        int[] right = new int[topping.length];   
        Set<Integer> le = new HashSet<>();
        Set<Integer> ri = new HashSet<>();
        
        
        for(int i=0;i<topping.length;i++){
            le.add(topping[i]);
            left[i] = le.size();  
        }
        
        for(int i=topping.length-1;i>=0;i--){
            ri.add(topping[i]);
            right[i] = ri.size();
        }
        
        
        
        for(int i=0;i<topping.length-1;i++){
            if(left[i]==right[i+1]){
                answer++;
            }
        }
        
        
        return answer;
    }
}