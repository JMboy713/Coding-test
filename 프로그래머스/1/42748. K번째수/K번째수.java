import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count=0;
        for(int[] arr : commands){
            int i=arr[0];
            int j=arr[1];
            int k=arr[2];
            ArrayList<Integer> newArr = new ArrayList<>();
            for(int ii=i-1;ii<j;ii++){
                newArr.add(array[ii]);
            }
            Collections.sort(newArr);
            answer[count]=(newArr.get(k-1));
            count++;
            
            
        }
        
        return answer;
    }
}