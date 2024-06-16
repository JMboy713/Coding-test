import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> ranking = new HashMap<>();
        for(int i =0;i<players.length;i++){
            ranking.put(players[i],i);
        }
        for(String i : callings){
            int before = ranking.get(i)-1;
            int call =ranking.get(i);
            ranking.put(i,ranking.get(i)-1);
            ranking.put(players[before],ranking.get(players[before])+1);
            String dummy = players[before];
            players[before]=players[call];
            players[call] = dummy;
        }
        return players;
    }
}