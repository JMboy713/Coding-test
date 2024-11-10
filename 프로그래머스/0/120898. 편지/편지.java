class Solution {
    public int solution(String message) {
        int answer = 0;
        for(char str : message.toCharArray()){
            answer+=2;
        }
        return answer;
    }
}