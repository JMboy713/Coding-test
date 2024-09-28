import java.util.*;

class Solution {
    static int[][] graph;

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        graph = new int[rows][columns];
        
        // 배열 초기화
        int num = rows * columns;
        for (int i = 1; i <= num; i++) {
            int row = (i - 1) / columns;  // 열의 개수를 기준으로 행을 계산
            int column = (i - 1) % columns;  // 열의 나머지를 이용해 열을 계산
            graph[row][column] = i;
        }

        
        // 쿼리마다 회전 수행
        int count = 0;
        for (int[] query : queries) {
            int number = rotate(query);
            answer[count] = number;
            count++;
        }
        
        return answer;
    }
    
    // 주어진 쿼리에 맞게 회전하면서 최소값을 반환하는 함수
    public int rotate(int[] query) {
        int x1 = query[0] - 1; //2
        int y1 = query[1] - 1; //2
        int x2 = query[2] - 1; //5
        int y2 = query[3] - 1; //4
        
        int temp = graph[x1][y1]; // 시작 지점의 값을 저장
        int minValue = temp; // 최소값 초기화

        // 왼쪽 밑에서 위로 올라옴. 
        for (int i = x1; i < x2; i++) {
            graph[i][y1] = graph[i + 1][y1];
            minValue = Math.min(minValue, graph[i][y1]);
        }

        // 아래쪽 행 왼쪽으로 이동
        for (int i = y1; i < y2; i++) {
            graph[x2][i] = graph[x2][i + 1];
            minValue = Math.min(minValue, graph[x2][i]);
        }

        // 오른쪽 열 밑으로 이동
        for (int i = x2; i > x1; i--) {
            graph[i][y2] = graph[i - 1][y2];
            minValue = Math.min(minValue, graph[i][y2]);
        }

        // 위쪽 행 오른쪽으로 이동
        for (int i = y2; i > y1; i--) {
            graph[x1][i] = graph[x1][i - 1];
            minValue = Math.min(minValue, graph[x1][i]);
        }

        graph[x1][y1 + 1] = temp; // 마지막 이동에 저장했던 값을 넣어줌
        
        return minValue; // 최소값 반환
    }
}
