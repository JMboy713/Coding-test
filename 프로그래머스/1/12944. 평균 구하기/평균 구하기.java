class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double count=0;
        for(int num:arr){
            answer+=(double) num;
            count+=1;
        }
        return answer/count;
    }
}