import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        ArrayList<Integer> wall = new ArrayList<>();
        for(int i : section){
            wall.add(i);
        }
        
        while(wall.size()>0){
            int firstWall = wall.get(0);
            int lastWall;
            if(firstWall+m>n){
                lastWall = n;
            }else{
                lastWall = firstWall+m-1;
            }
            
            for(int i=firstWall;i<=lastWall;i++){
                
                if(wall.contains(i)){
                    wall.remove(0);
                }
            }
            answer++;
        }
        
        
        return answer;
    }
}