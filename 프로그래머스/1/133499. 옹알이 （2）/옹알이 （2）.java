import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> speak = new ArrayList<>();
        ArrayList<String> notSpeak = new ArrayList<>();
        speak.add("aya");
        speak.add("ye");
        speak.add("woo");
        speak.add("ma");
        notSpeak.add("ayaaya");
        notSpeak.add("yeye");
        notSpeak.add("woowoo");
        notSpeak.add("mama");
        
        for(String bab : babbling){
            for (String j : speak){
                for(String l : notSpeak){
                    if (bab.contains(l)){
                        bab=bab.replace(l,"a");
                    }
                }if(bab.contains(j)){
                    bab=bab.replace(j,"1");
                }
            }
            System.out.println(bab);
            if(isNumber(bab)){
                answer++;
            }
            
            
        }
        
        
        return answer;
        
    }
    public static boolean isNumber (String a){
        return a.chars().allMatch(Character::isDigit);
    }
}
    