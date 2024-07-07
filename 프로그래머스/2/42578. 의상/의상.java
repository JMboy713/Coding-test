import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String,Integer> result = new HashMap<>();
        for(String[] i : clothes){
            if(result.containsKey(i[1])){
                result.put(i[1],result.get(i[1])+1);
            }else{
                result.put(i[1],1);
            }
        }
        List<Integer> values = new ArrayList<>(result.values());
        int answer = 1;
        for(int i : values){
            answer*=(i+1);
        }
        return answer-1;
    }
}