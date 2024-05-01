import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);

        for(int i=0; i<dic.length; i++){

            int leng = dic[i].length();

            if(leng != spell.length) {
                continue;
            }
            else {
                String [] sp = dic[i].split("");
                Arrays.sort(sp);
                if(Arrays.equals(spell, sp)) {
                    return 1;
                }
            }
        }
        return answer;
    }
}