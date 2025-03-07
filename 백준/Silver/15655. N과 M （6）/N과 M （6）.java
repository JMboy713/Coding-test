

import java.io.*;
import java.sql.Array;
import java.util.*;




/*

N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오. N개의 자연수는 모두 다른 수이다.

N개의 자연수 중에서 M개를 고른 수열
고른 수열은 오름차순이어야 한다.

4 2
9 8 7 1

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
        backTracking(0, N, M, list);



    }

    private static void backTracking(int start,int n, int m, ArrayList<Integer> list) {
        if (list.size() == m) {
            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <n ; i++) {
            list.add(numbers[i]);
            backTracking(i + 1, n, m, list);
            list.remove(list.size() - 1);
        }

    }

}