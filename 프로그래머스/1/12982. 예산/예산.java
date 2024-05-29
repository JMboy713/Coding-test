import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int a:d){
            if (budget>=a){
                budget-=a;
                answer+=1;
            }
        }
        
        return answer;
    }
}