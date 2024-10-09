import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] maze;
    static boolean[][][] visited; // 3차원 visited 배열: [y][x][0] -> 벽을 안 부순 경우, [y][x][1] -> 벽을 부순 경우
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        String[] split = NM.split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] garo = line.split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(garo[j]);
            }
        }

        visited = new boolean[N][M][2];  // 3차원 배열 초기화
        int result = bfs(0, 0);
        System.out.println(result);
    }

    private static int bfs(int startY, int startX) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startY, startX, 1, 0));  // y, x, 거리, 벽 부수기 여부 (0: 안 부숨, 1: 부숨)
        visited[startY][startX][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int y = node.y;
            int x = node.x;
            int dist = node.dist;
            int wallBreak = node.wallBreak;

            // 도착지에 도달한 경우
            if (y == N - 1 && x == M - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    // 빈 칸이고 현재 상태에서 방문하지 않은 경우
                    if (maze[ny][nx] == 0 && !visited[ny][nx][wallBreak]) {
                        visited[ny][nx][wallBreak] = true;
                        queue.add(new Node(ny, nx, dist + 1, wallBreak));
                    }
                    // 벽이 있고, 아직 벽을 부수지 않은 상태라면 벽을 부수고 이동
                    if (maze[ny][nx] == 1 && wallBreak == 0 && !visited[ny][nx][1]) {
                        visited[ny][nx][1] = true;
                        queue.add(new Node(ny, nx, dist + 1, 1));  // 벽을 부순 상태로 이동
                    }
                }
            }
        }
        return -1;  // 경로가 없는 경우
    }

    static class Node {
        int y, x, dist, wallBreak;

        public Node(int y, int x, int dist, int wallBreak) {
            this.y = y;
            this.x = x;
            this.dist = dist;
            this.wallBreak = wallBreak;
        }
    }
}
