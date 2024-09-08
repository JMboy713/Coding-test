import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int max = 0;
        for(int i=0;i<queue1.length;i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            max = Math.max(max,queue1[i]);
            max = Math.max(max,queue2[i]);
        }
        
        
        
        if((sum(q1)+sum(q2))%2!=0 || (sum(q1)+sum(q2))/2 < max){
            return -1;
        }
        long sum1 = sum(q1);
        long sum2 = sum(q2);
        
        while(sum1!=sum2){
            answer++;
            if(sum1>sum2){
                int num = q1.poll();
                q2.add(num);
                sum1-=num;
                sum2+=num;
            }else if(sum2>sum1){
                int num = q2.poll();
                q1.add(num);
                sum1+=num;
                sum2-=num;
            }else{
                break;
            }
            if((answer>(queue1.length+queue2.length)*2)){// 2바퀴 이상부터는 답이 없음
                return -1;
            }
        }
        
        
        
        return answer;
    }
    
    public long sum(Queue<Integer> q){
        long total = 0;
        for(int a : q){
            total+=a;
        }
        return total;
    }
}