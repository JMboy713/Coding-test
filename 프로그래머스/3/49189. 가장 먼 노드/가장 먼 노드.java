import java.util.*;

class Solution {
    static boolean[] visited;
    static Queue<Node> queue = new ArrayDeque<>();
    static int maxi;
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visited = new boolean[edge.length+1];// 방문 여부
        int[] dist = new int[edge.length+1];

            
        Map<Integer,Set<Integer>> graph = new HashMap<>();
        
        for(int[] vertex : edge){
            int start = vertex[0];
            int end = vertex[1];
            if(!graph.containsKey(start)){
                Set<Integer> set = new HashSet<>();
                set.add(end);
                graph.put(start,set);
            }else{
                Set<Integer> set = graph.get(start);
                set.add(end);
                graph.put(start,set);
            }
            
            if(!graph.containsKey(end)){
                Set<Integer> set = new HashSet<>();
                set.add(start);
                graph.put(end,set);
            }else{
                Set<Integer> set = graph.get(end);
                
                set.add(start);
                graph.put(end,set);
            }
        }
        
        Node node1 = new Node(1,0);
        queue.add(node1);
        dist[1]=0;
        visited[1]=true;
                
        while(!queue.isEmpty()){
            Node node = queue.poll();
            int idx = node.idx;
            int count = node.count;
            
            maxi = Math.max(count,maxi);
            
            for(int num : graph.get(idx)){
                if(!visited[num]){// 방문 안했다면
                    visited[num]=true;
                    
                    if(dist[num]==0){
                        dist[num]=count+1;
                    }else{
                        dist[num]=Math.min(dist[num],count+1);
                    }
                    queue.add(new Node(num,count+1));
                }
                
            }
            
        }
        
        for(int distance : dist){
            if(distance == maxi){
                answer++;
            }
        }
            
            
            
        return answer;
    }
    
    
    
    
    class Node{
        public int idx;
        public int count;
        public Node(int idx, int count){
            this.idx = idx;
            this.count = count;
        }
    }
    
    
    
}