import java.util.*;

class Solution {
    static Queue<Node> q = new LinkedList<>();

    public int solution(int N, int[][] road, int K) {
        int answer = 0; // 1번 마을에서 시작하면 무조건 갈 수 있음
        int[] costs = new int[N+1];  // 각 마을에 도달하는 최소 비용을 저장
        Arrays.fill(costs, Integer.MAX_VALUE);  // 처음에 매우 큰 값으로 초기화
        costs[1] = 0;  // 1번 마을에서 출발, 비용은 0
        
        // 인접 리스트 생성 (마을 간 도로 정보를 저장)
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] r : road) {
            adj.get(r[0]).add(new int[]{r[1], r[2]});  // r[0]에서 r[1]까지, 비용 r[2]
            adj.get(r[1]).add(new int[]{r[0], r[2]});  // r[1]에서 r[0]까지, 비용 r[2] (양방향)
        }

        // BFS를 위한 큐
        q.add(new Node(1, 0));  // 1번 마을에서 출발, 비용은 0

        while (!q.isEmpty()) {
            Node n = q.poll();
            int dot = n.dot;
            int cost = n.cost;

            // 현재 마을에서 연결된 마을을 탐색
            for (int[] next : adj.get(dot)) {
                int nextNode = next[0];
                int nextCost = cost + next[1];

                // 더 적은 비용으로 해당 마을에 도달할 수 있으면 업데이트
                if (nextCost < costs[nextNode]) {
                    costs[nextNode] = nextCost;
                    q.add(new Node(nextNode, nextCost));
                }
            }
        }

        // K 이하의 비용으로 갈 수 있는 마을의 개수를 셈
        for (int i = 1; i <= N; i++) {
            if (costs[i] <= K) {
                answer++;
            }
        }

        return answer;
    }

    class Node {
        public int dot;
        public int cost;

        public Node(int dot, int cost) {
            this.dot = dot;
            this.cost = cost;
        }
    }
}
