import java.util.*;

class Solution {
    public String solution(String s) {
        
        if (s.length()==1){
            return s;
        }
        int start=(s.length()/2)-1;
        int end = (s.length()/2);
        if (s.length()%2==0){    
            return s.substring(start,end+1);
        }else{
            
            return s.substring(start+1,end+1);
        }
        // ArrayList<String> str = new ArrayList<>();
        // for(int i=0;i<s.length();i++){
        //     str.add(""+s.charAt(i));
        // }
        // System.out.println(str);
        // return answer;
    }
}