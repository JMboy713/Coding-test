import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int sero=0;sero<park.length;sero++){
            String line =park[sero];
            for(int garo=0;garo<line.length();garo++){
                if(line.charAt(garo)=='S'){
                    answer[0]=sero;
                    answer[1]=garo;
                }
            }
        }
        
        System.out.print(answer[0]);
        System.out.println(answer[1]);
        System.out.println("시작점");
        
        for(String route : routes){
            String[] dummy =route.split(" ");
            answer = move(answer,dummy[0],Integer.parseInt(dummy[1]),park);
            System.out.print(answer[0]);
            System.out.println(answer[1]);
        }
        
        return answer;
    }
    
    
    public int[] move(int[] dot ,String direction, Integer count,String[] park){
        int sero = dot[0];
        int garo = dot[1];
        try{
            
        
        if(direction.equals("E")){
            for(int i=0;i<count;i++){
                if(park[sero].charAt(garo+1)!='X'){
                    garo+=1;    
                }else{
                    throw new Exception();
                }
            }
        }else if(direction.equals("W")){
            for(int i=0;i<count;i++){
                if(park[sero].charAt(garo-1)!='X'){
                    garo-=1;    
                }else{
                    throw new Exception();
                }
            }
            
        }else if(direction.equals("N")){
            for(int i=0;i<count;i++){
                if(park[sero-1].charAt(garo)!='X'){
                    sero-=1;
                }else{
                    throw new Exception();
                }
            }
            
        }else if(direction.equals("S")){
            for(int i=0;i<count;i++){
                if(park[sero+1].charAt(garo)!='X'){
                    sero+=1;
                }else{
                    throw new Exception();
                }
            }   
        }
       int[] ans = new int[2];
        ans[0]=sero;
        ans[1]=garo;
        return ans;
    }catch(Exception e){
        return dot;
        }
    }

}