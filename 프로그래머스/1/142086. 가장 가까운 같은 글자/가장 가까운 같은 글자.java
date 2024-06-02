import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character,Integer> sMap = new HashMap<Character,Integer>();
        int count=0;
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(sMap.containsKey(c)){
                int ind = sMap.get(c);
                int newInd = s.indexOf(c,ind+1);
                answer[count]=newInd-ind;
                
                sMap.put(c,newInd);
            }else{
                answer[count]=-1;
                int newInd = s.indexOf(c);
                sMap.put(c,newInd);
            }
            count+=1;
        }
        
        return answer;
    }
}