class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        double medium = (double)total/num;
        
        if ((int)medium!=medium){
            medium+=0.5;
        }
        int start = (int)medium-(num/2);
        for(int i = 0;i<num;i++){
            answer[i]=(start++);
            
        }
        return answer;
    }
}