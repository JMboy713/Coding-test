import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];// 최고 순위, 최저 순위
        int rank=7;
        int zeronum=0;
        ArrayList<Integer> wn = new ArrayList<>();
        for(int num:win_nums){
            wn.add(num);
        }
        
        
        for(int i : lottos){
            if(wn.contains(i)){
                rank-=1;
            }else if(i==0){
                zeronum+=1;
            }
        }
        if(zeronum==0 && rank==7){
            answer[0]=6;
            answer[1]=6;
        }else{
            int available_rank= rank-zeronum;
            answer[0]=available_rank;
            if(rank==7){
                rank=6;
            }
            answer[1]=rank;
            
        }
        return answer;
    }
}