import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        while(n!=0){
            arr.add(n%10);
            n=n/10;
        }
        Collections.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(Long num : arr){
            sb.append(num);
        }
        return Long.parseLong(sb.toString());
        
        // return (long)answer;


        
        
        
    }
}