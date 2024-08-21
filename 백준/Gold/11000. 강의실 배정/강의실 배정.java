

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;



/*수강신청의 마스터 김종혜 선생님에게 새로운 과제가 주어졌다.

김종혜 선생님한테는 Si에 시작해서 Ti에 끝나는 N개의 수업이 주어지는데, 최소의 강의실을 사용해서 모든 수업을 가능하게 해야 한다.

참고로, 수업이 끝난 직후에 다음 수업을 시작할 수 있다. (즉, Ti ≤ Sj 일 경우 i 수업과 j 수업은 같이 들을 수 있다.)

수강신청 대충한 게 찔리면, 선생님을 도와드리자!

입력
첫 번째 줄에 N이 주어진다. (1 ≤ N ≤ 200,000)

이후 N개의 줄에 Si, Ti가 주어진다. (0 ≤ Si < Ti ≤ 109)

출력
강의실의 개수를 출력하라.

입
3
1 3
2 4
3 5

출
2

*/


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strN = br.readLine();
        int N = Integer.parseInt(strN);
        List<lecture> lectures = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] siti = line.split(" ");
            lectures.add(new lecture(siti));
        }
        Collections.sort(lectures);
//        System.out.println(lectures);
        PriorityQueue<lecture> priorityQueue = new PriorityQueue<>((a, b) -> a.getEnd() - b.getEnd());


        for (lecture lecture : lectures) {
            if (priorityQueue.isEmpty()) {
                priorityQueue.add(lecture);
            }else{
                if (priorityQueue.peek().getEnd() > lecture.getStart()) {
                    priorityQueue.add(lecture);
                } else {
                    priorityQueue.remove();
                    priorityQueue.add(lecture);
                }
            }
        }
//        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());

        br.close();
    }
    public static class lecture implements Comparable<lecture>{
        private int start;
        private int end;

        public lecture(String[] lec) {
            this.start = Integer.parseInt(lec[0]);;
            this.end = Integer.parseInt(lec[1]);;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public int compareTo(lecture o) {
            if (this.start != o.getStart()) {
                return this.start-o.getStart();
            }
            return this.end - o.getEnd();

        }

        @Override
        public String toString() {
            return "lecture{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }


}

