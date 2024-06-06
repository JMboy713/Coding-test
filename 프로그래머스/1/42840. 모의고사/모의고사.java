import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int man1Score =0;
        int man2Score =0;
        int man3Score =0;
        Map<Integer,Integer> score = new HashMap<>();
        score.put(1,0);
        score.put(2,0);
        score.put(3,0);
        
        int [] man1 = new int[] {1,2,3,4,5};
        int [] man2 = new int[] {2,1,2,3,2,4,2,5};
        int [] man3 = new int[] {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0;i<answers.length;i++){
            if (man1[i%5]==answers[i]){
                score.put(1,score.get(1)+1);
            }
            if (man2[i%8]==answers[i]){
                score.put(2,score.get(2)+1);
            }
            if (man3[i%10]==answers[i]){
                score.put(3,score.get(3)+1);
            }
        }
        int maxValue = Collections.max(score.values());

        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : score.entrySet()) {
            if(entry.getValue()==maxValue){
                result.add(entry.getKey());
            }
        }
        
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        
        
        
        return answer;
    }
}