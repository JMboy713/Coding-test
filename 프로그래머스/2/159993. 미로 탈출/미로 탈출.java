// 통로, or 벽 => 통로만 이동할 수 있다. 
// 하나는 미로를 빠져나가는 문. 당겨서 열 수 있다.
// 1. 레버를 당긴다. 2.미로를 빠져나간다. 
// L을 최소한으로 찾고, E로 빠르게 나간다. 

import java.util.*;

class Solution {
    static Queue<Node> q = new LinkedList<>();
    int[] dx = new int[]{0,0,-1,1};
    int[] dy = new int[]{-1,1,0,0};
    
    
    public int solution(String[] maps) {
        int answer = 0;
        String[][] graph = new String[maps.length][maps[0].length()];
        int garo = maps[0].length();
        int sero = maps.length;
        
        
        
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];
        
        
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length();j++){
                String str =  String.valueOf(maps[i].charAt(j));
                graph[i][j] = str;
                if(str.equals("S")){
                    start = new int[]{i,j};
                }else if(str.equals("L")){
                    lever = new int[]{i,j};
                }else if(str.equals("E")){
                    exit = new int[]{i,j};
                }
            }
        }
        
        Node node = new Node(start,0);
        q.add(node);
        
        
        boolean[][] visited = new boolean[graph.length][graph[0].length];
        int first =0;
        
        
        while(!q.isEmpty()){
            Node n = q.poll();
            int[] dot = n.dot;
            int count = n.count;
            int x =dot[1];
            int y =dot[0];
            
            
            if(graph[y][x].equals("L")){
                first+=count;
                break;
            }
            
            for(int i=0;i<4;i++){
                int newx = x+dx[i];
                int newy = y+dy[i];
                if(newx >= 0 && newx<garo && newy>=0 && newy<sero 
                   && !graph[newy][newx].equals("X") && !visited[newy][newx]){
                    int[] xy = new int[]{newy,newx};
                    Node newNode = new Node(xy,count+1);
                    visited[newy][newx] = true;
                    q.add(newNode);
                }
            }
        }
        
        if(first==0){
            return -1;
        }else{
            q.clear();
        }
        
        
        
        
        
        Node secondNode = new Node(lever,first);
        q.add(secondNode);
        boolean[][] visited2 = new boolean[graph.length][graph[0].length];
        
        
        
        while(!q.isEmpty()){
            Node n = q.poll();
            int[] dot = n.dot;
            int count = n.count;
            int x =dot[1];
            int y =dot[0];
            
            
            if(graph[y][x].equals("E")){
                answer+=count;
                break;
            }
            
            for(int i=0;i<4;i++){
                int newx = x+dx[i];
                int newy = y+dy[i];
                if(newx >= 0 && newx<garo && newy>=0 && newy<sero 
                   && !graph[newy][newx].equals("X") && !visited2[newy][newx]){
                    int[] xy = new int[]{newy,newx};
                    Node newNode = new Node(xy,count+1);
                    visited2[newy][newx]=true;
                    q.add(newNode);
                }
            }
        }
        return (answer == 0) ? -1 : answer;
        

        
    }
    
    class Node{
        public int count;
        public int[] dot;
        
        public Node(int[] dot, int count){
            this.count = count;
            this.dot = dot;
            
        }
    }
}