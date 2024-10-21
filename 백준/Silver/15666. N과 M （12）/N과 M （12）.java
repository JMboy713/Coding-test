import java.io.*;
import java.util.*;




/*
N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

N개의 자연수 중에서 M개를 고른 수열
고른 수열은 비내림차순이어야 한다.
길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.

입력
4 2
9 7 9 1

출력
1 7
1 9
7 9
9 9

* */


public class Main {
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();
    static Set<List<Integer>> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        String[] NNMM = NM.split(" ");
        int N = Integer.parseInt(NNMM[0]);
        int M = Integer.parseInt(NNMM[1]);

        String line = br.readLine();
        String[] split = line.split(" ");
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(split[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
//        boolean[] visited = new boolean[N];
        List<Integer> list = new ArrayList<>();
        backTracking(0,N, M, list);

        System.out.println(sb);

    }

    private static void backTracking(int start, int n, int m, List<Integer> list) {

        if (list.size() == m) {
            if (set.contains(list)) {
                return;
            } else {
                for (Integer i : list) {
                    sb.append(i).append(" ");
                }
                sb.append("\n");
                set.add(list);
            }
            return;
        }
        for (int i = start; i < n; i++) {
            list.add(numbers[i]);
            backTracking(i , n, m, list);
            list.remove(list.size() - 1);
        }

    }
}
