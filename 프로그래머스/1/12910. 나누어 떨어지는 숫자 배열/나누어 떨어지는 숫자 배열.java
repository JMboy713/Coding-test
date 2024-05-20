import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> array = new ArrayList<>();
        boolean exist = false;
        
        for(int num : arr){
            if (num%divisor==0){
                array.add(num);
                exist = true;
            }
        }
        if (!exist){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[array.size()];
        // array.sort((o1, o2) -> o1 - o2);
        // System.out.println();
        
        for(int i = 0;i<array.size();i++){
            answer[i]=array.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}