class Solution {
    public int solution(int[] arr) {
        int answer=0;
        // 최대공약수를 구한 다음 각 원소를 최대 공약수로 나누고 해당 값들의 전체 곱 * 최대공약수를 하면 된다. 
        if(arr.length==1){
            return arr[0];
        }else{
            int a=arr[0];
            answer=a;
        
        for(int i=1;i<arr.length;i++){
            int b=gcd(answer,arr[i]);
            answer=(arr[i]*answer)/b;
        }
            }
        return answer;
    }
    public int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}