
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



/*
입력

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)


3 1
1
2
3

4 2

1 1
1 2
1 3
1 4
2 1
2 2
2 3
2 4
3 1
3 2
3 3
3 4
4 1
4 2
4 3
4 4



* */


public class Main {



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        if (M == 1) {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }else{
            StringBuilder sb = new StringBuilder();
            List<Integer> stack = new ArrayList<>();
            dfs(stack, N, M,sb);
            System.out.println(sb);
        }
    }

    private static void dfs(List<Integer> arr, int n, int m,StringBuilder sb) {
        if (arr.size() == m) {

            for (int i = 0; i < arr.size(); i++) {
                if (i != arr.size() - 1) {
                    sb.append(arr.get(i));
                    sb.append(" ");
                }else{
                    sb.append(arr.get(i));
                }
            }
            sb.append("\n");
        }else{
            for (int i = 1; i <= n; i++) {
                arr.add(i);
                dfs(arr, n, m,sb);
                arr.remove(arr.size()-1);
            }
        }
    }

}