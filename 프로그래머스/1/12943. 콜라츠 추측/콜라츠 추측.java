class Solution {
    public int solution(long num) {
        int answer = 0; // count
        while(num!=1& answer<500){
            num = collatz(num);
            answer++;
        }
        return answer!=500?answer:-1;
    }
    
    
    public static long collatz(long num){
        if(num%2==0){
            return num/2;
        }else{
            return (num*3)+1;
        }
    }
}