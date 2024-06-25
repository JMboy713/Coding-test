import java.util.*;

public class Solution {
    public int solution(int n) {
        if(n==1){
            return 1;
        }else{
         int answer = 0;
            while(n!=0){
                if(n%2==0){
                    n=n/2;
                }else{
                    n--;
                    answer+=1;
                }
            }
            return answer;
        }
    }
}