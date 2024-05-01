class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] dot1 = dots[0];
        int[] dot2 = dots[1];
        int[] dot3 = dots[2];
        int[] dot4 = dots[3];
        int garo =0;
        int sero =0;
        
        for(int[] point:dots){
            if (dot1[0]==point[0]&dot1[1]!=point[1]){
                sero=point[1]-dot1[1];
                if(sero<0){
                    sero*=-1;
                }
            }else if(dot1[0]!=point[0]&dot1[1]==point[1]){
                garo=point[0]-dot1[0];
                if (garo<0){
                    garo*=-1;
                }
            }
        }
        
        return  garo*sero;
    }
}