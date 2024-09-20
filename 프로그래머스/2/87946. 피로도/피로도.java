class Solution {
    public int solution(int k, int[][] dungeons) {
        // 최대 던전 탐험 수를 계산하여 반환할 변수
        return dfs(new boolean[dungeons.length], k, dungeons, 0);
    }
    
    public int dfs(boolean[] visited, int k, int[][] dungeons, int count) {
        int maxCount = count;  // 현재까지 탐험한 던전 수를 저장

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {  // 아직 방문하지 않은 던전
                int[] dungeon = dungeons[i];
                if (k >= dungeon[0]) {  // 현재 피로도가 최소 요구 피로도 이상인 경우만 탐험 가능
                    visited[i] = true;
                    maxCount = Math.max(maxCount, dfs(visited, k - dungeon[1], dungeons, count + 1));
                    visited[i] = false;  // 백트래킹: 원상태로 복구
                }
            }
        }

        return maxCount;
    }
}
