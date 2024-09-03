

// 익은 토마토에 인접한 익지않은 토마토는 다음날 익게 된다.
// 몇일 뒤에 다 익게 되는지 최소 일수를 알고 싶다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int N;
    static int M;
    static int[][] tomato;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String MN = br.readLine();
        String[] split = MN.split(" ");
        M = Integer.parseInt(split[0]);
        N = Integer.parseInt(split[1]);

        tomato = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] intline = line.split(" ");
            for (int j = 0; j < intline.length; j++) {
                int num = Integer.parseInt(intline[j]);
                if (num == 1) {
                    q.add(new int[]{i, j});
                }
                tomato[i][j] = num;
            }
        }
        System.out.println(bfs());


    }

    private static int bfs(){
        while (!q.isEmpty()) {
            int[] t = q.poll();
            int x = t[0];
            int y = t[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                if (tomato[nx][ny] == 0) {
                    tomato[nx][ny] = tomato[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        int max = Integer.MIN_VALUE;
        if (checkZero()) {
            return -1;
        }else{
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (max < tomato[i][j]) {
                        max = tomato[i][j];
                    }
                }
            }
            return max-1;
        }


    }

    private static boolean checkZero() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}