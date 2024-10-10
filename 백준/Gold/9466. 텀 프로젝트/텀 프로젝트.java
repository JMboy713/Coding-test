
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] students;    // 학생들이 선택한 대상
    private static boolean[] visited; // 방문 여부
    private static boolean[] finished; // 사이클 여부 확인
    private static int count;         // 팀을 이룬 학생 수 카운트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine()); // 학생 수
            students = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            count = 0;

            String[] input = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                students[i] = Integer.parseInt(input[i - 1]); // 각 학생이 선택한 학생 번호
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                }
            }

            System.out.println(n - count); // 팀을 이루지 못한 학생 수 출력
        }
    }

    private static void dfs(int current) {
        visited[current] = true;
        int next = students[current]; // 현재 학생이 선택한 학생

        if (!visited[next]) { // 다음 학생이 아직 방문하지 않았으면
            dfs(next);
        } else if (!finished[next]) { // 사이클이 형성된 경우
            // 사이클에 속한 학생들을 셈
            for (int i = next; i != current; i = students[i]) {
                count++;
            }
            count++; // 현재 학생도 사이클에 포함
        }

        finished[current] = true; // 탐색 종료 표시
    }
}
