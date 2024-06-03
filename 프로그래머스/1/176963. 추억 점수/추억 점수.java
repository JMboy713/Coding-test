import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int count=0;
        for(String[] pic : photo){
            int score =0;
            for(String j : pic){
                for (int k=0;k<name.length;k++){
                    if(j.equals(name[k])){
                        score+=yearning[k];
                    }
                }
            }
            answer[count]=score;
            count++;
        }
        return answer;
    }
}

