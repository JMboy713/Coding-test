import java.util.*;

class Solution {
    static Queue<Node> q = new LinkedList<>();
    static int[] dx = new int[]{0,0,-1,1};
    static int[] dy = new int[]{-1,1,0,0};
    static boolean[][] visited; // 방문 확인 배열
    
    public int solution(String[] board) {
        int h = board.length;
        int w = board[0].length();
        String[][] graph = new String[h][w];
        int[] robot = new int[2];
        int[] goal = new int[2];
        visited = new boolean[board.length][board[0].length()];
        
        
        
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                String str = String.valueOf(board[i].charAt(j));
                if(str.equals("R")){
                    robot = new int[]{i,j};
                }else if(str.equals("G")){
                    goal = new int[]{i,j};
                }
                graph[i][j] = str;
            }
        }
        Node n = new Node(robot , 0);
        visited[robot[0]][robot[1]]=true;
        q.add(n);
        
        
        //D에 부딪히거나 나갈거 같을 때 그때 node에 넣는다. 
        while(!q.isEmpty()){
            Node node = q.poll();
            int count = node.count;
            int[] dot = node.dot;
            int y = dot[0];
            int x = dot[1];
            if(graph[y][x].equals("G")){
                return count;
            }
            
            
            for(int i=0;i<4;i++){
                int newx = x;
                int newy = y;
                while(true){
                    // 그래프로 갈 수 있는곳 까지.
                    int moveX = newx+dx[i];
                    int moveY = newy+dy[i];
                    if(moveX<0 || moveX>=w || moveY<0 || moveY>=h 
                       || graph[moveY][moveX].equals("D")){
                        break;
                    }
                    newx = moveX;
                    newy = moveY;
                }
                if(!visited[newy][newx]){
                    Node newNode = new Node(new int[]{newy,newx},count+1);
                    q.add(newNode);
                    visited[newy][newx]=true;
                }   
            }
            
        }
        
        
        
        return -1;
    }
    
    
    class Node{
        public int count;
        public int[] dot;
        
        public Node(int[] dot,int count){
            this.count = count;
            this.dot = dot;
        }
    }
}