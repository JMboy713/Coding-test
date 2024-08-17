class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int col = land.length;
        int[][] scores = new int[col][land[0].length];
        scores[0] = land[0];
        
        
        for(int i=1;i<col;i++){
            // land[i]
            for(int j = 0 ; j<4;j++){
                if (j==0){
                   scores[i][j] = Math.max(Math.max(scores[i-1][1],scores[i-1][2]),scores[i-1][3])+land[i][j];
                }else if(j==1){
                    scores[i][j] = Math.max(Math.max(scores[i-1][0],scores[i-1][2]),scores[i-1][3])+land[i][j];
                }else if(j==2){
                    scores[i][j] = Math.max(Math.max(scores[i-1][0],scores[i-1][1]),scores[i-1][3])+land[i][j];
                }else if(j==3){
                    scores[i][j] = Math.max(Math.max(scores[i-1][1],scores[i-1][2]),scores[i-1][0])+land[i][j];
                }
            }
        }
        for(int num : scores[col-1]){
            if(num>answer){
                answer = num;
            }
        }
        
        return answer;
    }
}