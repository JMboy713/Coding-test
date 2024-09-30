import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



/*
입력

5
RRRBB
GGBBB
BBBRR
BBRRR
RRRRR

출력 
4 3

* */


public class Main {

    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] visited1;
    static boolean[][] visited2;
    static String[][] RGB;


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        RGB = new String[n][n];
        visited1 = new boolean[n][n];
        visited2 = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] split = line.split("");
            RGB[i] = split;
        }
        int ans1 = 0;
        int ans2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Node node = new Node(new int[]{i,j});
                if (!visited1[i][j]) { // 방문하지 않았다면
                    bfs(node);
                    ans1++;
                }
                if (!visited2[i][j]) {
                    RGBbfs(node);
                    ans2++;
                }
            }
        }
        System.out.print(ans1+" "+ans2);
        
    }

    private static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited1[node.dot[0]][node.dot[1]] = true;

        while (!q.isEmpty()) {
            Node n = q.poll();
            int[] dot = n.dot;
            int y = dot[0];
            int x = dot[1];

            for (int i = 0; i < 4; i++) {
                int xx = dx[i] + x;
                int yy = dy[i] + y;
                if (xx >= 0 && xx < RGB[0].length && yy >= 0 && yy < RGB.length
                        && RGB[y][x].equals(RGB[yy][xx]) && !visited1[yy][xx]) {
                    q.add(new Node(new int[]{yy, xx}));
                    visited1[yy][xx] = true;
                }
            }
        }
    }

    private static void RGBbfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited2[node.dot[0]][node.dot[1]] = true;

        while (!q.isEmpty()) {
            Node n = q.poll();
            int[] dot = n.dot;
            int y = dot[0];
            int x = dot[1];

            for (int i = 0; i < 4; i++) {
                int xx = dx[i] + x;
                int yy = dy[i] + y;
                if (xx >= 0 && xx < RGB[0].length && yy >= 0 && yy < RGB.length && !visited2[yy][xx]) {
                    if((RGB[y][x].equals("R") || RGB[y][x].equals("G") ) && (RGB[yy][xx].equals("R") || RGB[yy][xx].equals("G")) ){
                        q.add(new Node(new int[]{yy, xx}));
                        visited2[yy][xx] = true;
                    } else if (RGB[yy][xx].equals(RGB[y][x])) {
                        q.add(new Node(new int[]{yy, xx}));
                        visited2[yy][xx] = true;
                    }
                }
            }
        }
    }

    static class Node{
        public int[] dot;

        public Node(int[] dot) {
            this.dot = dot;
        }
    }

}