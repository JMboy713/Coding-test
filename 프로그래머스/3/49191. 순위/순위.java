// A-> B 항상 이김. 
// 일방향 그래프

import java.util.*;

class Solution {
    
    static boolean[] visited;
    
    static Queue<Integer> queue = new LinkedList<>();
    
    
    public int solution(int n, int[][] results) {
        int answer = 0;
        visited = new boolean[n+1];// 0번째는 dummy
        int[] counts = new int[n+1];// 0번째는 dummy
        Map<Integer,List<Integer>> result = new HashMap<>();// 승 결과
        Map<Integer,List<Integer>> result2 = new HashMap<>();// 패 결과
        
        for(int[] res : results){
            int winner = res[0];
            int loser = res[1];
            if(!result.containsKey(winner)){
                List<Integer> li = new ArrayList<>();
                li.add(loser);
                result.put(winner,li);
                
            }else{
                List<Integer> li = result.get(winner);
                li.add(loser);
                result.put(winner,li);
                
            }
            if(!result2.containsKey(loser)){
                List<Integer> li = new ArrayList<>();
                li.add(winner);
                result2.put(loser,li);               
            }else{
                List<Integer> li = result2.get(loser);
                li.add(winner);
                result2.put(loser,li);
            }
        }
        // System.out.println(result);
        // System.out.println(result2);
        for(int i=1;i<=n;i++){
            visited = new boolean[n+1];// 0번째는 dummy
            int count = 0;
            queue.add(i);
            while(!queue.isEmpty()){
                int num = queue.poll();
                visited[num] = true;
                if(result.get(num)!=null){
                    
                
                for(int a : result.get(num)){
                    if(!visited[a]){
                        count++;
                        visited[a]=true;
                        queue.add(a);
                    }
                }
                    }
            }
            queue.add(i);
            while(!queue.isEmpty()){
                int num = queue.poll();
                visited[num] = true;
                if(result2.get(num)!=null){
                    
                
                for(int a : result2.get(num)){
                    if(!visited[a]){
                        count++;
                        visited[a]=true;
                        queue.add(a);
                    }
                }
                    }
            }
            counts[i] = count;
        }
        for(int count : counts){
            if(count==n-1){
                answer++;
            }
        }
        
        
        
        
        
        
        return answer;
    }
    
    
}