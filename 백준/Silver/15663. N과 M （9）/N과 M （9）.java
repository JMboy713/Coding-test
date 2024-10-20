

import java.io.*;
import java.util.*;




/*
N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

N개의 자연수 중에서 M개를 고른 수열

입력
4 2
9 7 9 1

출력
1 7
1 9
7 1
7 9
9 1
9 7
9 9

* */


public class Main {
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();
    static Set<List<Integer>> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String NN = br.readLine();
        String[] NNN = NN.split(" ");
        numbers = new int[NNN.length];


        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(NNN[i]);
            numbers[i] = num;
        }
        Arrays.sort(numbers);

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[N];
        backTracking(N,M,list,visited);

        List<List<Integer>> arr = new ArrayList<>();
        for (List<Integer> integers : set) {
            arr.add(integers);
        }
        System.out.println(sb);




    }

    private static void backTracking(int n, int m, ArrayList<Integer> list,boolean[] visited) {
        if (list.size() == m) {
            if (set.contains(list)) {
                return;
            }else{
                for (Integer i : list) {
                    sb.append(i).append(" ");
                }
                set.add(list);
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {// 방문 안했다면
                list.add(numbers[i]);
                visited[i] = true;
                backTracking(n,m,list,visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }



    }

}
