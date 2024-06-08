import java.util.*;

class Solution {
    public int solution(String dartResult) {
        Deque<Integer> ans = new ArrayDeque<>();
        String number ="";
        char[] dr = dartResult.toCharArray();
        for(char dart : dr){
            try{
                String dummy ="";
                int num = Integer.parseInt(dummy+dart);
                number+=num;
            }catch(Exception e){
                if(dart=='S'){
                    ans.add(Integer.parseInt(number));
                    number="";
                }else if(dart=='D'){
                    int newnum = Integer.parseInt(number);
                    ans.add(newnum*newnum);
                    number="";
                }else if(dart=='T'){
                    int newnum = Integer.parseInt(number);
                    ans.add(newnum*newnum*newnum);
                    number="";
                }else if(dart=='*'){
                    int first = ans.pollLast()*2;
                    if(!ans.isEmpty()){
                        int second = ans.pollLast()*2;
                        ans.add(second);
                    }
                    ans.add(first);
                }else if(dart=='#'){
                    int first = ans.pollLast()*-1;
                    ans.add(first);
                    
                }
                
            }
            
            
        }
        int answer = 0;
            for(int i : ans){
                answer+=i;
            }
        return answer;
    }
}