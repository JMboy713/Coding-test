import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        while(n!=0){
            answer+=n%10;
            n=n/10;
        }
        
        
        // String str = ""+n;
        // char[] arr = str.toCharArray();
        // for(char i:arr){
        //     System.out.println(Integer.parseInt(i));
        //     // answer+=(int) i;
        // }
        
        
        

        return answer;
    }
}