

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*예산*/
/*
* 국가의 예산을 분배.
* 가능한 한 최대의 총 예산 배정
* 1. 모든 요청이 배정될 수 있는 경우 그대로 배정
* 2. 모든 요청이 배정될 수 없는 경우 상한액을 계산하여 배정, 이하에 대해서는 그대로 배정.
* */


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 지방의 수
        String[] values = br.readLine().split(" ");// 각 지방의 예산 요청
        int maximum = Integer.parseInt(br.readLine());// 총 예산
        int solution = solution(n, values, maximum);
        System.out.println(solution);
    }
    private static int solution(int n,String[] list, int maximum){

        int[] values = new int[n];

        for (int i = 0; i < list.length; i++) {
            values[i] = Integer.parseInt(list[i]);
        }

        int sumAll=0;
        int max = 0;
        int min = 0;
        for (int value : values) {
            sumAll += value;
            if (max < value) {
                max = value;
            }
        }



        if (sumAll < maximum) {
            return max;
        }


        int answer = 0;
        while (min<=max) {
            int mid = (max + min) / 2;
            int sum = 0;
            for (int value : values) {
                int num = value;
                sum += Math.min(num, mid);
            }
            if (sum <= maximum) {
                answer = mid;
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return answer;
    }

}
