import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



/*
입력
6 5
1 1 0 1 1
0 1 1 0 0
0 0 0 0 0
1 0 1 1 1
0 0 1 1 1
0 0 1 1 1

출력 
4
9

* */


public class Main {

    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] visited;
    static String[][] picture;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();
        String[] split = nm.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        picture = new String[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] garo = line.split(" ");
            picture[i] = garo;
        }

        int count = 0;
        int maximum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (picture[i][j].equals("1") && !visited[i][j]) {
                    Node node = new Node(new int[]{i, j});
                    int ans = bfs(node);
                    maximum = Math.max(maximum, ans);
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(maximum);




    }

    private static int bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited[node.dots[0]][node.dots[1]] = true;
        int count = 0;


        while (!q.isEmpty()) {
            Node n = q.poll();
            int[] dots = n.dots;
            int y = dots[0];
            int x = dots[1];
            count++;
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i];
                int yy = y + dy[i];
                if (xx >= 0 && xx < picture[0].length && yy >= 0 && yy < picture.length
                        && !visited[yy][xx] && picture[yy][xx].equals("1")) {
                    q.add(new Node(new int[]{yy, xx}));
                    visited[yy][xx] = true;
                }
            }
        }
        return count;

    }

    static class Node{
        public int[] dots;

        public Node(int[] dots) {
            this.dots = dots;
        }
    }

}