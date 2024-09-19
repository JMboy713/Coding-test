// 가장 많이 함께 주문한 단품 -> 세트메뉴
// 최소 2가지 이상의 단품메뉴. 
// 2명이상의 손님으로부터 주문된 메뉴에 대해서만 후보. 


// 백트래킹으로 각 order에 대해 나올 수 있는 문자열을 만들어 map에 만든다 => 이떄 course의 길이와 같다면, . 이후 entry set에서 course와 길이가 같은것에 대해서만 꺼내서 result 에 더한다. 

import java.util.*;

class Solution {
    static Queue<String> q = new LinkedList<>();
    static Map<String,Integer> map = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        
        List<String> ans = new ArrayList<>();
        
        
        for(String order : orders){
            char[] c = order.toCharArray();
            Arrays.sort(c);
            for(int num : course){
                backTracking(c,new StringBuilder(),0,num);
            }
        }
        
        
        for(int c : course){
            int max = 2;
            List<String> list = new ArrayList<>();
            
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue()>max && entry.getKey().length()==c){
                    max = entry.getValue();
                    list.clear();
                    list.add(entry.getKey());
                }else if(entry.getValue()==max&& entry.getKey().length()==c){
                    list.add(entry.getKey());
                }
            }
            for(String s : list){
                ans.add(s);
            }
        }
        Collections.sort(ans);
        String[] answer = new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i]=ans.get(i);
        }
        
        
        

        return answer;
    }
    
    public void backTracking(char[] chars, StringBuilder current,int index, int targetNumber){
        if(current.length()==targetNumber){
            String str = current.toString();
            map.put(str,map.getOrDefault(str,0)+1);
            return;
        }
        
        for(int i= index;i<chars.length;i++){
            current.append(chars[i]);
            backTracking(chars,current,i+1,targetNumber);
            current.deleteCharAt(current.length()-1);
        }
    }
}