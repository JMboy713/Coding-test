import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> p = new HashMap<>();
        ArrayList<String> comp = new ArrayList<>();
        for(String a:completion){
            comp.add(a);
        }
        
        for(String i : participant){
            p.put(i,0);
        }
        
        for(String i : participant){
            if(p.containsKey(i)){
                p.put(i,p.get(i)+1);
            }
        }
        for(String i : completion){
            if(p.containsKey(i)){
                p.put(i,p.get(i)-1);
            }
        }
        
        for(Map.Entry<String, Integer> entry : p.entrySet()){
            if (entry.getValue()==1){
                answer=entry.getKey();
            }
        }

        
        
        return answer;
    }
}