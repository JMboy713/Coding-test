import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer="Yes";
        ArrayList<String> card1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> card2 = new ArrayList<>(Arrays.asList(cards2));
        for(String voca:goal){
            if(card1.size()>0&&card1.get(0).equals(voca)){
                card1.remove(voca);
            }else if(card2.size()>0&&card2.get(0).equals(voca)){
                card2.remove(voca);
            }else{
                answer="No";
                break;
            }
        }
        
        
        return answer;
    }
}