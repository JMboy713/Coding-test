class Solution {
    public String solution(String s, int n) {
        String answer ="";
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch!=' '){
                int num=0;
            if(Character.isLowerCase(ch)){
                num = ((int) ch - (int)'a' +n)%26+(int)'a';
            }else{
                num = ((int) ch - (int)'A' +n)%26+(int)'A';
            }
            char newch = (char) num;
            answer+=newch;
            }else{
                answer+=" ";
            }
            
        }
        return answer;
    }
}