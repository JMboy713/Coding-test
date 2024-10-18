
import java.io.*;
import java.util.*;




/*
FSGUD
F : 층으로 이루어진 건물
G : 목적지
강호 : S
U, D
* */


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] numbers = line.split(" ");
        int F = Integer.parseInt(numbers[0]);
        int S = Integer.parseInt(numbers[1]);
        int G = Integer.parseInt(numbers[2]);
        int U = Integer.parseInt(numbers[3]);
        int D = Integer.parseInt(numbers[4]);

        int ans = bfs(F, S, G, U, D);
        if (ans == -1) {
            System.out.println("use the stairs");
        }else{
            System.out.println(ans);
        }

    }

    private static int bfs(int f, int s, int g, int u, int d) {
        boolean[] building = new boolean[f + 1]; // 건물의 각 층 방문 여부를 저장하는 배열
        Queue<Node> q = new LinkedList<>();
        Node node = new Node(s, 0);
        building[s] = true; // 시작 층은 방문했음
        q.add(node);

        while (!q.isEmpty()) {
            Node current = q.poll();
            int stair = current.stair;
            int count = current.count;

            if (stair == g) {
                return count; // 목적지에 도달했을 때
            }

            // 올라가는 경우
            if (stair + u <= f && !building[stair + u]) {
                building[stair + u] = true;
                q.add(new Node(stair + u, count + 1));
            }

            // 내려가는 경우
            if (stair - d > 0 && !building[stair - d]) {
                building[stair - d] = true;
                q.add(new Node(stair - d, count + 1));
            }
        }

        return -1; // 목적지에 도달할 수 없을 경우
    }



    static class Node{
        public int stair;
        public int count;

        public Node(int stair, int count) {
            this.stair = stair;
            this.count = count;
        }
    }
}

