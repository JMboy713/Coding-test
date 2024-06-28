import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for(int i : tangerine){
            if(counter.containsKey(i)){
                counter.put(i,counter.get(i)+1);
            }else{
                counter.put(i,1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> sortedCounter = new ArrayList<>(counter.entrySet()); // entry set으로 list로 만든다. 
        
        sortedCounter.sort((a, b) -> b.getValue().compareTo(a.getValue())); 
        // value값으로 비교해서 정렬
        List<Integer> array = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : sortedCounter) {
            for (int i = 0; i < entry.getValue(); i++) {
                array.add(entry.getKey());
            }
        }

        Set<Integer> answer = new HashSet<>(array.subList(0, k));
        return answer.size();
        
    
    }
}