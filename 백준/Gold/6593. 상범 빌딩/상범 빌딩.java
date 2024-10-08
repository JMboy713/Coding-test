import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



/*
입력은 여러 개의 테스트 케이스로 이루어지며, 각 테스트 케이스는 세 개의 정수 L, R, C로 시작한다.
 L(1 ≤ L ≤ 30)은 상범 빌딩의 층 수이다. R(1 ≤ R ≤ 30)과 C(1 ≤ C ≤ 30)는 상범 빌딩의 한 층의 행과 열의 개수를 나타낸다.

그 다음 각 줄이 C개의 문자로 이루어진 R개의 행이 L번 주어진다. 각 문자는 상범 빌딩의 한 칸을 나타낸다.
금으로 막혀있어 지나갈 수 없는 칸은 '#'으로 표현되고, 비어있는 칸은 '.'으로 표현된다.
당신의 시작 지점은 'S'로 표현되고, 탈출할 수 있는 출구는 'E'로 표현된다.
각 층 사이에는 빈 줄이 있으며, 입력의 끝은 L, R, C가 모두 0으로 표현된다. 시작 지점과 출구는 항상 하나만 있다.

3 4 5
E....
.###.
.##..
###.#

#####
#####
##.##
##...

#####
#####
#.###
####S

1 3 3
S##
#E#
###

0 0 0


Escaped in 11 minute(s).
Trapped!

* */


public class Main {

    static int[] dx = new int[]{-1, 1, 0, 0, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1, 0, 0};
    static int[] dz = new int[]{0, 0, 0, 0, -1, 1};
    static boolean[][][] visited;
    static Queue<Node> q = new LinkedList<>();
    static String[][][] building;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            q.clear();
            String line = br.readLine();
            String[] split = line.split(" ");
            int L = Integer.parseInt(split[0]);
            int R = Integer.parseInt(split[1]);
            int C = Integer.parseInt(split[2]);
            int min = 0;
            if (L == 0 & R == 0 & C == 0) {
                break;
            }else{
                building = new String[L][R][C];
                visited = new boolean[L][R][C];
                for (int i = 0; i < L; i++) {
                    for (int j = 0; j < R; j++) {
                        String line1 = br.readLine();

                        String[] weight = line1.split("");
                        for (int k = 0; k < weight.length; k++) {
                            if (weight[k].equals("S")) {
                                q.add(new Node(new int[]{i, j, k}, 0));
                                visited[i][j][k] = true;
                            }
                        }
                        building[i][j] = weight;
                    }
                    br.readLine();
                }
                min = bfs(L, R, C);
            }
            if (min == 0) {
                System.out.println("Trapped!");
            }else{
                System.out.println("Escaped in " + min + " minute(s).");
            }
        }
    }

    public static int bfs(int ZZ,int YY,int XX) {

        while (!q.isEmpty()) {
            Node poll = q.poll();
            int[] dot = poll.dot;
            int z = dot[0];
            int y = dot[1];
            int x = dot[2];
            int count = poll.count;
            if (building[z][y][x].equals("E")) {
                return count;
            }

            for (int i = 0; i < 6; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                int nz = dz[i] + z;
                if (nx >= 0 && nx < XX && ny >= 0 && ny < YY && nz < ZZ && nz >= 0 && !building[nz][ny][nx].equals("#") && !visited[nz][ny][nx]) {
                    visited[nz][ny][nx] = true;
                    q.add(new Node(new int[]{nz, ny, nx}, count + 1));
                }
            }
        }
        return 0;
    }


    static class Node{
        public int[] dot;
        public int count;

        public Node(int[] dot, int count) {
            this.dot = dot;
            this.count = count;
        }
    }





}


