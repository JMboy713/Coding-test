import java.util.*;

class Solution {
    public String solution(String p){
        String answer = "";

        answer = recursive(p);

        return answer;
    }

    public String recursive(String p){
        if(p.equals("")){ // 1 비어있다면 빈 문자열
            return "";
        }else{
            int idx = balanceIndex(p);
            String u = p.substring(0,idx+1);
            String v = p.substring(idx+1,p.length());
            
            if(correctStr(u)){
                return u + recursive(v);
            }else{
                return '(' + recursive(v) + ')' + level4(u);
            }
        }
    }
    public int balanceIndex(String p){
        int open = 0;
        int close = 0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='('){
                open++;
            }else{
                close++;
            }
            if(open == close){
                return i;
            }
        }
        return 0;
    }
    
    public boolean correctStr(String u){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<u.length();i++){
            if(u.charAt(i)=='('){
                stack.push('(');
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;
    }
    public String level4(String u){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<u.length()-1;i++){
            if(u.charAt(i)=='('){
                sb.append(')');
            }else{
                sb.append('(');
            }
        }
        return sb.toString();
    }
    
}