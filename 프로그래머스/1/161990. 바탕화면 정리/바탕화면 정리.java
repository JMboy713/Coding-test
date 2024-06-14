import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        Set<Integer> garo = new HashSet<>();
        Set<Integer> sero = new HashSet<>();
        
        for(int i=0;i<wallpaper.length;i++){
            String line = wallpaper[i];
            for(int j=0;j<line.length();j++){
                if(line.charAt(j)=='#'){
                    garo.add(i);
                    garo.add(i+1);
                    sero.add(j);
                    sero.add(j+1);
                }
            }
        }
        int lux = Collections.min(garo);
        int luy = Collections.min(sero);
        int rdx = Collections.max(garo);
        int rdy = Collections.max(sero);
        int[] answer = {lux,luy,rdx,rdy};
        
        return answer;
    }
}