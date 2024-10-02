
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



/*
1
10 5
##########
#@....#*.#
#.....#..#
#.....#..#
##.#######


5
4 3
####
#*@.
####
7 6
###.###
#*#.#*#
#.....#
#.....#
#..@..#
#######
7 4
###.###
#....*#
#@....#
.######
5 5
.....
.***.
.*@*.
.***.
.....
3 3
###
#@#
###


* */


public class Main {
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Case = br.readLine();
        int test = Integer.parseInt(Case);
        for (int i = 0; i < test; i++) {
            String testCase = br.readLine();
            String[] TC = testCase.split(" ");
            int w = Integer.parseInt(TC[0]);
            int h = Integer.parseInt(TC[1]);
            String[][] building = new String[h][w];
            Queue<Node> man = new LinkedList<>();
            Queue<int[]> fire = new LinkedList<>();

            for (int j = 0; j < h; j++) {
                String line = br.readLine();
                String[] garo = line.split("");
                for (int k = 0; k < garo.length; k++) {
                    if (garo[k].equals("*")) {
                        fire.add(new int[]{j, k});
                    }else if(garo[k].equals("@")){
                        man.add(new Node(new int[]{j, k}, 0));
                    }
                }
                building[j] = garo;
            }
            int[][] time = new int[h][w];

            int ans = bfs(building, man, fire, time);
            if (ans == 0) {
                System.out.println("IMPOSSIBLE");
            }else{
                System.out.println(ans);
            }


        }
    }

    private static int bfs(String[][] building, Queue<Node> man, Queue<int[]> fire,int[][] time) {
        int H = building.length;
        int W = building[0].length;
        boolean[][] visited = new boolean[H][W];
        boolean[][] visitedMan = new boolean[H][W];

        while (!fire.isEmpty()) {
            int[] poll = fire.poll();
            int y = poll[0];
            int x = poll[1];
            visited[y][x] = true;
            for (int i = 0; i < 4; i++) {
                int ny = dy[i] + y;
                int nx = dx[i] + x;
                if (nx >= 0 && nx < W && ny >= 0 && ny < H && !building[ny][nx].equals("#") && time[ny][nx] == 0 && !visited[ny][nx]) {
                    time[ny][nx] = time[y][x] + 1;
                    visited[ny][nx] = true;
                    fire.add(new int[]{ny, nx});
                }
            }
        }


        while (!man.isEmpty()) {
            Node n = man.poll();
            int[] dot = n.dot;
            int count = n.count;
            int y = dot[0];
            int x = dot[1];
            visitedMan[y][x] = true;
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx < 0 || nx >= W || ny < 0 || ny >= H) {
                    return count + 1;
                }else if (nx >= 0 && nx < W && ny >= 0 && ny < H && building[ny][nx].equals(".") && (time[ny][nx]>count+1|| time[ny][nx]==0) && !visitedMan[ny][nx]) {
                    visitedMan[ny][nx] = true;
                    man.add(new Node (new int[]{ny, nx},count+1));
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


