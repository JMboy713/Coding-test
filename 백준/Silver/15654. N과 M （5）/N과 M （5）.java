

import java.io.*;
import java.sql.Array;
import java.util.*;




/*

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
고른 수열은 오름차순이어야 한다.
길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.

3 1
* */


public class Main {
    static int[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String NN = br.readLine();
        String[] NNN = NN.split(" ");
        numbers = new int[NNN.length];
        boolean[] visited = new boolean[NNN.length];

        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(NNN[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        backTracking(N, M, list, visited);



    }

    private static void backTracking(int n, int m, ArrayList<Integer> list, boolean[] visited) {
        if (list.size() == m) {
            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <n ; i++) {
            if (!visited[i]) {
                list.add(numbers[i]);
                visited[i] = true;
                backTracking(n, m, list, visited);
                visited[i] = false;
                list.remove(list.size() - 1);
            }

        }

    }

}