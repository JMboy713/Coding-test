import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] list = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(String num : list){
            arr.add(Integer.parseInt(num));
        }
        sb.append(Collections.min(arr));
        sb.append(" ");
        sb.append(Collections.max(arr));
        
        
        return sb.toString();
    }
}