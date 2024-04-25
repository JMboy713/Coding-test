class Solution {
    public int[][] solution(int[][] arr) {
        int sero = arr.length;  // 배열의 행의 개수
        int garo = arr[0].length;  // 배열의 열의 개수

        // 최대 길이를 정사각형의 한 변의 길이로 설정
        int maxSize = Math.max(garo, sero);

        // 정사각형 배열 초기화
        int[][] answer = new int[maxSize][maxSize];
        
        // 모든 값 0으로 초기화 (Java의 기본값은 0이므로 사실상 필요없는 과정)
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                answer[i][j] = 0;
            }
        }

        // 기존 배열의 값을 새 배열에 복사
        for (int i = 0; i < sero; i++) {
            for (int j = 0; j < garo; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
