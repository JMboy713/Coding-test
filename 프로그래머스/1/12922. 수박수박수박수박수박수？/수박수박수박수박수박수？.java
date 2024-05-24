class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=1;i<=n;i++){
            String str = (i%2==1)?"수":"박";
            answer+=str;
        }        
        
        return answer;
    }


}