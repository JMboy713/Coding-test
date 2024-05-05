class Solution {
    public int solution(int chicken) {
       int coupon= chicken;
       int answer=0;
        while(coupon>=10){
            answer+=coupon/10;
            int left = coupon%10;
            coupon = coupon/10+left;


        }
            return answer;
}
}