import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        Map<Integer,Integer> xmap = new HashMap<>();
        Map<Integer,Integer> ymap = new HashMap<>();

        for(int i=0;i<10;i++){
            xmap.put(i,0);
            ymap.put(i,0);
        }        
        
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        for(char x : xArr){
            int a=Character.getNumericValue(x) ;
            xmap.put(a,xmap.get(a)+1);
        }
        for(char y : yArr){
            int b=Character.getNumericValue(y);
            ymap.put(b,ymap.get(b)+1);
        }
        

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xmap.get(i), ymap.get(i));
            for (int j = 0; j < min; j++) {
                sb.append(i);
            }
        }
        answer = sb.toString();
        
        if(answer.equals("")){
            return "-1";
        }else if(answer.charAt(0)=='0'){
            return "0";
        }else{
            return answer;
        }
            
        
        
        
    }
}