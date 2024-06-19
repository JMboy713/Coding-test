class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Boolean firstletter =true;
        char[] arr =s.toCharArray();
        for(char voca : arr){
            if(voca!=' '&&firstletter){
                String a =""+voca;
                answer.append(a.toUpperCase());
                firstletter = false;
            }else if(voca!=' '&&!firstletter){
                String a =""+voca;
                answer.append(a.toLowerCase());
            }else if(voca==' '){
                answer.append(" ");
                firstletter=true;
            }
        }
        
        
        return answer.toString();
    }
}