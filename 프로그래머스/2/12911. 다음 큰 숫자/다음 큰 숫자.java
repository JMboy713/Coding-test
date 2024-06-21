class Solution {
    public int solution(int n) {
        int binN = bin(n);
        int i=n+1;
        while(binN!=bin(i)){
            i++;
        }
        
        return i;
    }
    
    public static int bin(int num){
        int one = 0;
        while (num>0){
            int left=num%2;
            if (left==1){
                one++;
            }
            num=num/2;
        }
        return one;
    }
}