import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> arr = new HashSet<Integer>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                arr.add(numbers[i]+numbers[j]);
            }
        }
        List<Integer> tempSet = new ArrayList<>(arr);
		Collections.sort(tempSet);
        int[] answer = new int[arr.size()];
        int count=0;
        for(int i : tempSet){
            answer[count]=i;
            count++;
        }
        return answer;
    }
}