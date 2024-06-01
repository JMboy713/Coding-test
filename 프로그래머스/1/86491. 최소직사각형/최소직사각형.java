import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        
        for(int[] arr : sizes){
            if (arr[0]>=arr[1]){
                width.add(arr[0]);
                height.add(arr[1]);
            }else{
                width.add(arr[1]);
                height.add(arr[0]);
            }
        }
        
        return Collections.max(width)*Collections.max(height);
    }
}