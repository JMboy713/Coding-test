
import java.io.*;
import java.util.*;




/*
수열 A가 주어졌을 때, 그 수열의 증가하는 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 인 경우에 합이 가장 큰 증가하는 부분 수열은 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 이고, 합은 113이다.

10
1 100 2 50 60 3 5 6 7 8
1 100 2 50 3 60  5 6 7 8

* */


public class Main {
    public static void main(String[] args) throws IOException {
        // Example sequence
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        int[] sequence = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int maxSum = findMaxSumIncreasingSubsequence(sequence);
        System.out.println(maxSum);
    }

    public static int findMaxSumIncreasingSubsequence(int[] sequence) {
        int n = sequence.length;

        // Initialize dp array to store the maximum sum ending at each index
        int[] dp = new int[n];

        // Copy the original sequence into dp as the base case
        System.arraycopy(sequence, 0, dp, 0, n);

        // Fill dp array using the recurrence relation
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j] && dp[i] < dp[j] + sequence[i]) {
                    dp[i] = dp[j] + sequence[i];
                }
            }
        }

        // Find the maximum value in dp array
        int maxSum = 0;
        for (int sum : dp) {
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }


}
