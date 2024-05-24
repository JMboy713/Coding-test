class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            if(divide_number(i)){
                answer+=i;
            }else{
                answer-=i;
            }
                
        }
        return answer;
    }
    
    public static boolean divide_number(int number){
        int value=0;// 최소 약수 개수 2개
        
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
                if(i*i==number){
                    value+=1;
                }else {
                    value+=2;
                }
            }
        }
        return value%2==0;
    }
}