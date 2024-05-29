class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long intP = Long.parseLong(p);
        int tSize = t.length();
        int pSize = p.length();
        
        for(int i=0;i<=tSize-pSize;i++){
            long newNum = Long.parseLong(t.substring(i,i+pSize));
            if (newNum<=intP){
                answer+=1;
            }
        }
        return answer;
    }
}