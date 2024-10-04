import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수
        for (int t = 0; t < T; t++) {  // 각 테스트 케이스에 대해 반복
            String NK = br.readLine();
            String[] line = NK.split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            int[][] ground = new int[N][N];
            
            for(int i = 0; i < N; i++) {
                String[] gg = br.readLine().split(" ");
                for(int j = 0; j < N; j++) {
                    ground[i][j] = Integer.parseInt(gg[j]);
                }
            }
            
            int ans = purchase(ground, K);
            System.out.println(ans);  // 각 테스트 케이스의 결과 출력
        }
    }

    public static int purchase(int[][] ground, int K) {
        int minSum = Integer.MAX_VALUE;  // 최소값을 찾기 위한 초기값 설정
        
        // KxK 부분 배열의 최소 합 구하기
        for (int i = 0; i <= ground.length - K; i++) {
            for (int j = 0; j <= ground[0].length - K; j++) {
                int currentSum = 0;
                
                // KxK 크기 부분 배열의 합 계산
                for (int x = 0; x < K; x++) {
                    for (int y = 0; y < K; y++) {
                        currentSum += ground[i + x][j + y];
                    }
                }
                
                // 현재 부분합과 최소값 비교
                minSum = Math.min(minSum, currentSum);
            }
        }
        return minSum;
    }
}
