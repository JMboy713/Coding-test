class Solution {
    public String solution(int n) {
        String answer = "";
                boolean bool = true;
        while(n!=0){
            String str = bool?"수":"박";
            bool = invert(bool);
            answer+=str;
            n--;
        }
        return answer;
    }
     public static boolean invert(boolean value) {
        return !value;
    }

}