import java.util.*;

class Solution {
    // 선물 지수 : 준선물 - 받은 선물 수
    // 선물 지수도 같다면 주고받지 않음
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String,Integer> present = new HashMap<>();
        Map<String,Integer> presentScore = new HashMap<>();
        for(String fr : friends){
            presentScore.put(fr,0); // 선물 지수 넣을 map
            present.put(fr,0);
        }
        for(String gift:gifts){
            String[] giftList = gift.split(" ");
            presentScore.put(giftList[0],presentScore.get(giftList[0])+1); // giver
            presentScore.put(giftList[1],presentScore.get(giftList[1])-1); // reciever
        }
        
        for(int i=0;i<friends.length;i++){
            for(int j=i+1;j<friends.length;j++){
                String firstCase = friends[i]+" "+friends[j];
                String secondCase = friends[j]+" "+friends[i];
                int case1 =0;
                int case2 =0;
                
                for(String gift:gifts){
                    if(firstCase.equals(gift)){
                        case1++;
                    }else if(secondCase.equals(gift)){
                        case2++;
                    }
                }
                if(case1>case2){ // 1번 사람이 더 많이 줬을 경우
                    present.put(friends[i],present.get(friends[i])+1);
                }else if(case2>case1){ // 2번사람이 더 많이 줬을 경우
                    present.put(friends[j],present.get(friends[j])+1);
                }else{ // 선물 지수 판단
                    if(presentScore.get(friends[i])>presentScore.get(friends[j])){
                        present.put(friends[i],present.get(friends[i])+1);
                    }else if(presentScore.get(friends[j])>presentScore.get(friends[i])){
                        present.put(friends[j],present.get(friends[j])+1);
                    }
                }
                
            }
        }
        
        return Collections.max(present.values());
    }
}