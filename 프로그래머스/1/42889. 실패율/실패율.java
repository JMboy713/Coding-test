import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Integer[] index = new Integer[N];
        for (int i = 0; i < N; i++) {
            index[i] = i;
        }
        
        
        double[] fail_rate = new double[N];
        for(int i=0;i<N;i++){ // 1부터 N까지
            double success=0;
            double fail =0;
            for(int j=0;j<stages.length;j++){
                if(i+1<stages[j]){ // 성공시
                    success+=1;
                }else if(i+1==stages[j]){// 실패 ( 머무르고 있을 시)
                    success+=1;
                    fail+=1;
                }
            }
            // System.out.println(fail);
            // System.out.println(success);
            fail_rate[i]=(fail/success);
        }
        
    
        Arrays.sort(index, Comparator.comparingDouble(a -> -fail_rate[a]));
        
         for (int i = 0; i < N; i++) {
            answer[i] = index[i] + 1;
        }


        return answer;
    }
    
}