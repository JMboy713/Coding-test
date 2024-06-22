// 문제 풀이 솔루션 
// 약수를 구해서 나누어지는 것이라면 ((가로+2) *2) + ((세로 +2) *2)-4 가 갈색의 수와 같다면, 정답임. 

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2] ;
        
        for(int i=1;i<=Math.sqrt(yellow);i++){
            if(yellow%i==0){
                int b = yellow/i; // 나머지
                if((b+2)*2+(i+2)*2-4 == brown){
                    if(i>=b){
                        answer[0]=i+2;
                        answer[1]=b+2;
                    }else{
                        answer[1]=i+2;
                        answer[0]=b+2;
                    }
                }
            }
        }
        
        
        return answer;
    }
}