// A -> B B->C => A->C
//[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	
// 0-> 0,1      1 -> 1,0     2-> 2

class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i=0;i<computers.length;i++){
            if(visited[i]==true){
                continue;
            }else{
                dfs(i,visited,computers); 
                System.out.println("끝");
                answer++;
            }

        }

        for(boolean i : visited){
            System.out.println(i);
        }
        
        
        return answer;
    }
    public static void dfs(int nodeIndex,boolean[] visited,int[][] computers) {
		// 방문 처리
		visited[nodeIndex] = true;
		
		// 방문 노드 출력
		System.out.print(nodeIndex + " -> ");
		
		// 방문한 노드에 인접한 노드 찾기
		for (int j=0;j< computers[nodeIndex].length;j++) {
            if(computers[nodeIndex][j]==1){
                if(!visited[j]) {
				    dfs(j,visited,computers);
			    }
            }
			
			
		}
	}
    
}