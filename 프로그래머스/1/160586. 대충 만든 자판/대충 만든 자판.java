import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        String dummy = "";
        Map<String,Integer> minimumKey = new HashMap<>();
        for(String key : keymap){
            char[] keyArr = key.toCharArray();
            for(int i=0;i<keyArr.length;i++){
                dummy+=keyArr[i];
                if(minimumKey.containsKey(dummy)){
                    int value = minimumKey.get(dummy)<i+1?minimumKey.get(dummy):i+1;
                    minimumKey.put(dummy,value);
                }else{
                    minimumKey.put(dummy,i+1);
                }
                dummy="";
            }
        }
        int index=0;
        for(String tar : targets){
            int count =0;
            for(int i=0;i<tar.length();i++){
                String dum ="";
                dum+=tar.charAt(i);
                if(minimumKey.containsKey(dum)){
                    count+=minimumKey.get(dum);    
                }else{
                    count=-1;
                    break;
                }
                
            }
            answer[index]=count;
            index++;
        }
        
        
        
        return answer;
    }
}