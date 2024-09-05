import java.util.*;

class Solution {
    static Queue<Node> q = new LinkedList<>();
    static boolean[][] visited = new boolean[102][102];  // 좌표를 2배로 확장
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102];
        
        // 좌표를 2배로 확장하여 경계선 처리
        for (int[] rec : rectangle) {
            for (int i = rec[1] * 2; i <= rec[3] * 2; i++) { // y 기준으로 확장
                if (i == rec[1] * 2 || i == rec[3] * 2) { // 상하 경계선
                    for (int j = rec[0] * 2; j <= rec[2] * 2; j++) {
                        if (map[i][j] == 0) {
                            map[i][j] = 1;  // 경계선
                        }
                    }
                } else { // 좌우 경계선
                    if (map[i][rec[0] * 2] == 0) {
                        map[i][rec[0] * 2] = 1;
                    }
                    if (map[i][rec[2] * 2] == 0) {
                        map[i][rec[2] * 2] = 1;
                    }
                    // 내부는 3으로 처리
                    for (int j = rec[0] * 2 + 1; j < rec[2] * 2; j++) {
                        map[i][j] = 3;
                    }
                }
            }
        }

        int answer = 0;
        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;
        
        q.add(new Node(new int[]{characterX, characterY}, 0));
        visited[characterY][characterX] = true;  // 시작점 방문 체크
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.dot[0];
            int y = node.dot[1];
            int count = node.count;

            if (x == itemX && y == itemY) {
                answer = count / 2;  // 이동 횟수를 2배로 했으므로 나누기 2
                break;
            }

            // 네 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102 && !visited[ny][nx] && map[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    q.add(new Node(new int[]{nx, ny}, count + 1));
                }
            }
        }
        return answer;
    }
    
    class Node {
        public int[] dot;
        public int count;
        public Node(int[] dot, int count) {
            this.dot = dot;
            this.count = count;
        }
    }
}
