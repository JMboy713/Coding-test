import java.util.*;

class Solution {
    static int[] dx = new int[]{0,0,-1,1};
    static int[] dy = new int[]{-1,1,0,0};
    static Queue<int[]> q = new LinkedList<>();
    static List<int[]> arr = new ArrayList<>();
    
    public int[] solution(String[] maps) {
        
        String[][] graph = new String[maps.length][maps[0].length()];
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        
        
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length();j++){
                StringBuilder sb = new StringBuilder();
                sb.append(maps[i].charAt(j));
                if(!sb.toString().equals("X")){
                    int[] yx = new int[]{i,j};
                    arr.add(yx);
                }
                graph[i][j]= sb.toString();
            }
        }
        List<Integer> maxValues = new ArrayList<>();
        
        if(arr.isEmpty()){
            return new int[]{-1};
        }
        
        
        
        for(int[] xy : arr){
            int yy = xy[0];
            int xx = xy[1];
            
            if(!visited[yy][xx]){
                int totalSum = 0;
                q.add(new int[]{yy,xx});
                
                while(!q.isEmpty()){
                    int[] node = q.poll();
                    int y = node[0];
                    int x = node[1];
                    
                    if(!visited[y][x]){
                        visited[y][x]=true;
                        totalSum+=Integer.parseInt(graph[y][x]);
                        
                    
                    for(int i=0;i<4;i++){
                        int newx = x+dx[i];
                        int newy = y+dy[i];
                        if (newy >= 0 && newy < maps.length && newx >= 0 && newx < maps[0].length()) {
                        if (!graph[newy][newx].equals("X") && !visited[newy][newx]){
                                q.add(new int[]{newy,newx});
                            }
                        }
                        }
                    }
                }
                maxValues.add(totalSum);
            }
            
        }
        Collections.sort(maxValues);
        int[] result = maxValues.stream().mapToInt(i -> i).toArray();

        return result;
    }
}