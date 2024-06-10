import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> burger = new ArrayList<>();
        
        for(int i : ingredient){
            burger.add(i);
            if(burger.size()>=4){
                if(burger.get(burger.size() - 4) == 1 && burger.get(burger.size() - 3) == 2 && 
                burger.get(burger.size() - 2) == 3 && burger.get(burger.size() - 1) == 1) {
                    answer++;
                    for(int j=0;j<=3;j++){
                        burger.remove(burger.size()-1);
                    }
                
                }
            }
        }
        
        return answer;
        }
        
        
        
    }