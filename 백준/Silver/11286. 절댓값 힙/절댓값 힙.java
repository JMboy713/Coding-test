

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


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

        int n = Integer.parseInt(br.readLine()); //

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 첫 번째 조건: 절대값을 기준으로 비교
                int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));

                // 절대값이 같지 않다면 그 결과를 반환
                if (absCompare != 0) {
                    return absCompare;
                }

                // 두 번째 조건: 절대값이 같다면 실제 값을 기준으로 비교
                return Integer.compare(o1, o2);
            }
        });


        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(br.readLine());
            solution(priorityQueue, s);
        }
//        String[] values = br.readLine().split(" ");// 각 지방의 예산 요청
//        int maximum = Integer.parseInt(br.readLine());// 총 예산

//        System.out.println(solution);
    }
    private static void solution(PriorityQueue<Integer> p,int i){
        if (i==0){
            if (p.isEmpty()) {
                System.out.println(0);
            }else{
                System.out.println(p.poll());
            }
        }else{
            p.add(i);
        }


    }

}
