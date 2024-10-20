

import java.io.*;
import java.util.*;




/*

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

3 1
* */


public class Main {
    static List<List<Integer>> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[N];
        List<Integer> list = new ArrayList<>();
        backTracking(N, M, list, visited);






    }

    private static void backTracking(int num, int m, List<Integer> list, boolean[] visited) {
        if (list.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (int numb : list) {
                sb.append(numb).append(' ');
            }
            System.out.print(sb.toString().trim());
            System.out.println();
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (!visited[i - 1]) {
                list.add(i);
                visited[i - 1] = true;
                backTracking(num, m, list, visited);
                list.remove(list.size() - 1);
                visited[i - 1] = false;
            }

        }

    }
}

