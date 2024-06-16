import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = bandage[0];
        int heal = bandage[1];
        int alphaHeal = bandage[2];
        int maxhealth = health;
        
        int lastAttack= attacks[attacks.length-1][0];
        Map<Integer,Integer> att = new HashMap<>();
        for(int[] attack : attacks){
            att.put(attack[0],attack[1]);
        }

        int count=0;
        for(int i=0;i<=lastAttack;i++){
            if(att.containsKey(i)){
                health -= att.get(i);
                count=0;
                if(health<=0){
                    return -1;
                }
            }else{
                count+=1;
                health = health+heal > maxhealth ? maxhealth : health+heal;
                if(count==time){
                    health = health+alphaHeal > maxhealth ? maxhealth : health+alphaHeal;
                    count=0;
                }
            }
        }
        
        return health;
    }
}