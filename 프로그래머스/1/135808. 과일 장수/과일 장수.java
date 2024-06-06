import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer=0;
        Arrays.sort(score);
        ArrayList<Integer> scoreList = new ArrayList<>();
        for(int i : score){
            scoreList.add(i);
        }
        int len = scoreList.size();
        while(len>=m){
            int number =0;
            for(int i=0;i<m;i++){
                number = scoreList.remove(len-1);
                len--;
            }
            answer+=(number*m);
        }
                    
    
        return answer;
     }
    
    
      
    
}