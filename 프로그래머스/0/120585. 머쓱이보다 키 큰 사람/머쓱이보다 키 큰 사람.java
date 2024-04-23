class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int man : array){
            if(man>height){
                answer+=1;
            }
        }
        return answer;
    }
}