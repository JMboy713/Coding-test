import java.util.*;

class Solution {
    static String[][] graph;
    static boolean[][] visited; // 방문 확인 배열
    static Queue<Node> q = new LinkedList<>();

    public int solution(String[] board) {
        int[] start = new int[2];
        graph = new String[board.length][board[0].length()];
        visited = new boolean[board.length][board[0].length()];

        // 보드 구성 및 시작 위치 찾기
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                graph[i][j] = String.valueOf(board[i].charAt(j));
                if (board[i].charAt(j) == 'R') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        // 시작 위치 큐에 추가
        q.add(new Node(start, 0));
        visited[start[0]][start[1]] = true;

        // 상, 하, 좌, 우 방향 설정
        int[] dx = {0, 0, -1, 1}; // 좌우
        int[] dy = {-1, 1, 0, 0}; // 상하

        // BFS 탐색
        while (!q.isEmpty()) {
            Node node = q.poll();
            int y = node.point[0];
            int x = node.point[1];
            int count = node.count;

            // 목표 지점에 도달하면 이동 횟수 반환
            if (graph[y][x].equals("G")) {
                return count;
            }

            // 4 방향으로 미끄러지기
            for (int i = 0; i < 4; i++) {
                int ny = y;
                int nx = x;

                // 해당 방향으로 장애물이나 끝에 도달할 때까지 이동
                while (true) {
                    int ty = ny + dy[i];
                    int tx = nx + dx[i];

                    // 경계 체크 및 장애물 체크
                    if (ty < 0 || ty >= graph.length || tx < 0 || tx >= graph[0].length) break;
                    if (graph[ty][tx].equals("D")) break;

                    ny = ty;
                    nx = tx;
                }

                // 방문하지 않은 좌표라면 큐에 추가
                if (!visited[ny][nx]) {
                    visited[ny][nx] = true;
                    q.add(new Node(new int[]{ny, nx}, count + 1));
                }
            }
        }

        // 목표 지점에 도달할 수 없으면 -1 반환
        return -1;
    }

    // Node 클래스 정의
    class Node {
        int[] point;
        int count;

        public Node(int[] point, int count) {
            this.point = point;
            this.count = count;
        }
    }
}
