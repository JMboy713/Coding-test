class Solution {
    public int solution(int n) {
        int answer = n-1;// 1은 소수가 아니기 때문. 
        for(int i =2;i<=n;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}