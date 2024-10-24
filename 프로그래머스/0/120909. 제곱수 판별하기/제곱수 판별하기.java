class Solution {
    public int solution(int n) {
        
        double a = Math.sqrt(n);
        int num = (int) a;
        return num*num== n ? 1:2;
        
    }
}