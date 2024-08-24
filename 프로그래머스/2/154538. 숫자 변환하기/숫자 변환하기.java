import java.util.*;

class Solution {
    // dp 문제
    public int solution(int x, int y, int n) {
        if(x==y){
            return 0;
        }
        Map<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<=y;i++){
            list.put(i,0);
        }
        list.put(x*2,1);
        list.put(x*3,1);
        list.put(x+n,1);
        for(Map.Entry<Integer, Integer> entry : list.entrySet()){
            if(entry.getValue()!=0){
                if(list.containsKey(entry.getKey()*2)){
                    if(list.get(entry.getKey()*2)==0){
                        list.put(entry.getKey()*2,entry.getValue()+1);
                    }else{
                        
                    
        list.put(entry.getKey()*2, Math.min( list.get(entry.getKey()*2),entry.getValue()+1));                       }
                }
                if(list.containsKey(entry.getKey()*3)){
                    if(list.get(entry.getKey()*3)==0){
                        list.put(entry.getKey()*3,entry.getValue()+1);
                    }else{
    list.put(entry.getKey()*3, Math.min( list.get(entry.getKey()*3),entry.getValue()+1));      
                    }
        
                }
                if(list.containsKey(entry.getKey()+n)){
                    if(list.get(entry.getKey()+n)==0){
                        list.put(entry.getKey()+n,entry.getValue()+1);
                    }else{
                    list.put(entry.getKey()+n, Math.min( list.get(entry.getKey()+n),entry.getValue()+1));    
                    }
                    
                }
            }
        }
        // System.out.println(list);
        
        
        
        
        return list.get(y)!=0 ? list.get(y) : -1;
    }
}