
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



/*

첫줄에는 상자의 크기를 타나내는 M,N, 상자의 수 H
둘째줄 부터는 가장 밑의 상자부터 가장 위의 상자까지 저장된 토마토들의 정보.

입력
5 3 1
0 -1 0 0 0
-1 -1 0 1 1
0 0 0 1 1

-1

5 3 2
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0

4



* */


public class Main {
    static boolean[][][] visited;
    static int[] dx = new int[]{0, 0, 0, 0, -1, 1};
    static int[] dy = new int[]{0, 0, -1, 1, 0, 0};
    static int[] dz = new int[]{-1, 1, 0, 0, 0, 0};
    static int[][][] tomatos;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] nums = line.split(" ");
        int M = Integer.parseInt(nums[0]);
        int N = Integer.parseInt(nums[1]);
        int H = Integer.parseInt(nums[2]);

        tomatos = new int[H][N][M];
        visited = new boolean[H][N][M];
        Queue<Node> dots = new LinkedList<>();
        int zero = 0;


        for (int i = 0; i < H * N; i++) {
            String line1 = br.readLine();
            String[] split = line1.split(" ");
            for (int j = 0; j < M; j++) {
                int HH = (i / N) ;
                int NN = i % N;
                int str = Integer.parseInt(split[j]);
                tomatos[HH][NN][j] = str;
                if (str == 1) {
                    dots.add(new Node(new int[]{j, NN, HH},0));
                } else if (str == 0) {
                    zero++;
                }
            }
        }

        if (zero == 0) {
            System.out.println(0);
            return;
        }
        // j : 가로  NN 세로, HH 높이
        int ans = 0;

        while (!dots.isEmpty()) {
            Node poll = dots.poll();
            int[] dot = poll.dot;
            int days = poll.days;
            ans = Math.max(days, ans);
            int x = dot[0];
            int y = dot[1];
            int z = dot[2];
            for (int i = 0; i < 6; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                int nz = dz[i] + z;

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && nz >= 0 && nz < H && tomatos[nz][ny][nx] == 0) {
                    tomatos[nz][ny][nx] = 1;
                    dots.add(new Node(new int[]{nx, ny, nz}, days + 1));
                }

            }
        }
        for (int[][] tomato : tomatos) {
            for (int[] ints : tomato) {
                for (int anInt : ints) {
                    if (anInt == 0) {
                        ans = -1;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static class Node{
        public int[] dot;
        public int days;

        public Node(int[] dot, int days) {
            this.dot = dot;
            this.days = days;
        }
    }
}

