class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = (long) x;
        int count=0;
        for(int i=0;i<n;i++){
            answer[count]=num;
            num+=x;
            count+=1;
        }
        return answer;
    }
}