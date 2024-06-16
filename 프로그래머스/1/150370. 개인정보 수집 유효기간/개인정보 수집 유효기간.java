import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String,Integer> term = new HashMap<>();
        List<Integer> fire = new ArrayList<>();
        
        
        for(String te : terms){
            String[] teList = te.split(" ");
            term.put(teList[0],Integer.parseInt(teList[1]));
        }
        System.out.println(term);
        
        
        
        String[] todayList = today.split("\\.");
        
        int year_t = Integer.parseInt(todayList[0]);
        int month_t = Integer.parseInt(todayList[1]);
        int day_t = Integer.parseInt(todayList[2]);
        
        for(int i=0;i<privacies.length;i++){
            String[] privacyList = privacies[i].split(" ");
            int mon = term.get(privacyList[1]);
            int year = Integer.parseInt(privacyList[0].split("\\.")[0]);
            int month = Integer.parseInt(privacyList[0].split("\\.")[1]);
            int day = Integer.parseInt(privacyList[0].split("\\.")[2]);
            
            month+=mon;
            day-=1;
            
            if(day==0){
                month-=1;
                day+=28;
            }
            while(month>12){
                year+=1;
                month-=12;
            }
            if(year<year_t){
                fire.add(i+1);
            }
            if(year==year_t && month<month_t){
                fire.add(i+1);
            }
            if(year==year_t && month==month_t&day<day_t){
                fire.add(i+1);
            }
        }
        int[] answer = new int[fire.size()];
        for(int i=0;i<fire.size();i++){
            answer[i]=fire.get(i);
        }
        
        
        return answer;
    }
}