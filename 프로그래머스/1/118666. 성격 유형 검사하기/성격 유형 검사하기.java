import java.util.*;

class Solution {
    static Map<String,Integer> point = new HashMap<>();
    
    public String solution(String[] survey, int[] choices) {
        pointSet();
        // 첫번째 - 비동의 두번째 - 동의시 캐릭터    
        String answer = "";
        
        for(int i=0;i<choices.length;i++){
            if(choices[i]>4){ // 동의 
                char ch = survey[i].charAt(1);
                String st =""+ch;
                point.put(st,point.get(st)+choices[i]-4);
            }else if(choices[i]<4){
                char ch = survey[i].charAt(0);
                String st =""+ch;
                point.put(st,point.get(st)+4-choices[i]);
            }
        }
        return selectPersonality(point);
    }
    
    public static void pointSet(){
        point.put("R",0);
        point.put("T",0);
        point.put("C",0);
        point.put("F",0);
        point.put("J",0);
        point.put("M",0);
        point.put("A",0);
        point.put("N",0);        
    }
    public String selectPersonality(Map<String,Integer> point){
        StringBuilder sb = new StringBuilder();
        if(point.get("R")>=point.get("T")){
            sb.append("R");
        }else{
            sb.append("T");
        }
        if(point.get("C")>=point.get("F")){
            sb.append("C");
        }else{
            sb.append("F");
        }
        if(point.get("J")>=point.get("M")){
            sb.append("J");
        }else{
            sb.append("M");
        }
        if(point.get("A")>=point.get("N")){
            sb.append("A");
        }else{
            sb.append("N");
        }
        return sb.toString();
        
    }
}