import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int count=0;
        ArrayList<Integer> legend = new ArrayList<>();
        for(int sc : score){
            int minimum=0;
            if(legend.size()<k){
                legend.add(sc);
                legend.sort(null);
                minimum = legend.get(0);
            }else{
            if(legend.get(0)<sc){
                legend.remove(0);
                legend.add(sc);
            }else{
                
                }
                legend.sort(null);
                minimum = legend.get(0);
            }
            
            answer[count]=minimum;
            count++;
        }
        return answer;
    }
}