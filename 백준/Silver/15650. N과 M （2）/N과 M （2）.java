

import java.io.*;
import java.util.*;




/*

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.

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
        backTracking(1, N, M, list);  // 시작 숫자는 1부터 시작


    }

    private static void backTracking(int start, int n, int m, List<Integer> list) {
        if (list.size() == m) {
            StringBuilder sb = new StringBuilder();
            for (Integer i : list) {
                sb.append(i).append(" ");
            }
            System.out.print(sb.toString());
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            backTracking(i + 1, n, m, list);
            list.remove(list.size() - 1);
        }

    }
}

