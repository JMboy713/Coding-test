
import java.io.*;
import java.sql.Array;
import java.util.*;



/*
첫째 줄에 M과 N, 그리고 K가 빈칸을 사이에 두고 차례로 주어진다.
M, N, K는 모두 100 이하의 자연수이다.
둘째 줄부터 K개의 줄에는 한 줄에 하나씩 직사각형의 왼쪽 아래 꼭짓점의 x, y좌표값과 오른쪽 위 꼭짓점의 x, y좌표값이 빈칸을 사이에 두고 차례로 주어진다.
모눈종이의 왼쪽 아래 꼭짓점의 좌표는 (0,0)이고, 오른쪽 위 꼭짓점의 좌표는(N,M)이다. 입력되는 K개의 직사각형들이 모눈종이 전체를 채우는 경우는 없다.



* */


public class Main {
    static int[][] paper;
    static int[] dx = new int[]{0, 0, -1, 1};
    static int[] dy = new int[]{-1, 1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String MNK = br.readLine();
        String[] split = MNK.split(" ");
        int M = Integer.parseInt(split[0]);
        int N = Integer.parseInt(split[1]);
        int K = Integer.parseInt(split[2]);
        paper = new int[M][N];

        for (int i = 0; i < K; i++) {
            String line = br.readLine();
            String[] split1 = line.split(" ");
            int xL = Integer.parseInt(split1[0]);
            int yL = Integer.parseInt(split1[1]);
            int xR = Integer.parseInt(split1[2]);
            int yR = Integer.parseInt(split1[3]);
            for (int j = yL; j < yR; j++) {
                for (int k = xL; k < xR; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int count = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (paper[i][j] == 0) {
                    count++;
                    int extent = bfs(i, j);
                    ans.add(extent);
                }
            }
        }
        System.out.println(count);
        Collections.sort(ans);
        for (Integer an : ans) {
            System.out.print(an+" ");
        }






    }

    private static int bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});
        int ans = 1;
        paper[i][j] = 1;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int y = poll[0];
            int x = poll[1];
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (paper[0].length > nx && 0 <= nx && paper.length > ny && 0 <= ny && paper[ny][nx] == 0) {
                    paper[ny][nx] = 1;
                    ans++;
                    q.add(new int[]{ny, nx});
                }
            }
        }
        return ans;
    }





}


