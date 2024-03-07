class Solution {
    public int[][] solution(int n) {
         int[][] answer = new int[n][n];
        int direction = 1;
        /*direction
        1: right
        2: down
        3: left
        4: up
        */
        int x = 0, y = 0;
        for (int i = 0; i < n*n ; i++) {
            answer[x][y] = i+1;
            if (direction==1) {
                if (y+1 < n && answer[x][y+1] == 0) {
                    y += 1;
                }else{
                    direction = 2;
                    x += 1;
                }
            } else if (direction==2) {
                if (x+1 < n && answer[x+1][y] == 0) {
                    x += 1;
                }else{
                    direction = 3;
                    y -= 1;
                }
            } else if (direction==3) {
                if (y - 1 >= 0 && answer[x][y - 1] == 0) {
                    y -= 1;
                } else {
                    direction = 4;
                    x -= 1;
                }
            }else {
                    if (x-1 >= 0 && answer[x-1][y] == 0) {
                        x -= 1;
                    }else{
                        direction = 1;
                        y += 1;
                    }
                }

            }



        return answer;
        }
}