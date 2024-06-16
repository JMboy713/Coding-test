import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String,Integer> blackList = new HashMap<>();
        Map<String,Integer> banCount = new HashMap<>();
        for(String i :id_list){
            blackList.put(i,0);
            banCount.put(i,0);
        }
        
        Set<String> reportSet = new HashSet<>();
        for(String re : report){
            reportSet.add(re);
        }
        for(String i : reportSet){
            String[] a =i.split(" ");
            blackList.put(a[1],blackList.get(a[1])+1);
        }
        ArrayList<String> banned = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : blackList.entrySet()) {
        	if(entry.getValue()>=k){
                banned.add(entry.getKey());
            }
        }
        
        for(String i : reportSet){
            String[] a =i.split(" ");
            if(banned.contains(a[1])){
                banCount.put(a[0],banCount.get(a[0])+1);
            }
        }
        System.out.println(banCount);
        
        int[] answer = new int[banCount.size()];
        int count=0;
        for (String id:id_list) {
            answer[count]=banCount.get(id);
            count++;
        }
        return answer;
    }
}