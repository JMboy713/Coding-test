class Solution {
    public long solution(long n) {
        
        if(n==1){
            return 4;
        }
        
        for(long x =1;x<n/2;x++){
            if ((x*x)==n){
                return (x+1)*(x+1);
            }
        }
        return -1;
    }
}