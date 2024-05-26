class Solution {
    public int[] solution(int n, int m) {
        int gcd_num = gcd(n,m);
        // System.out.println(gcd_num);
        int maxi=n*m/gcd_num;
        int[] answer = {gcd_num,maxi};
        return answer;
    }
    public static int gcd(int a,int b){
        if (a % b==0){
            return b;
        }else{
            return gcd(b,a%b);
        }           
    }
}