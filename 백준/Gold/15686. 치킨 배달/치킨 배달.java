
import java.io.*;
import java.util.*;




/*
N*N 도시. 도시는 1*1
도시의 각 칸은 빈칸, 치킨집, 집 중 하나. R -> 행의 개수 ( 세로의 개수)
C-> 열의 개수 ( 가로의 개수)
집과 가장 가까운 치킨집 사이의 거리. 각 집은 치킨거리를 가지고 있음. 도시의 치킨 거리는 모든 집의 치킨거리의 합.
0 빈칸, 1 집, 2 치킨


* */


public class Main {
    static int N;
    static int M;
    static List<List<int[]>> combi = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        int[][] city = new int[N][N];

        List<int[]> chicken = new ArrayList<>();
        List<int[]> dots = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line1 = br.readLine();
            String[] split1 = line1.split(" ");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(split1[j]);
                city[i][j] = num;
                if (num == 2) {
                    chicken.add(new int[]{i, j});
                } else if (num == 1) {
                    dots.add(new int[]{i, j});
                }
            }
        }
        List<int[]> selectedChicken = new ArrayList<>();
        dfs(0, 0, selectedChicken, chicken); // DFS로 치킨집 조합 만들기

        int answer = Integer.MAX_VALUE;

        for (List<int[]> ints : combi) {
            int dist = calculate(dots, ints);
            answer = Math.min(answer, dist);
        }
        System.out.println(answer);




    }

    private static int calculate(List<int[]> dots, List<int[]> chick) {
        int ans = 0;
        for (int[] dot : dots) {
            int dist = Integer.MAX_VALUE;
            for (int[] ints : chick) {
                int distance = Math.abs(dot[0] - ints[0]) + Math.abs(dot[1] - ints[1]);
                dist = Math.min(distance, dist);
            }
            ans += dist;
        }



        return ans;
    }


    private static void dfs(int start, int depth, List<int[]> selected, List<int[]> chicken) {
        if (depth == M) {
            combi.add(new ArrayList<>(selected));
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            selected.add(chicken.get(i));
            dfs(i + 1, depth + 1, selected, chicken);
            selected.remove(selected.size() - 1); // 백트래킹
        }
    }

}
