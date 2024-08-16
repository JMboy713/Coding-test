

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;




public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = (br.readLine().split(" ")); //
        int R = Integer.parseInt(nums[0]);
        int C = Integer.parseInt(nums[1]);
        int[][] numberMiro = new int[R][C];
        int[][] jihoonMiro = new int[R][C];
        String[][] miro = new String[R][C];

        for (int i = 0; i < R; i++) {
            String[] rows = br.readLine().split("");
            for (int j = 0; j < rows.length; j++) {
                if(rows[j].equals("#")){
                    numberMiro[i][j] = -1;
                    jihoonMiro[i][j] = -1;
                } else {
                    numberMiro[i][j] = 0;
                    jihoonMiro[i][j] = 0;
                }
            }
            miro[i] = rows;
        }
        int[] jihoon = new int[2];
        ArrayList<int[]> fires = new ArrayList<>();

        for (int i = 0; i < miro.length; i++) {
            for (int j = 0; j < miro[0].length; j++) {
                if(miro[i][j].equals("J")){
                    jihoon[0]=i;
                    jihoon[1]=j;
                } else if (miro[i][j].equals("F")) {
                    int[] fire = {i,j};
                    fires.add(fire);
                }
            }
        }
        int[][] numberMiro1 = new int[R][C];
        for (int[] fire : fires) {
             numberMiro1= bfs(numberMiro, fire);
            jihoonMiro[fire[0]][fire[1]] = -1;
        }



        int[][] numberMiro2 = bfs(jihoonMiro, jihoon);
        solution(numberMiro1,numberMiro2);


    }

    private static void solution(int[][] miro1, int[][] miro2) {
        int answer = Integer.MAX_VALUE; // integer 의 가질수 있는 최대값
        for (int i = 0; i < miro1.length; i++) {
            for (int j = 0; j < miro1[0].length; j++) {
                if (i == 0 || i == miro1.length - 1 || j == 0 || j == miro1[0].length - 1) {
                    if(miro1[i][j]==0 && miro2[i][j] > 0 ){
                        answer = miro2[i][j];
                    }
                    if (miro2[i][j] < miro1[i][j] && miro2[i][j] > 0 ) {
                        answer = Math.min(answer, miro2[i][j]);
                    }
                }
            }
        }
        if (answer == Integer.MAX_VALUE) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(answer);
        }

    }
    private static int[][] bfs(int[][] miro, int[] start){
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(start);
        miro[start[0]][start[1]]=1;


        while (!deque.isEmpty()) {
            int[] dot = deque.removeFirst();
            int x = dot[1];
            int y = dot[0];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx < 0 || nx >= miro[0].length || ny < 0 || ny >= miro.length) {
                    continue;
                }
                if(miro[ny][nx]==0 && miro[ny][nx]!=-1){
                    miro[ny][nx] = miro[y][x] + 1;
                    int[] plus = {ny, nx};
                    deque.add(plus);
                } else if (miro[ny][nx]!=-1 && miro[y][x] + 1 < miro[ny][nx]) {
                    miro[ny][nx] = miro[y][x] + 1;
                    int[] plus = {ny, nx};
                    deque.add(plus);
                }
            }
        }
//        for (int[] ints : miro) {
//            for (int anInt : ints) {
//                System.out.print(anInt);
//            }
//            System.out.println();
//        }
        return miro;


    }

}
