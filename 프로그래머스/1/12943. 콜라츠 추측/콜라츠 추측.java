class Solution {
    public int solution(int num) {
        int answer = 0; // count
        while(num!=1& answer<500){
            num = collatz(num);
            answer+=1;
        }
        return answer<400?answer:-1;
    }
    
    
    public static int collatz(int num){
        if(num%2==0){
            return num/2;
        }else{
            return num*3+1;
        }
    }
}